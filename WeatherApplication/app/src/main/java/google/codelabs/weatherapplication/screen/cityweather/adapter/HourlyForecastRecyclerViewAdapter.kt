package google.codelabs.weatherapplication.screen.cityweather.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity
import google.codelabs.weatherapplication.databinding.ItemHourlyForecastBinding
import google.codelabs.weatherapplication.screen.cityweather.utils.*
import java.lang.Integer.min


class HourlyForecastRecyclerViewAdapter :
    RecyclerView.Adapter<HourlyForecastRecyclerViewAdapter.TimeTemperatureViewHolder>() {

    var data: List<HourlyForecastEntity> = emptyList()
        set(value) {
            for (i in value.indices) {
                if (value[i].dt >= currentTime()) {
                    field = value.subList(i, min(i + NUMBER_OF_DISPLAYING_HOURS, value.size))
                    break
                }
            }
            notifyDataSetChanged()
        }

    class TimeTemperatureViewHolder (
        val binding : ItemHourlyForecastBinding
            ): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeTemperatureViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemHourlyForecastBinding.inflate(inflater, parent, false)
        return TimeTemperatureViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TimeTemperatureViewHolder, position: Int) {
        val item = data[position]
        with(holder.binding) {
            temperature.text = toTemperature(item.temp)
            time.text = unixToCurrentTime(item.dt, item.timezone_offset)
            hourlyWeatherIcon.setImageResource(mapIcon(item.icon))
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    companion object {
        const val NUMBER_OF_DISPLAYING_HOURS = 24
    }
}