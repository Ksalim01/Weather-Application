package google.codelabs.weatherapplication.screen.cityweather.adapter

import android.content.Context
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.FragmentCityWeatherBinding
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity
import google.codelabs.weatherapplication.screen.cityweather.utils.*


class CurrentWeatherAdapter(
    private val binding: FragmentCityWeatherBinding,
    private val context: Context
) {

    var data: CurrentWeatherEntity? = null
    set(value) {
        field = value
        onUpdateLayout()
    }

    private fun onUpdateLayout() {
        if (data == null ) return

        with(binding.nestedScroll.uvWindHumidity) {
            humidityValue.text = toHumidity(data!!.humidity)
            windRate.text = toSpeed(data!!.wind_speed)
        }

        with(binding) {
            currentTemperature.text = toTemperature(data!!.temp)
            feelsLike.text = context.getString(R.string.feels_like) + " " + toTemperature(data!!.feels_like)
            currentTime.timeZone = offsetToGMT(data!!.timezone_offset)
            root.setBackgroundResource(mapBackground(data!!.icon))
            currentWeatherIcon.setImageResource(mapIcon(data!!.icon))
            cityName.text = data!!.city
            toolCity.text = cityName.text
        }
    }
}