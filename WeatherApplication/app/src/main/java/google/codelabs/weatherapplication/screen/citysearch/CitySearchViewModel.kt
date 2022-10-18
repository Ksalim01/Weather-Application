package google.codelabs.weatherapplication.screen.citysearch

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import google.codelabs.weatherapplication.repository.forecast.CityAdding
import google.codelabs.weatherapplication.repository.forecast.UpdateResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class CitySearchViewModel @Inject constructor(
    val repository: CityAdding
) : ViewModel() {

    private val _response: MutableLiveData<UpdateResult> by lazy {
        MutableLiveData()
    }

    val response: LiveData<UpdateResult>
        get() = _response

    fun addCity(city: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _response.postValue(repository.addCity(city))
        }
    }
}