package google.codelabs.weatherapplication.screen.citysearch

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.databinding.ItemCitySearchBinding

class CitySearchListAdapter:
    RecyclerView.Adapter<CitySearchListAdapter.CitySearchListHolder>() {

    var data: List<CityAddress> = emptyList()
        set(value)  {
            field = value
            notifyDataSetChanged()
        }

    class CitySearchListHolder(
        val binding: ItemCitySearchBinding
    ): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitySearchListHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCitySearchBinding.inflate(inflater, parent, false)
        return CitySearchListHolder(binding)
    }

    override fun onBindViewHolder(holder: CitySearchListHolder, position: Int) {
        val item = data[position]
        with (holder.binding) {
            city.text = item.city.lowercase().replaceFirstChar { it.uppercase() }
            region.text = item.country
        }
    }

    override fun getItemCount(): Int = data.size
}