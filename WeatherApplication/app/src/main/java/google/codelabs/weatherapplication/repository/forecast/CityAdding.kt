package google.codelabs.weatherapplication.repository.forecast

import google.codelabs.weatherapplication.repository.forecast.entities.UpdateResult

interface CityAdding {

    suspend fun addCity(city: String): UpdateResult
}