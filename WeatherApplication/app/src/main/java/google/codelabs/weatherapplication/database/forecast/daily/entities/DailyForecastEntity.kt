package google.codelabs.weatherapplication.database.forecast.daily.entities

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity(
    tableName = "daily_forecast",
    primaryKeys = ["city_name", "dt"]
)
data class DailyForecastEntity(
    @ColumnInfo(name = "city_name") val city: String,
    @ColumnInfo(name = "country") val country: String,
    @ColumnInfo(name = "dt") val dt: Long,
    @ColumnInfo(name = "timezone_offset") val timezone_offset: Long,

    @ColumnInfo(name = "sunrise") val sunrise: Long,
    @ColumnInfo(name = "sunset") val sunset: Long,

    @ColumnInfo(name = "temp_morn") val temp_morn: Float,
    @ColumnInfo(name = "temp_day") val temp_day: Float,
    @ColumnInfo(name = "temp_eve") val temp_eve: Float,
    @ColumnInfo(name = "temp_night") val temp_night: Float,
    @ColumnInfo(name = "temp_min") val temp_min: Float,
    @ColumnInfo(name = "temp_max") val temp_max: Float,

    @ColumnInfo(name = "feels_like_morn") val feels_like_morn: Float,
    @ColumnInfo(name = "feels_like_day") val feels_like_day: Float,
    @ColumnInfo(name = "feels_like_eve") val feels_like_eve: Float,
    @ColumnInfo(name = "feels_like_night") val feels_like_night: Float,

    @ColumnInfo(name = "humidity") val humidity: Long,
    @ColumnInfo(name = "wind_speed") val wind_speed: Float,
    @ColumnInfo(name = "wind_deg") val wind_deg: Long,
    @ColumnInfo(name = "uvi") val uvi: Float,
    @ColumnInfo(name = "icon") val icon: String,
)

