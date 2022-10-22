package google.codelabs.weatherapplication.repository.forecast

import google.codelabs.weatherapplication.repository.forecast.entities.CityAddressResult

interface CityExistence {

    suspend fun checkCityExistence(city: String): CityAddressResult
}