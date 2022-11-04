package google.codelabs.weatherapplication.repository.forecast

import google.codelabs.weatherapplication.repository.forecast.entities.CityAddressResult

interface CityExistence: CityAdding {

    suspend fun checkCityExistence(city: String): CityAddressResult
}