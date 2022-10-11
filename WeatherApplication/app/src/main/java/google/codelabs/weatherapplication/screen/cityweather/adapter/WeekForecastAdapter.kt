package google.codelabs.weatherapplication.screen.cityweather.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity
import google.codelabs.weatherapplication.databinding.FragmentCityWeatherBinding
import google.codelabs.weatherapplication.screen.cityweather.utils.*
import java.lang.Integer.min


class WeekForecastAdapter(
    private val context: Context,
    private val binding: FragmentCityWeatherBinding,
    private val layoutInflater: LayoutInflater
) {

    var data: List<DailyForecastEntity> = emptyList()
        set(value) {
            field = value
            if (value.isNotEmpty()) {
                onCreateLayout()
            }
        }

    private var items = mutableListOf<View>()

    private fun onCreateLayout() {
        if (items.isNotEmpty()) {
            binding.nestedScroll.weekForecast.removeAllViews()
            items.clear()
        }

        Log.e("weekForecastAdapter", data.size.toString())

        for (day in data.subList(0, min(data.size, MAX_DAYS))) {

            val item = layoutInflater.inflate(R.layout.week_list_item, null)

            item.findViewById<TextView>(R.id.day).text = unixToDayOfWeek(day.dt, day.timezone_offset)
            item.findViewById<TextView>(R.id.daily_humidity).text = toHumidity(day.humidity)
            item.findViewById<ImageView>(R.id.daily_icon).setImageResource(map(day.icon))
            item.findViewById<TextView>(R.id.max_min_temp).text = toTempMaxMin(day.temp_max, day.temp_min)

            if (dateToDay(unixToDate(day.dt, day.timezone_offset)) == currentDay(day.timezone_offset)) {
                item.findViewById<TextView>(R.id.day).text = context.getString(R.string.today)
                binding.nestedScroll.sunsetSunrise.sunriseTime.text = unixToCurrentTime(day.sunrise, day.timezone_offset)
                binding.nestedScroll.sunsetSunrise.sunsetTime.text = unixToCurrentTime(day.sunset, day.timezone_offset)
                binding.nestedScroll.uvWindHumidity.uvIndex.text = uvToString(day.uvi)
                binding.tempMinMaxT.text = toTempMaxMin(day.temp_max, day.temp_min)
                binding.currentDay.text = toDayOfWeek(day.timezone_offset)
            }

            items.add(item)
            binding.nestedScroll.weekForecast.addView(item)
        }
    }

    companion object {
        const val MAX_DAYS = 7
    }
}