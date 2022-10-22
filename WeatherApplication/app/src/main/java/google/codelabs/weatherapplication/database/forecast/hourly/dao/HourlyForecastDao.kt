package google.codelabs.weatherapplication.database.forecast.hourly.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import google.codelabs.weatherapplication.database.forecast.hourly.entities.AllCityCurrentWeather
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity

@Dao
interface HourlyForecastDao {
    @Query("DELETE FROM hourly_forecast WHERE city_name = :city")
    suspend fun deleteCity(city: String)

    @Query("SELECT * FROM hourly_forecast " +
            "WHERE city_name = :city and dt >= :dt " +
            "ORDER BY dt")
    suspend fun cityForecast(city: String, dt: Long): List<HourlyForecastEntity>


    @Query(
        "SELECT timezone_offset, dt, temp, feels_like, humidity, wind_speed, icon, city_name " +
                "FROM hourly_forecast " +
                "WHERE city_name = :city " +
                "and dt = :dt " +
                "ORDER BY dt"
    )
    suspend fun currentWeather(city: String, dt: Long): List<CurrentWeatherEntity>

    @Query(
        "SELECT city_name, dt, timezone_offset, temp, icon " +
                "FROM hourly_forecast " +
                "WHERE dt = :dt " +
                "ORDER BY dt"
    )
    suspend fun allCityCurrentWeather(dt: Long): List<AllCityCurrentWeather>


    @Query("SELECT min(dt) FROM hourly_forecast WHERE city_name = :city")
    suspend fun lastUpdate(city: String): List<Long>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(forecast: List<HourlyForecastEntity>)
}