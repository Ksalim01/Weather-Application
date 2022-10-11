package google.codelabs.weatherapplication.database.forecast.daily.dao


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity

@Dao
interface DailyForecastDao {
    @Query("DELETE FROM daily_forecast WHERE lat = :lat and lon = :lon")
    suspend fun deleteCity(lat: Float, lon: Float)

    @Query("SELECT * FROM daily_forecast WHERE lat = :lat and lon = :lon ORDER BY dt")
    suspend fun cityForecast(lat: Float, lon: Float) : List<DailyForecastEntity>

    @Query("SELECT * FROM daily_forecast ORDER BY dt")
    suspend fun allCityForecast() : List<DailyForecastEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(forecast: List<DailyForecastEntity>)
}