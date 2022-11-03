package google.codelabs.weatherapplication.screen.citysearch

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import google.codelabs.weatherapplication.repository.forecast.CityExistence
import google.codelabs.weatherapplication.repository.forecast.entities.CityAddressResult
import google.codelabs.weatherapplication.screen.MainActivityScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class CitySearchViewModel @Inject constructor(
    val repository: CityExistence
) : ViewModel() {

    private val _response: MutableLiveData<CityAddressResult> by lazy {
        MutableLiveData()
    }

    val response: LiveData<CityAddressResult>
        get() = _response

    fun checkCityExistence(city: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _response.postValue(repository.checkCityExistence(city))
        }
    }
}