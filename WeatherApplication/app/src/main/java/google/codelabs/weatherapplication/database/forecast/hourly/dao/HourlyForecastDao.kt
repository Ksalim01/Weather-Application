package google.codelabs.weatherapplication.database.forecast.hourly.dao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity

@Dao
interface HourlyForecastDao {
    @Query("DELETE FROM hourly_forecast WHERE lat = :lat and lon = :lon")
    suspend fun deleteCity(lat: Float, lon: Float)

    @Query("SELECT * FROM hourly_forecast WHERE lat = :lat and lon = :lon ORDER BY dt")
    suspend fun cityForecast(lat: Float, lon: Float) : List<HourlyForecastEntity>

    @Query("SELECT * FROM hourly_forecast ORDER BY dt")
    suspend fun allCityForecast() : List<HourlyForecastEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(forecast: List<HourlyForecastEntity>)
}