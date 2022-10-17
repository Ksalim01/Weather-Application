package google.codelabs.weatherapplication.screen.cityweather.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity
import google.codelabs.weatherapplication.repository.forecast.ForecastRepository
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityParameters
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

class ForecastViewModel @Inject constructor(
    private val forecastRepository: ForecastRepository
) : ViewModel() {
    private lateinit var cityParameters: CityParameters

    val dailyForecastData: LiveData<List<DailyForecastEntity>>
        get() = forecastRepository.dailyForecastData

    val hourlyForecastData: LiveData<List<HourlyForecastEntity>>
        get() = forecastRepository.hourlyForecastData

    val currentForecastData: LiveData<CurrentWeatherEntity>
        get() = forecastRepository.currentForecastData

    fun setCityParameters(params: CityParameters) {
        cityParameters = params
        Log.d("viewModel", "launching data")
        launchDataLoad { forecastRepository.updateData(cityParameters.lat, cityParameters.long) }
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