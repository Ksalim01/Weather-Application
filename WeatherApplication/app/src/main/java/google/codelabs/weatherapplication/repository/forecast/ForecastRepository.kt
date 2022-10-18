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
import google.codelabs.weatherapplication.repository.utils.toDailyForecastEntity
import google.codelabs.weatherapplication.repository.utils.toHourlyForecastEntity
import google.codelabs.weatherapplication.screen.cityweather.utils.cityCoordinates
import google.codelabs.weatherapplication.screen.cityweather.utils.cityName
import google.codelabs.weatherapplication.screen.cityweather.utils.currentUnixTime
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ForecastRepository @Inject constructor(
    private val dailyForecastDao: DailyForecastDao,
    private val hourlyForecastDao: HourlyForecastDao,
    private val forecastNetworkService: ForecastNetworkService,
    private val geocoder: Geocoder,
): CityForecastDataProvider, CityAdding {

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

    override suspend fun updateData(city: String): UpdateResult {
        val coordinates = try {
            cityCoordinates(city, geocoder)!!
        } catch (e: IOException) {
            return UpdateResult.NO_INTERNET_CONNECTION
        } catch (e: Exception) {
            return UpdateResult.NO_RESPONSE
        }

        val oneCallData = forecastNetworkService.fetchOneCallData(city)
        if (oneCallData == null) return UpdateResult.NO_RESPONSE
        Log.d(TAG, "city = ${oneCallData.city}, temp = ${oneCallData.current.temp}")

        updateDBFrom(oneCallData)
        return UpdateResult.SUCCESSFUL
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