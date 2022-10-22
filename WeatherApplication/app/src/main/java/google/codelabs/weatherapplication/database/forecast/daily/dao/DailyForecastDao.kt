package google.codelabs.weatherapplication.database.forecast.daily.dao


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import google.codelabs.weatherapplication.database.forecast.daily.entities.AllCityForecastEntity
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity

@Dao
interface DailyForecastDao {
    @Query("DELETE FROM daily_forecast WHERE city_name = :city")
    suspend fun deleteCity(city: String)

    @Query("SELECT * FROM daily_forecast " +
            "WHERE city_name = :city and dt - timezone_offset >= :dt " +
            "ORDER BY dt")
    suspend fun cityForecast(city: String, dt: Long): List<DailyForecastEntity>

    @Query("SELECT city_name, country, timezone_offset, dt, temp_min, temp_max " +
            "FROM daily_forecast " +
            "WHERE abs(dt - timezone_offset - :dt) <= 86400 " +
            "ORDER BY dt")
    suspend fun allCityForecast(dt: Long): List<AllCityForecastEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(forecast: List<DailyForecastEntity>)
}