package google.codelabs.weatherapplication.screen.weathercitylist.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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
        viewModelScope.launch(Dispatchers.IO) {
            divideCityListWeather(repository.allCityWeather(), favouriteCity)
        }
    }

    private fun divideCityListWeather(cityWeather: List<CityWeather>, favouriteCity: String) {
        val favouriteCityIndex = cityWeather.indexOfFirst { it.city == favouriteCity }
        _favouriteCityWeather.postValue(cityWeather[favouriteCityIndex])
        _otherCitiesWeather.postValue(cityWeather.filter { it.city != favouriteCity })
    }
}