package google.codelabs.weatherapplication.repository.forecast

import android.location.Geocoder
import google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity
import google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.di.ApplicationScope
import google.codelabs.weatherapplication.network.forecast.ForecastNetworkService
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity
import google.codelabs.weatherapplication.network.forecast.entities.OneCallData
import google.codelabs.weatherapplication.repository.forecast.entities.*
import google.codelabs.weatherapplication.repository.utils.allCityForecastEntity_to_CityListWeather
import google.codelabs.weatherapplication.repository.utils.toDailyForecastEntity
import google.codelabs.weatherapplication.repository.utils.toHourlyForecastEntity
import google.codelabs.weatherapplication.screen.cityweather.utils.*
import kotlinx.coroutines.flow.*
import java.io.IOException
import javax.inject.Inject

@ApplicationScope
class ForecastRepository @Inject constructor(
    private val dailyForecastDao: DailyForecastDao,
    private val hourlyForecastDao: HourlyForecastDao,
    private val forecastNetworkService: ForecastNetworkService,
    private val geocoder: Geocoder,
) : CityForecastDataProvider, CityExistence, CityListDataProvider {

    override fun currentWeather(city: String): Flow<List<CurrentWeatherEntity>> =
        hourlyForecastDao.currentWeather(
            city,
            currentUnixTime()
        )

    override fun hourlyForecast(city: String): Flow<List<HourlyForecastEntity>> =
        hourlyForecastDao.cityForecast(city, currentUnixTime())

    override fun dailyForecast(city: String): Flow<List<DailyForecastEntity>> =
        dailyForecastDao.cityForecast(city, currentUnixDay(0))

    override suspend fun addCity(city: String): UpdateResult =
        updateData(city)

    override suspend fun checkCityExistence(city: String): CityAddressResult {
        val responseResult = fetchData(city)
        val cityAddress = responseResult.oneCallData?.let {
            CityAddress(
                city = it.city,
                country = it.country
            )
        }

        return CityAddressResult(
            result = responseResult.result,
            cityAddress = cityAddress
        )
    }

    override suspend fun updateData(city: String): UpdateResult {
        val response = fetchData(city)
        if (response.result == UpdateResult.SUCCESSFUL) updateDBFrom(response.oneCallData!!)
        return response.result
    }

    override fun allCityWeather(): Flow<List<CityWeather>> {
        val time = currentUnixTime()
        val cityList = dailyForecastDao.allCityForecast(time - currentTimeZoneOffset())
        val currentWeatherList =
            hourlyForecastDao.allCityCurrentWeather(time)


        return cityList.map { allCityForecast ->
            allCityForecast.filter {
                dateWithoutHours(it.dt) == dateWithoutHours(time, it.timezone_offset)
            }.map(::allCityForecastEntity_to_CityListWeather)
//          Log.d(TAG, "${dateWithoutHours(it.dt)}, ${dateWithoutHours(time, it.timezone_offset)}")

        }.combine(currentWeatherList) { allCityWeather, currentWeather ->
            currentWeather.mapNotNull {
                allCityWeather.find { cityWeather -> cityWeather.city == it.city }
                    ?.copy(current_temp = it.temp, icon = it.icon)
            }
        }
    }

    private suspend fun fetchData(city: String): NetworkResponseResult {
        try {
            cityCoordinates(city, geocoder)!!
        } catch (e: IOException) {
            return NetworkResponseResult(null, UpdateResult.NO_INTERNET_CONNECTION)
        } catch (e: Exception) {
            return NetworkResponseResult(null, UpdateResult.NO_RESPONSE)
        }

        val oneCallData =
            forecastNetworkService.fetchOneCallData(city) ?: return NetworkResponseResult(
                null,
                UpdateResult.NO_RESPONSE
            )

        return NetworkResponseResult(oneCallData, UpdateResult.SUCCESSFUL)
    }

    private suspend fun updateDBFrom(oneCallData: OneCallData) {
        dailyForecastDao.deleteCity(oneCallData.city)
        dailyForecastDao.insert(toDailyForecastEntity(oneCallData))

        hourlyForecastDao.deleteCity(oneCallData.city)
        hourlyForecastDao.insert(toHourlyForecastEntity(oneCallData))
    }

    private suspend fun isDataUpToDate(city: String): Boolean {
        val lastUpdate = hourlyForecastDao.lastUpdate(city)
        return lastUpdate.isNotEmpty() && lastUpdate[0] == currentUnixTime()
    }

    companion object {
        private const val TAG = "ForecastRepository"
    }
}