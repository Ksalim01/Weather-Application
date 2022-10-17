package google.codelabs.weatherapplication.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import google.codelabs.weatherapplication.database.forecast.hourly.HourlyForecastDB
import google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao

@Module
class HourlyForecastDBModule {

    @Provides
    fun provideHourlyForecastDB(context: Context): HourlyForecastDB =
        Room.databaseBuilder(context, HourlyForecastDB::class.java, HOURLY_DATABASE).build()

    @Provides
    fun provideHourlyForecastDBDao(hourlyForecastDB: HourlyForecastDB): HourlyForecastDao =
        hourlyForecastDB.hourlyForecastDao()

    companion object {
        private const val HOURLY_DATABASE = "weather.hourly"
    }
}