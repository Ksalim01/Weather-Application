package google.codelabs.weatherapplication.repository.forecast

import google.codelabs.weatherapplication.repository.forecast.entities.CityWeather
import kotlinx.coroutines.flow.Flow

interface CityListDataProvider {

    fun allCityWeather(): Flow<List<CityWeather>>
}