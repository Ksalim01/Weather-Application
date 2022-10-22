package google.codelabs.weatherapplication.repository.forecast.entities

import google.codelabs.weatherapplication.network.forecast.entities.OneCallData

data class NetworkResponseResult(
    val oneCallData: OneCallData?,
    val result: UpdateResult
)
