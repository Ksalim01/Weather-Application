package google.codelabs.weatherapplication.repository.forecast.entities


enum class UpdateResult {
    SUCCESSFUL,
    NO_INTERNET_CONNECTION,
    NO_RESPONSE
}

data class CityAddressResult(
    val cityAddress: CityAddress?,
    val result: UpdateResult
)