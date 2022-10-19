package google.codelabs.weatherapplication.screen.cityweather.utils


fun<T> toHumidity(humidity: T) : String = "${humidity}%"

fun toTempMaxMin(max: Float, min: Float) : String {
    return "${toTemperature(max)}/${toTemperature(min)}"
}

fun toDayOfWeek(time: Long, offset: Long) : String = abbreviateDay(currentDayOfWeek(time, offset)).lowercase() + ", "

fun dateFormat(time: Long, offset: Long) : String {
    val sdf = java.text.SimpleDateFormat("EEE, d MMM hh:mm")
    val date = java.util.Date((time - currentTimeZoneOffset() + offset) * 1000)
    return sdf.format(date)
}

fun toTemperature(temp: Float) = "${kelvinToCelsius(temp)}°"

fun toSpeed(temp: Float) = "${temp.toInt()} км/ч"
