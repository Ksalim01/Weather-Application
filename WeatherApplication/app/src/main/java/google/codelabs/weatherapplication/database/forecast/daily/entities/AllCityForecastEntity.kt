package google.codelabs.weatherapplication.database.forecast.daily.entities

import androidx.room.ColumnInfo

data class AllCityForecastEntity(
    @ColumnInfo(name = "city_name") val city: String,
    @ColumnInfo(name = "country") val country: String,
    @ColumnInfo(name = "timezone_offset") val timezone_offset: Long,
    @ColumnInfo(name = "dt") val dt: Long,
    @ColumnInfo(name = "temp_min") val temp_min: Float,
    @ColumnInfo(name = "temp_max") val temp_max: Float,
)
