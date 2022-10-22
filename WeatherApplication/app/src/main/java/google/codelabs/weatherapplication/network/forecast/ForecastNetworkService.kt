package google.codelabs.weatherapplication.network.forecast

import android.location.Geocoder
import google.codelabs.weatherapplication.network.forecast.api.WeatherAPI
import google.codelabs.weatherapplication.network.forecast.entities.OneCallData
import google.codelabs.weatherapplication.screen.cityweather.utils.cityCoordinates
import google.codelabs.weatherapplication.screen.cityweather.utils.country
import javax.inject.Inject

class ForecastNetworkService @Inject constructor(
    private val retrofit: WeatherAPI,
    private val geocoder: Geocoder
) : BaseRetrofitService() {

    // private val defaultDispatcher = Dispatchers.IO

    suspend fun fetchOneCallData(city: String): OneCallData? = try {
        fetchOneCallDataWithException(city, geocoder)
    } catch (e: Exception) {
        null
    }

    private suspend fun fetchOneCallDataWithException(city: String, geocoder: Geocoder):
            OneCallData? = wrapRetrofitExceptions {

        val coordinates = cityCoordinates(city, geocoder)!!
        val response = retrofit.oneCallApi(coordinates.lat, coordinates.lon, WEATHER_TOKEN)
        val country = country(city, geocoder)
        when {
            response.isSuccessful -> {
                response.body()!!.city = city
                response.body()!!.country = country
                response.body()
            }
            else -> null
        }
    }

    companion object {
        private const val TAG = "ForecastNetworkService"
        private const val WEATHER_TOKEN = "c655b94b8f4b74939315e693439f72b2"
    }
}