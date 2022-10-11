package google.codelabs.weatherapplication.screen.cityweather.utils


fun<T> toHumidity(humidity: T) : String = "${humidity}%"

fun toTempMaxMin(max: Float, min: Float) : String {
    return "${toTemperature(max)}/${toTemperature(min)}"
}

fun toDayOfWeek(offset: Long) : String = abbreviateDay(currentDayOfWeek(offset)).lowercase() + ", "

fun toTemperature(temp: Float) = "${kelvinToCelsius(temp)}°"

fun toSpeed(temp: Float) = "${temp.toInt()} км/ч"
