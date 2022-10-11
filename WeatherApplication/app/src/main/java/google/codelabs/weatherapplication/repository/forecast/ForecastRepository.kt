package google.codelabs.weatherapplication.repository.forecast

import android.util.Log
import androidx.lifecycle.LiveData
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
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

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

    suspend fun updateData(lat: Float, long: Float) {
        Log.d("repository", "updateData")
        if (isCurrentData()) fetchForecast(lat, long)
    }

    private suspend fun fetchForecast(lat: Float, long: Float) {
        Log.d("repository", "fetching")
        val oneCallData = forecastNetworkService.fetchOneCallData(lat, long)
        if (oneCallData == null) {
            Log.d("repository", "no response")
        }
        updateDB(oneCallData)
        updateCurrentData(oneCallData)
    }

    private suspend fun updateDB(oneCallData: OneCallData?) {
        Log.d("repository", "updateDB")
        oneCallData?.let {
            dailyForecastDao.insert(toDailyForecastEntity(it))
            hourlyForecastDao.insert(toHourlyForecastEntity(it))
        }
        Log.d("repository", "DB updated")
    }

    private suspend fun updateCurrentData(oneCallData: OneCallData?) {
        Log.d("repository", "updateCurrentData")
        oneCallData?.let {
            Log.d("repository", "set properties")
            dailyForecastData.postValue(toDailyForecastEntity(it))
            Log.d("repository", "dailyForecast")
            hourlyForecastData.postValue(toHourlyForecastEntity(it))
            Log.d("repository", "hourlyForecast")
            currentForecastData.postValue(toCurrentWeatherEntity(it))
            Log.d("repository", "currentForecast")
        }
        Log.d("repository", "properties are updated")
    }

    private fun isCurrentData() : Boolean {
        // TODO should be implemented
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