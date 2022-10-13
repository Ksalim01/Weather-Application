package google.codelabs.weatherapplication.database.forecast.daily.dao


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity

@Dao
interface DailyForecastDao {
    @Query("DELETE FROM daily_forecast WHERE city_name = :city")
    suspend fun deleteCity(city: String)

    @Query("SELECT * FROM daily_forecast WHERE city_name = :city ORDER BY dt")
    suspend fun cityForecast(city: String) : List<DailyForecastEntity>

    @Query("SELECT * FROM daily_forecast ORDER BY dt")
    suspend fun allCityForecast() : List<DailyForecastEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(forecast: List<DailyForecastEntity>)
}