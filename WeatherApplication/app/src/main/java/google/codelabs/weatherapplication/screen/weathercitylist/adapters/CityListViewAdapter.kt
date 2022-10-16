package google.codelabs.weatherapplication.screen.weathercitylist.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.databinding.ItemCityListBinding

class CityListViewAdapter :
    RecyclerView.Adapter<CityListViewAdapter.CityItemViewHolder>() {

    var data: List<String> = emptyList()
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
            city.text = item
        }
    }
}