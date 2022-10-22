package google.codelabs.weatherapplication.screen.cityweather.utils

import android.location.Geocoder
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.screen.cityweather.fragment.Coordinates
import java.util.*

fun abbreviateDay(day: String) = when (day.lowercase()) {
    "понедельник" -> "ПН"
    "вторник" -> "ВТ"
    "среда" -> "СР"
    "четверг" -> "ЧТ"
    "пятница" -> "ПТ"
    "суббота" -> "СБ"
    "воскресенье" -> "ВС"
    else -> ""
}

fun cityName(lat: Float, long: Float, geocoder: Geocoder): String? =
    try {
        val res = geocoder.getFromLocation(lat.toDouble(), long.toDouble(), 1)
        res.get(0).locality.toString()
    } catch (e: Exception) {
        null
    }

fun cityCoordinates(city: String, geocoder: Geocoder): Coordinates? {
    val res = geocoder.getFromLocationName(city, 1)
    return Coordinates(
        res.get(0).latitude.toFloat(),
        res.get(0).longitude.toFloat()
    )
}

fun country(city: String, geocoder: Geocoder): String = try {
    val res = geocoder.getFromLocationName(city, 1)
    res.get(0).countryName
} catch (e: Exception) {
    ""
}

fun currentUnixTime(): Long {
    var time = Calendar.getInstance().timeInMillis / 1000
    time -= unixToDate(time).subSequence(14, 16).toString().toLong() * 60 +
            unixToDate(time).subSequence(17, 19).toString().toLong()
    return time
}

fun currentDay(offset: Long): String {
    val time = Calendar.getInstance().timeInMillis / 1000 - currentTimeZoneOffset() + offset
    return dateToDay(unixToDate(time))
}

fun currentUnixDay(offset: Long): Long {
    var time = Calendar.getInstance().timeInMillis / 1000
    time -= unixToDate(time).subSequence(14, 16).toString().toLong() * 60 +
            unixToDate(time).subSequence(17, 19).toString().toLong() +
            unixToDate(time).subSequence(11, 13).toString().toLong() * 3600
    return time - currentTimeZoneOffset() + offset
}

fun currentDayOfWeek(time: Long, offset: Long = currentTimeZoneOffset()) =
    unixToDayOfWeek(time - currentTimeZoneOffset() + offset)


fun currentTime(offset: Long = currentTimeZoneOffset()): Long {
    val current = Calendar.getInstance().time
    return current.time / 1000 - currentTimeZoneOffset() + offset
}

fun currentTimeZoneOffset() = GregorianCalendar().timeZone.rawOffset.toLong() / 1000

fun dateToDay(date: String) = date.subSequence(0, 10).toString()

fun mapIcon(icon: String) = when (icon) {
    "01d" -> R.drawable.ic_01d
    "02d" -> R.drawable.ic_02d
    "03d" -> R.drawable.ic_03d
    "04d" -> R.drawable.ic_04d
    "09d" -> R.drawable.ic_09d
    "10d" -> R.drawable.ic_10d
    "11d" -> R.drawable.ic_11d
    "13d" -> R.drawable.ic_13d
    "01n" -> R.drawable.ic_01n
    "02n" -> R.drawable.ic_02n
    "03n" -> R.drawable.ic_03n
    "04n" -> R.drawable.ic_04n
    "09n" -> R.drawable.ic_09n
    "10n" -> R.drawable.ic_10n
    "11n" -> R.drawable.ic_11n
    "13n" -> R.drawable.ic_13n
    else -> R.drawable.ic_04d
}

fun mapBackground(icon: String) = when (icon) {
    "01d" -> R.drawable.background_sunny_day
    "02d" -> R.drawable.background_sunny_day
    "03d" -> R.drawable.background_sunny_day
    "04d" -> R.drawable.background_sunny_day
    "09d" -> R.drawable.background_rain
    "10d" -> R.drawable.background_light_rain
    "11d" -> R.drawable.background_rain
    "13d" -> R.drawable.background_rain
    "01n" -> R.drawable.background_night
    "02n" -> R.drawable.background_night
    "03n" -> R.drawable.background_night
    "04n" -> R.drawable.background_night
    "09n" -> R.drawable.background_rain
    "10n" -> R.drawable.background_rain
    "11n" -> R.drawable.background_rain
    "13n" -> R.drawable.background_rain
    else -> R.drawable.background_sunny_day
}

fun kelvinToCelsius(temp: Float) = (temp - 273.15F).toInt()


fun unixToDate(time: Long, offset: Long = currentTimeZoneOffset()): String {
    val sdf = java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
    val date = java.util.Date((time - currentTimeZoneOffset() + offset) * 1000)
    return sdf.format(date)
}

fun dateWithoutHours(time: Long, offset: Long = currentTimeZoneOffset()): String =
    unixToDate(time, offset).substring(0, 10)

fun unixToDayOfWeek(time: Long, offset: Long = currentTimeZoneOffset()): String {
    val sdf = java.text.SimpleDateFormat("EEEE")
    val date = java.util.Date((time - currentTimeZoneOffset() + offset) * 1000)
    return sdf.format(date)
}

fun unixToHours(date: Long) = unixToDate(date).substring(11, 16)

fun unixToCurrentTime(time: Long, offset: Long): String =
    unixToHours(time - currentTimeZoneOffset() + offset)

fun offsetToGMT(seconds: Long) =
    if (seconds >= 0) "GMT+${seconds / 3600}"
    else "GMT${seconds / 3600}"

fun uvToString(uv: Float): String = when {
    uv < 2.5F -> "Низкий"
    uv < 7.5F -> "Средний"
    else -> "Высокий"
}