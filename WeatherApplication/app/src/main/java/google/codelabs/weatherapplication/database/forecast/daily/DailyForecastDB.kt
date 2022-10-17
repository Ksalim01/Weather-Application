package google.codelabs.weatherapplication.database.forecast.daily

import androidx.room.Database
import androidx.room.RoomDatabase
import google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity

@Database(entities = [DailyForecastEntity::class], version = 1)
abstract class DailyForecastDB : RoomDatabase() {
    abstract fun dailyForecastDao(): DailyForecastDao
}
