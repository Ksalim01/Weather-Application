package google.codelabs.weatherapplication.screen.weathercitylist.viewmodels

import androidx.lifecycle.*
import google.codelabs.weatherapplication.repository.forecast.CityAdding
import google.codelabs.weatherapplication.repository.forecast.CityListDataProvider
import google.codelabs.weatherapplication.repository.forecast.entities.CityWeather
import google.codelabs.weatherapplication.screen.MainActivityScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@MainActivityScope
@ExperimentalCoroutinesApi
class CityListViewModel @Inject constructor(
    private val repository: CityListDataProvider
) : ViewModel() {

    private val _allCityWeatherFlow = repository.allCityWeather()
    private val _favouriteCityStateFlow = MutableStateFlow("")
    private val dispatcher = Dispatchers.IO

    val favouriteCityWeather = _favouriteCityStateFlow.flatMapLatest { city->
        _allCityWeatherFlow.map { allCityWeather -> allCityWeather.find { it.city == city } }
    }.flowOn(dispatcher).asLiveData()

    val otherCitiesWeather = _favouriteCityStateFlow.flatMapLatest { city->
        _allCityWeatherFlow.map { allCityWeather -> allCityWeather.filter { it.city != city } }
    }.flowOn(dispatcher).asLiveData()

    fun launchCityListData(favouriteCity: String) {
        _favouriteCityStateFlow.value = favouriteCity
    }
}