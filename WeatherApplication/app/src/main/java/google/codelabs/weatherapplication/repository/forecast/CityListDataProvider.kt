package google.codelabs.weatherapplication.repository.forecast

import google.codelabs.weatherapplication.repository.forecast.entities.CityWeather

interface CityListDataProvider: CityAdding {

    suspend fun allCityWeather(): List<CityWeather>
}