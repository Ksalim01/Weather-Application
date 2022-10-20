package google.codelabs.weatherapplication.screen.cityweather.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity
import google.codelabs.weatherapplication.repository.forecast.CityForecastDataProvider
import google.codelabs.weatherapplication.repository.forecast.ForecastRepository
import google.codelabs.weatherapplication.screen.cityweather.fragment.Coordinates
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

class ForecastViewModel @Inject constructor(
    private val forecastRepository: CityForecastDataProvider
) : ViewModel() {
    private lateinit var cityParameters: Coordinates

    private val _dailyForecastData: MutableLiveData<List<DailyForecastEntity>> by lazy {
        MutableLiveData()
    }
    val dailyForecastData: LiveData<List<DailyForecastEntity>>
        get() = _dailyForecastData

    private val _hourlyForecastData: MutableLiveData<List<HourlyForecastEntity>> by lazy {
        MutableLiveData()
    }
    val hourlyForecastData: LiveData<List<HourlyForecastEntity>>
        get() = _hourlyForecastData

    private val _currentForecastData: MutableLiveData<CurrentWeatherEntity> by lazy {
        MutableLiveData()
    }
    val currentForecastData: LiveData<CurrentWeatherEntity>
        get() = _currentForecastData

    fun setCityParameters(city: String, update: Boolean) {
        launchDataLoad {
            if (update) forecastRepository.updateData(city)
            _currentForecastData.postValue(forecastRepository.currentWeather(city)[0])
            _dailyForecastData.postValue(forecastRepository.dailyForecast(city))
            _hourlyForecastData.postValue(forecastRepository.hourlyForecast(city))
        }
    }

    private fun launchDataLoad(block: suspend () -> Unit): Job {
        return viewModelScope.launch(Dispatchers.IO) {
            try {
                block()
            } catch (error: Throwable) {
            } finally {

            }
        }
    }
}