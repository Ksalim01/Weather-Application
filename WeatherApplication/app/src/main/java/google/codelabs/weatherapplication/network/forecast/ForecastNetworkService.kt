package google.codelabs.weatherapplication.network.forecast

import android.util.Log
import google.codelabs.weatherapplication.network.forecast.api.WeatherAPI
import google.codelabs.weatherapplication.network.forecast.entities.OneCallData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ForecastNetworkService : BaseRetrofitService() {

    private val retrofit = buildRetrofit()
   // private val defaultDispatcher = Dispatchers.IO

    suspend fun fetchOneCallData(lat: Float, long: Float) : OneCallData? = try {
        fetchOneCallDataWithException(lat, long)
    } catch (e: Exception) {
        null
    }

    suspend fun fetchOneCallDataWithException(lat: Float, long: Float) : OneCallData? = wrapRetrofitExceptions {

        Log.d("NetworkService", "fetching...")
        val response = retrofit.oneCallApi(lat, long, WEATHER_TOKEN)
        Log.d("NetworkService", "done")
        if (response.isSuccessful) {
            response.body()
        } else {
            null
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
        const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
        const val WEATHER_TOKEN = "c655b94b8f4b74939315e693439f72b2"
    }
}