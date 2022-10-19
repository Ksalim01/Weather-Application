package google.codelabs.weatherapplication.screen.weathercitylist.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import google.codelabs.weatherapplication.repository.forecast.CityListDataProvider
import google.codelabs.weatherapplication.repository.forecast.entities.CityListWeather
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class CityListViewModel @Inject constructor(
    private val repository: CityListDataProvider
) : ViewModel() {

    private val _cityListWeather: MutableLiveData<List<CityListWeather>> by lazy {
        MutableLiveData()
    }
    val cityListWeather: LiveData<List<CityListWeather>>
        get() = _cityListWeather

    fun launchCityListData() {
        viewModelScope.launch(Dispatchers.IO) {
            _cityListWeather.postValue(repository.cityList())
        }
    }
}