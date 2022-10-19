package google.codelabs.weatherapplication.database.forecast.hourly.entities

import androidx.room.ColumnInfo

data class AllCityCurrentWeather(
    @ColumnInfo(name = "city_name") val city: String,
    @ColumnInfo(name = "dt") val dt: Long,
    @ColumnInfo(name = "timezone_offset") val timezone_offset: Long,
    @ColumnInfo(name = "temp") val temp: Float,
    @ColumnInfo(name = "icon") val icon: String,
)
