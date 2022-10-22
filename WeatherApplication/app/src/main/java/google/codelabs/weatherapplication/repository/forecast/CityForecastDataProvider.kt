package google.codelabs.weatherapplication.repository.forecast

import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity
import google.codelabs.weatherapplication.repository.forecast.entities.UpdateResult


interface CityForecastDataProvider {

    suspend fun currentWeather(city: String): List<CurrentWeatherEntity>

    suspend fun hourlyForecast(city: String): List<HourlyForecastEntity>

    suspend fun dailyForecast(city: String): List<DailyForecastEntity>

    suspend fun updateData(city: String): UpdateResult

}