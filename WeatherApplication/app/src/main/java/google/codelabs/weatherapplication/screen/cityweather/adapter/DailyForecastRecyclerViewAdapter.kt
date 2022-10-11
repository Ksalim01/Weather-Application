package google.codelabs.weatherapplication.screen.cityweather.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.databinding.RecycleViewItemDayForecastBinding
import google.codelabs.weatherapplication.screen.cityweather.utils.*


class DailyForecastRecyclerViewAdapter : RecyclerView.Adapter<DailyForecastRecyclerViewAdapter.TimeTemperatureViewHolder>() {

    var data: List<HourlyForecastEntity> = emptyList()
        set(value) {
            for (i in value.indices) {
                if (value[i].dt >= currentTime()) {
                    field =
                    if (i + NUMBER_OF_DISPLAYING_HOURS < value.size) {
                        value.subList(i, i + NUMBER_OF_DISPLAYING_HOURS)
                    } else {
                        value
                    }
                    break
                }
            }
            notifyDataSetChanged()
        }

    class TimeTemperatureViewHolder (
        val binding : RecycleViewItemDayForecastBinding
            ): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeTemperatureViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecycleViewItemDayForecastBinding.inflate(inflater, parent, false)
        return TimeTemperatureViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TimeTemperatureViewHolder, position: Int) {
        val item = data[position]
        with(holder.binding) {
            temperature.text = toTemperature(item.temp)
            time.text = unixToCurrentTime(item.dt, item.timezone_offset)
            hourlyWeatherIcon.setImageResource(map(item.icon))
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    companion object {
        const val NUMBER_OF_DISPLAYING_HOURS = 24
    }
}