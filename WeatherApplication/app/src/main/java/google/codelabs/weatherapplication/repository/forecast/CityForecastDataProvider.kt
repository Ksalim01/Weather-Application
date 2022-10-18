package google.codelabs.weatherapplication.repository.forecast

import androidx.lifecycle.MutableLiveData
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity

enum class UpdateResult {
    SUCCESSFUL,
    NO_INTERNET_CONNECTION,
    NO_RESPONSE
}


interface CityForecastDataProvider {

    suspend fun currentWeather(city: String): List<CurrentWeatherEntity>

    suspend fun hourlyForecast(city: String): List<HourlyForecastEntity>

    suspend fun dailyForecast(city: String): List<DailyForecastEntity>

    suspend fun updateData(city: String): UpdateResult

}