package google.codelabs.weatherapplication.network.forecast.api

import google.codelabs.weatherapplication.network.forecast.entities.OneCallData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    @GET("onecall")
    suspend fun oneCallApi(
        @Query("lat") lat: Float,
        @Query("lon") lon: Float,
        @Query("appid") appid : String
    ) : Response<OneCallData>
}