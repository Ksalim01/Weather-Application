package google.codelabs.weatherapplication.screen.weathercitylist.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.databinding.ItemCityListBinding
import google.codelabs.weatherapplication.repository.forecast.entities.CityListWeather
import google.codelabs.weatherapplication.screen.cityweather.utils.dateFormat
import google.codelabs.weatherapplication.screen.cityweather.utils.kelvinToCelsius
import google.codelabs.weatherapplication.screen.cityweather.utils.toTempMaxMin
import google.codelabs.weatherapplication.screen.cityweather.utils.toTemperature

class CityListViewAdapter :
    RecyclerView.Adapter<CityListViewAdapter.CityItemViewHolder>() {

    var data: List<CityListWeather> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    class CityItemViewHolder(
        val binding: ItemCityListBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                Log.d("cityAdapter", binding.city.text.toString())
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCityListBinding.inflate(inflater, parent, false)
        return CityItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: CityItemViewHolder, position: Int) {
        val item = data[position]
        with(holder.binding) {
            city.text = item.city
            cityTemperature.text = toTemperature(item.current_temp)
            maxMinTemp.text = toTempMaxMin(item.temp_max, item.temp_min)
            date.text = dateFormat(item.dt, item.timezone_offset)
        }
    }
}