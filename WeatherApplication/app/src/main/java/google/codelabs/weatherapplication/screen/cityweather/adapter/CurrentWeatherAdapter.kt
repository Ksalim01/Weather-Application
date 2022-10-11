package google.codelabs.weatherapplication.screen.cityweather.adapter

import android.content.Context
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.FragmentCityWeatherBinding
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity
import google.codelabs.weatherapplication.utils.*


class CurrentWeatherAdapter(
    private val binding: FragmentCityWeatherBinding,
    private val context: Context
) {

    var data: CurrentWeatherEntity? = null
    set(value) {
        field = value
        onCreateLayout()
    }

    private fun onCreateLayout() {
        if (data != null ) {
            with(binding.nestedScroll.uvWindHumidity) {
                humidityValue.text = data!!.humidity.toString() + "%"
                windRate.text = data!!.wind_speed.toInt().toString() + " км/ч"
            }
            with(binding) {
                currentTemperature.text = kelvinToCelsius(data!!.temp).toString() + "\u00B0"
                feelsLike.text = context.getString(R.string.feels_like) + " " + kelvinToCelsius(data!!.feels_like).toString() + "\u00B0"
                currentTime.timeZone = data!!.timezone
                root.setBackgroundResource(mapBackground(data!!.icon))
                currentWeatherIcon.setImageResource(map(data!!.icon))
            }
        }
    }
}