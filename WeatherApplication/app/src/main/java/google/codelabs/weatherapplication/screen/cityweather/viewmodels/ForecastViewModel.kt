package google.codelabs.weatherapplication.screen.cityweather.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity
import google.codelabs.weatherapplication.repository.forecast.CityForecastDataProvider
import google.codelabs.weatherapplication.repository.forecast.entities.UpdateResult
import google.codelabs.weatherapplication.screen.MainActivityScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@MainActivityScope
@ExperimentalCoroutinesApi
class ForecastViewModel @Inject constructor(
    private val forecastRepository: CityForecastDataProvider
) : ViewModel() {

    private val dispatcher = Dispatchers.IO

    private val _cityFlow = MutableStateFlow<String>("")
    val dailyForecastData: LiveData<List<DailyForecastEntity>> =
        _cityFlow.flatMapLatest { city ->
            forecastRepository.dailyForecast(city)
        }.flowOn(dispatcher).asLiveData()

    val hourlyForecastData: LiveData<List<HourlyForecastEntity>> = _cityFlow.flatMapLatest { city ->
        forecastRepository.hourlyForecast(city)
    }.flowOn(dispatcher).asLiveData()

    val currentForecastData: LiveData<List<CurrentWeatherEntity>> =
        _cityFlow.flatMapLatest { city ->
            forecastRepository.currentWeather(city)
        }.flowOn(dispatcher).asLiveData()

    private val _lastUpdateResult = MutableLiveData<UpdateResult>()
    val lastUpdateResult : LiveData<UpdateResult> = _lastUpdateResult

    fun setCity(city: String) {
        _cityFlow.value = city
    }

    fun updateData() {
        viewModelScope.launch(dispatcher) {
            _lastUpdateResult.postValue(forecastRepository.updateData(_cityFlow.value))
        }
    }
}