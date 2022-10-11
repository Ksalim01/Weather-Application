package google.codelabs.weatherapplication.database.forecast.hourly.entities

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "hourly_forecast",
    primaryKeys = ["lat", "lon", "dt"]
)
data class HourlyForecastEntity (
    @ColumnInfo(name = "lat") val lat: Float,
    @ColumnInfo(name = "lon") val lon: Float,
    @ColumnInfo(name = "dt") val dt: Long,
    @ColumnInfo(name = "timezone_offset") val timezone_offset: Long,

    @ColumnInfo(name = "temp") val temp: Float,
    @ColumnInfo(name = "feels_like") val feels_like: Float,

    @ColumnInfo(name = "humidity") val humidity: Long,
    @ColumnInfo(name = "wind_speed") val wind_speed: Float,
    @ColumnInfo(name = "wind_deg") val wind_deg: Long,
    @ColumnInfo(name = "uvi") val uvi: Float,
    @ColumnInfo(name = "icon") val icon: String,
)