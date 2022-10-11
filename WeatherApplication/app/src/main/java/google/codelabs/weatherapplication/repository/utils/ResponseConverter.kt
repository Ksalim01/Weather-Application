package google.codelabs.weatherapplication.repository.utils

import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity
import google.codelabs.weatherapplication.network.forecast.entities.OneCallData


fun toHourlyForecastEntity(response: OneCallData) = response.hourly.map {
        HourlyForecastEntity(
            lat = response.lat,
            lon = response.lon,
            dt = it.dt,
            timezone_offset = response.timezone_offset,
            temp = it.temp,
            feels_like = it.feels_like,
            humidity = it.humidity,
            wind_speed = it.wind_speed,
            wind_deg = it.wind_deg,
            uvi = it.uvi,
            icon = it.weather[0].icon
        )
    }.toList()

fun toDailyForecastEntity(response: OneCallData) = response.daily.map {
    DailyForecastEntity(
        lat = response.lat,
        lon = response.lon,
        dt = it.dt,
        timezone_offset = response.timezone_offset,
        sunrise = it.sunrise,
        sunset = it.sunset,
        temp_morn = it.temp.morn,
        temp_day = it.temp.day,
        temp_eve = it.temp.eve,
        temp_night = it.temp.night,
        temp_max = it.temp.max,
        temp_min = it.temp.min,
        feels_like_morn = it.feels_like.morn,
        feels_like_day = it.feels_like.day,
        feels_like_eve = it.feels_like.eve,
        feels_like_night = it.feels_like.night,
        humidity = it.humidity,
        wind_speed = it.wind_speed,
        wind_deg = it.wind_deg,
        uvi = it.uvi,
        icon = it.weather[0].icon
    )
}.toList()

fun toCurrentWeatherEntity(response: OneCallData) = response.let {
    CurrentWeatherEntity(
        timezone_offset = it.timezone_offset,
        temp = it.current.temp,
        feels_like = it.current.feels_like,
        humidity = it.current.humidity,
        wind_speed = it.current.wind_speed,
        icon = it.current.weather[0].icon
    )
}
