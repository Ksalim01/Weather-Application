package google.codelabs.weatherapplication.repository.forecast.entities

import androidx.room.ColumnInfo

data class CityListWeather(
    val city: String,
    val timezone_offset: Long,
    val dt: Long,
    val temp_min: Float,
    val temp_max: Float,
    val current_temp: Float,
    val icon: String,
)
