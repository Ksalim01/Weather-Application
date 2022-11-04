package google.codelabs.weatherapplication.repository.forecast

import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity
import google.codelabs.weatherapplication.repository.forecast.entities.UpdateResult
import kotlinx.coroutines.flow.Flow


interface CityForecastDataProvider {

    fun currentWeather(city: String): Flow<List<CurrentWeatherEntity>>

    fun hourlyForecast(city: String): Flow<List<HourlyForecastEntity>>

    fun dailyForecast(city: String): Flow<List<DailyForecastEntity>>

    suspend fun updateData(city: String): UpdateResult

}