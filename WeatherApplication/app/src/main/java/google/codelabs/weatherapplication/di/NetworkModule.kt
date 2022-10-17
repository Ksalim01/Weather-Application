package google.codelabs.weatherapplication.di

import dagger.Module
import dagger.Provides
import google.codelabs.weatherapplication.network.forecast.api.WeatherAPI
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class NetworkModule {
    @Provides
    fun provideRetrofitBuilder(): Retrofit.Builder {
        val httpLoggingInterceptor = HttpLoggingInterceptor();
        httpLoggingInterceptor.level = okhttp3.logging.HttpLoggingInterceptor.Level.BODY;

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create())
    }

    @Provides
    fun provideWeatherAPI(retrofit: Retrofit.Builder) =
        retrofit.baseUrl(BASE_URL).build().create(WeatherAPI::class.java)

    companion object {
        private const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
    }
}