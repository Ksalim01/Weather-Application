package google.codelabs.weatherapplication.database.forecast.hourly

import androidx.room.Database
import androidx.room.RoomDatabase
import google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity

@Database(entities = [HourlyForecastEntity::class], version = 1)
abstract class HourlyForecastDB : RoomDatabase() {
    abstract fun hourlyForecastDao(): HourlyForecastDao
}
