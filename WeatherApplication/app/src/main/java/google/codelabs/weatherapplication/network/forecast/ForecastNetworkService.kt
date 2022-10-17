package google.codelabs.weatherapplication.network.forecast

import android.location.Geocoder
import android.util.Log
import google.codelabs.weatherapplication.network.forecast.api.WeatherAPI
import google.codelabs.weatherapplication.network.forecast.entities.OneCallData
import google.codelabs.weatherapplication.screen.cityweather.utils.cityName
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Inject

class ForecastNetworkService @Inject constructor(
    private val retrofit: WeatherAPI,
    private val geocoder: Geocoder
) : BaseRetrofitService() {

   // private val defaultDispatcher = Dispatchers.IO

    suspend fun fetchOneCallData(lat: Float, long: Float) : OneCallData? = try {
        fetchOneCallDataWithException(lat, long, geocoder)
    } catch (e: Exception) {
        null
    }

    private suspend fun fetchOneCallDataWithException(lat: Float, long: Float, geocoder: Geocoder) :
            OneCallData? = wrapRetrofitExceptions {

        val response = retrofit.oneCallApi(lat, long, WEATHER_TOKEN)
        val name = cityName(lat, long, geocoder)
        when {
            response.isSuccessful && name != null -> {
                response.body()!!.city = name
                Log.d(TAG, response.body()!!.city)
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