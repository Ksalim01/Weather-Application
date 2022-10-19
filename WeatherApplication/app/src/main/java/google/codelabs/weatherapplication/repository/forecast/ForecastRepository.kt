package google.codelabs.weatherapplication.repository.forecast

import android.location.Geocoder
import android.util.Log
import google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity
import google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.network.forecast.ForecastNetworkService
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity
import google.codelabs.weatherapplication.network.forecast.entities.OneCallData
import google.codelabs.weatherapplication.repository.forecast.entities.CityListWeather
import google.codelabs.weatherapplication.repository.utils.allCityForecastEntity_to_CityListWEather
import google.codelabs.weatherapplication.repository.utils.toDailyForecastEntity
import google.codelabs.weatherapplication.repository.utils.toHourlyForecastEntity
import google.codelabs.weatherapplication.screen.cityweather.utils.*
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ForecastRepository @Inject constructor(
    private val dailyForecastDao: DailyForecastDao,
    private val hourlyForecastDao: HourlyForecastDao,
    private val forecastNetworkService: ForecastNetworkService,
    private val geocoder: Geocoder,
) : CityForecastDataProvider, CityAdding, CityListDataProvider {

    override suspend fun currentWeather(city: String): List<CurrentWeatherEntity> =
        hourlyForecastDao.currentWeather(
            city,
            currentUnixTime()
        )

    override suspend fun hourlyForecast(city: String): List<HourlyForecastEntity> =
        hourlyForecastDao.cityForecast(city)

    override suspend fun dailyForecast(city: String): List<DailyForecastEntity> =
        dailyForecastDao.cityForecast(city)

    override suspend fun addCity(city: String): UpdateResult =
        updateData(city)

    override suspend fun checkCityExistence(city: String): UpdateResult = fetchData(city).result

    override suspend fun updateData(city: String): UpdateResult {
        val response = fetchData(city)
        if (response.result == UpdateResult.SUCCESSFUL) updateDBFrom(response.oneCallData!!)
        return response.result
    }

    override suspend fun cityList(): List<CityListWeather> {
        val time = currentTime(0)
        val cityList = dailyForecastDao.allCityForecast(time)
        val currentWeatherList =
            hourlyForecastDao.allCityCurrentWeather(currentUnixTime() - currentTimeZoneOffset())

        val cityMap = mutableMapOf<String, CityListWeather>()
        cityList.filter {
            dateWithoutHours(it.dt) == dateWithoutHours(currentUnixTime(), it.timezone_offset)
        }.map {
            cityMap.put(it.city, allCityForecastEntity_to_CityListWEather(it))
        }

        currentWeatherList.map {
            cityMap[it.city] = cityMap[it.city]!!.copy(current_temp = it.temp, icon = it.icon)
        }

        return cityMap.values.toList()
    }

    private suspend fun fetchData(city: String): NetworkResponse {
        try {
            cityCoordinates(city, geocoder)!!
        } catch (e: IOException) {
            return NetworkResponse(null, UpdateResult.NO_INTERNET_CONNECTION)
        } catch (e: Exception) {
            return NetworkResponse(null, UpdateResult.NO_RESPONSE)
        }

        val oneCallData = forecastNetworkService.fetchOneCallData(city)
        if (oneCallData == null) return NetworkResponse(null, UpdateResult.NO_RESPONSE)

        return NetworkResponse(oneCallData, UpdateResult.SUCCESSFUL)
    }

    private suspend fun updateDBFrom(oneCallData: OneCallData) {
        dailyForecastDao.deleteCity(oneCallData.city)
        dailyForecastDao.insert(toDailyForecastEntity(oneCallData))

        hourlyForecastDao.deleteCity(oneCallData.city)
        hourlyForecastDao.insert(toHourlyForecastEntity(oneCallData))
        val currentCityWeather =
            hourlyForecastDao.allCityCurrentWeather(currentUnixTime() - currentTimeZoneOffset())
        currentCityWeather.map {
            Log.d(TAG, "${it.city}, ${unixToDate(it.dt)}")
        }
    }

    private suspend fun isDataUpToDate(city: String): Boolean {
        val lastUpdate = hourlyForecastDao.lastUpdate(city)
        return lastUpdate.isNotEmpty() && lastUpdate[0] == currentUnixTime()
    }

    companion object {
        private const val TAG = "ForecastRepository"
    }
}