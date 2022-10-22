package google.codelabs.weatherapplication.screen.weathercitylist.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.DiffUtil.DiffResult
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.databinding.ItemCityListBinding
import google.codelabs.weatherapplication.repository.forecast.entities.CityWeather
import google.codelabs.weatherapplication.screen.bind

typealias CityItemClickListener = (String) -> Unit

class CityListViewAdapter(
    private val context: Context,
    private val onClickListener: CityItemClickListener
) :
    RecyclerView.Adapter<CityListViewAdapter.CityItemViewHolder>() {

    var anotherCitiesWeather: List<CityWeather> = emptyList()
        set(newValue) {
            val diffCallback = CityListDiffCallback(field, newValue)
            val diffResult = DiffUtil.calculateDiff(diffCallback)
            field = newValue
            diffResult.dispatchUpdatesTo(this)
        }

    private val layoutInflater = LayoutInflater.from(context)

    class CityItemViewHolder(
        val binding: ItemCityListBinding
    ) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityItemViewHolder =
        CityItemViewHolder(
            ItemCityListBinding.inflate(
                layoutInflater,
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: CityItemViewHolder, position: Int) {
        val binding = holder.binding
        val item = anotherCitiesWeather[position]
        binding.bind(item)

        binding.root.setOnClickListener {
            onClickListener(item.city)
        }
    }

    override fun getItemCount(): Int =
        anotherCitiesWeather.size

}