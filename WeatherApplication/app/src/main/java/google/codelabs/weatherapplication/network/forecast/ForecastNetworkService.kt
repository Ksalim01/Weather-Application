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

class ForecastNetworkService : BaseRetrofitService() {

    private val retrofit = buildRetrofit()
   // private val defaultDispatcher = Dispatchers.IO

    suspend fun fetchOneCallData(lat: Float, long: Float, geocoder: Geocoder) : OneCallData? = try {
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

    private fun buildRetrofit() : WeatherAPI {
        val httpLoggingInterceptor = HttpLoggingInterceptor();
        httpLoggingInterceptor.level = okhttp3.logging.HttpLoggingInterceptor.Level.BODY;

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

        val retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        return retrofit.create(WeatherAPI::class.java)
    }

    companion object {
        private const val TAG = "ForecastNetworkService"
        private const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
        private const val WEATHER_TOKEN = "c655b94b8f4b74939315e693439f72b2"
    }
}