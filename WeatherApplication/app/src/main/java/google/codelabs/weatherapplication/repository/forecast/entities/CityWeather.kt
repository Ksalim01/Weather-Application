package google.codelabs.weatherapplication.repository.forecast.entities

data class CityWeather(
    val city: String,
    val country: String,
    val timezone_offset: Long,
    val dt: Long,
    val temp_min: Float,
    val temp_max: Float,
    val current_temp: Float,
    val icon: String,
)
