package google.codelabs.weatherapplication.database.forecast.hourly

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import google.codelabs.weatherapplication.database.forecast.daily.DailyForecastDB
import google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity

@Database(entities = [HourlyForecastEntity::class], version = 1)
abstract class HourlyForecastDB : RoomDatabase() {
    abstract fun hourlyForecastDao(): HourlyForecastDao

    companion object {
        @Volatile private var instance: HourlyForecastDB? = null

        fun getInstance(context: Context): HourlyForecastDB {
            return instance ?: synchronized(this) {
                instance
                    ?: buildDatabase(
                        context
                    ).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): HourlyForecastDB {
            return Room.databaseBuilder(context, HourlyForecastDB::class.java, HOURLY_DATABASE).build()
        }
    }
}

private const val HOURLY_DATABASE = "weather.hourly"