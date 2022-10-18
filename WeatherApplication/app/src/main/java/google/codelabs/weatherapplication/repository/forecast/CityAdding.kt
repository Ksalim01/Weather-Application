package google.codelabs.weatherapplication.repository.forecast

interface CityAdding {

    suspend fun addCity(city: String): UpdateResult
}