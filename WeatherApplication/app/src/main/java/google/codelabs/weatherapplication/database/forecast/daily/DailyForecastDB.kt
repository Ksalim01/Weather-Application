package google.codelabs.weatherapplication.database.forecast.daily

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity

@Database(entities = [DailyForecastEntity::class], version = 1)
abstract class DailyForecastDB : RoomDatabase() {
    abstract fun dailyForecastDao(): DailyForecastDao

    companion object {
        @Volatile private var instance: DailyForecastDB? = null

        fun getInstance(context: Context): DailyForecastDB {
            return instance ?: synchronized(this) {
                instance
                    ?: buildDatabase(
                        context
                    ).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): DailyForecastDB {
            return Room.databaseBuilder(context, DailyForecastDB::class.java, DAILY_DATABASE).build()
        }
    }
}

private const val DAILY_DATABASE = "weather.daily"