package google.codelabs.weatherapplication.repository.forecast

import android.util.Log
import androidx.lifecycle.MutableLiveData
import google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity
import google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.network.forecast.ForecastNetworkService
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity
import google.codelabs.weatherapplication.network.forecast.entities.OneCallData
import google.codelabs.weatherapplication.repository.utils.toCurrentWeatherEntity
import google.codelabs.weatherapplication.repository.utils.toDailyForecastEntity
import google.codelabs.weatherapplication.repository.utils.toHourlyForecastEntity
import google.codelabs.weatherapplication.screen.cityweather.utils.currentTimeZoneOffset
import google.codelabs.weatherapplication.screen.cityweather.utils.currentUnixTime
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class ForecastRepository private constructor(
    private val dailyForecastDao: DailyForecastDao,
    private val hourlyForecastDao: HourlyForecastDao,
    private val forecastNetworkService: ForecastNetworkService,
    private val defaultDispatcher: CoroutineDispatcher = Dispatchers.Default
) {

    val dailyForecastData: MutableLiveData<List<DailyForecastEntity>> =
        MutableLiveData(emptyList())

    val hourlyForecastData: MutableLiveData<List<HourlyForecastEntity>> =
        MutableLiveData(emptyList())

    val currentForecastData: MutableLiveData<CurrentWeatherEntity> =
        MutableLiveData()

    private var propertiesFromDB = false

    suspend fun updateData(lat: Float, long: Float) {
        if (isCurrentData()) fetchForecast(lat, long)
    }

    private suspend fun fetchForecast(lat: Float, long: Float) {
        val oneCallData = forecastNetworkService.fetchOneCallData(lat, long)
        if (oneCallData == null) {
            Log.d("repository", "no response")
            updatePropertiesFromDB(lat, long)
        } else {
            updateAllFromResponse(oneCallData)
        }
    }

    private suspend fun updateAllFromResponse(oneCallData: OneCallData) {
        updateDB(oneCallData)
        updateProperties(oneCallData)
    }

    private suspend fun updateDB(oneCallData: OneCallData) {
        Log.d("repository", "updateDB")
        dailyForecastDao.insert(toDailyForecastEntity(oneCallData))
        hourlyForecastDao.insert(toHourlyForecastEntity(oneCallData))
        Log.d("repository", "DB updated")
    }

    private fun updateProperties(oneCallData: OneCallData) {
        Log.d("repository", "updateCurrentData")
        dailyForecastData.postValue(toDailyForecastEntity(oneCallData))
        hourlyForecastData.postValue(toHourlyForecastEntity(oneCallData))
        currentForecastData.postValue(toCurrentWeatherEntity(oneCallData))
        Log.d("repository", "properties updated")
    }

    private suspend fun updatePropertiesFromDB(lat: Float, long: Float) {
        if (!propertiesFromDB) {
            dailyForecastData.postValue(dailyForecastDao.cityForecast(lat, long))
            hourlyForecastData.postValue(hourlyForecastDao.cityForecast(lat, long))
            val currentWeather = hourlyForecastDao.currentWeather(lat, long, currentUnixTime()) // currentUnixTime() - currentTimeZoneOffset()
            if (currentWeather.isNotEmpty()) {
                Log.d("repository", "found current weather")
                currentForecastData.postValue(currentWeather[0])
            } else {
                Log.d("repository", "current weather not found")
            }
            propertiesFromDB = true
        }
    }

    private fun isCurrentData() : Boolean {
        // TODO check data from DB on relevance
        return true
    }

    companion object {

        // For Singleton instantiation
        @Volatile private var instance: ForecastRepository? = null

        fun getInstance(dailyForecastDao: DailyForecastDao,
                        hourlyForecastDao: HourlyForecastDao,
                        forecastNetworkService: ForecastNetworkService) =
            instance ?: synchronized(this) {
                instance ?: ForecastRepository(
                    dailyForecastDao,
                    hourlyForecastDao,
                    forecastNetworkService)
                    .also { instance = it }
            }
    }
}