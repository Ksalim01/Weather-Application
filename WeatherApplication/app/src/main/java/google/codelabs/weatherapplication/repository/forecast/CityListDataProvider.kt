package google.codelabs.weatherapplication.repository.forecast

import google.codelabs.weatherapplication.repository.forecast.entities.CityWeather

interface CityListDataProvider {

    suspend fun allCityWeather(): List<CityWeather>
}