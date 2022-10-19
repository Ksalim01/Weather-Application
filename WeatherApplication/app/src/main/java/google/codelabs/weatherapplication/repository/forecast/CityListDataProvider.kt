package google.codelabs.weatherapplication.repository.forecast

import google.codelabs.weatherapplication.repository.forecast.entities.CityListWeather

interface CityListDataProvider {

    suspend fun cityList(): List<CityListWeather>
}