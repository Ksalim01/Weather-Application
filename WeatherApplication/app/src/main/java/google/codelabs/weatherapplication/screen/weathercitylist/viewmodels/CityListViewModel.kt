package google.codelabs.weatherapplication.screen.weathercitylist.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import google.codelabs.weatherapplication.repository.forecast.CityAdding
import google.codelabs.weatherapplication.repository.forecast.CityListDataProvider
import google.codelabs.weatherapplication.repository.forecast.entities.CityWeather
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class CityListViewModel @Inject constructor(
    private val repository: CityListDataProvider
) : ViewModel() {

    private val _otherCitiesWeather: MutableLiveData<List<CityWeather>> by lazy {
        MutableLiveData()
    }
    val otherCitiesWeather: LiveData<List<CityWeather>>
        get() = _otherCitiesWeather

    private val _favouriteCityWeather: MutableLiveData<CityWeather> by lazy {
        MutableLiveData()
    }
    val favouriteCityWeather: LiveData<CityWeather>
        get() = _favouriteCityWeather

    fun launchCityListData(favouriteCity: String) {
        launch {
            divideCityListWeather(repository.allCityWeather(), favouriteCity)
        }
    }

    fun launchCityListDataWithNewCity(newCity: String) {
        launch {
            repository.addCity(newCity)
            divideCityListWeather(repository.allCityWeather(), _favouriteCityWeather.value!!.city)
        }
    }

    private fun divideCityListWeather(cityWeather: List<CityWeather>, favouriteCity: String) {
        val favouriteCityIndex = cityWeather.indexOfFirst { it.city == favouriteCity }
        _favouriteCityWeather.postValue(cityWeather[favouriteCityIndex])
        _otherCitiesWeather.postValue(cityWeather.filter { it.city != favouriteCity })
    }

    private fun launch(block: suspend () -> Unit) {
        viewModelScope.launch(Dispatchers.IO) {
            block()
        }
    }
}