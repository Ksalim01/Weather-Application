package google.codelabs.weatherapplication.network.forecast.entities

import androidx.room.ColumnInfo

data class CurrentWeatherEntity (
    @ColumnInfo(name = "timezone_offset") val timezone_offset: Long,
    @ColumnInfo(name = "temp") val temp: Float,
    @ColumnInfo(name = "feels_like") val feels_like: Float,
    @ColumnInfo(name = "humidity") val humidity: Long,
    @ColumnInfo(name = "wind_speed") val wind_speed: Float,
    @ColumnInfo(name = "icon") val icon: String,
    @ColumnInfo(name = "city_name") var city: String,
)
