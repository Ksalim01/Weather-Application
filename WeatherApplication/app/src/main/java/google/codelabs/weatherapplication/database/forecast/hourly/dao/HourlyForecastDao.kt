package google.codelabs.weatherapplication.database.forecast.hourly.dao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity

@Dao
interface HourlyForecastDao {
    @Query("DELETE FROM hourly_forecast WHERE ABS(lat - :lat) < 0.0001 and ABS(lon - :lon) < 0.0001")
    suspend fun deleteCity(lat: Float, lon: Float)

    @Query("SELECT * FROM hourly_forecast WHERE ABS(lat - :lat) < 0.0001 and ABS(lon - :lon) < 0.0001 ORDER BY dt")
    suspend fun cityForecast(lat: Float, lon: Float) : List<HourlyForecastEntity>

    @Query("SELECT * FROM hourly_forecast ORDER BY dt")
    suspend fun allCityForecast() : List<HourlyForecastEntity>

    @Query("SELECT timezone_offset, temp, feels_like, humidity, wind_speed, icon " +
            "FROM hourly_forecast " +
            "WHERE ABS(lat - :lat) < 0.0001 and ABS(lon - :lon) < 0.0001 " +
            "and dt = :dt")
    suspend fun currentWeather(lat: Float, lon: Float, dt: Long) : List<CurrentWeatherEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(forecast: List<HourlyForecastEntity>)
}