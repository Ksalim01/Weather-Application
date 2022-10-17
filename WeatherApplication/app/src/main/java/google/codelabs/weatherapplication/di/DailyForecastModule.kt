package google.codelabs.weatherapplication.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import google.codelabs.weatherapplication.database.forecast.daily.DailyForecastDB
import google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao

@Module
class DailyForecastModule {
    @Provides
    fun provideDailyForecastDB(context: Context): DailyForecastDB =
        Room.databaseBuilder(context, DailyForecastDB::class.java, DAILY_DATABASE).build()

    @Provides
    fun provideDailyForecastDBDao(dailyForecastDB: DailyForecastDB): DailyForecastDao =
        dailyForecastDB.dailyForecastDao()

    companion object {
        private const val DAILY_DATABASE = "weather.daily"
    }
}