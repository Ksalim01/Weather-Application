package google.codelabs.weatherapplication.screen.weathercitylist.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.ItemCityListBinding
import google.codelabs.weatherapplication.databinding.ItemCityListDescriptionBinding
import google.codelabs.weatherapplication.repository.forecast.entities.CityWeather
import google.codelabs.weatherapplication.screen.bind
import google.codelabs.weatherapplication.screen.cityweather.utils.*

typealias CityItemClickListener = (String) -> Unit

class CityListViewAdapter(
    private val context: Context,
    private val onClickListener: CityItemClickListener
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var favouriteCityWeather: CityWeather? = null

    var anotherCitiesWeather: List<CityWeather> = emptyList()

    private val layoutInflater = LayoutInflater.from(context)

    class CityItemViewHolder(
        val binding: ItemCityListBinding
    ) : RecyclerView.ViewHolder(binding.root)

    class CityListDescriptionViewHolder(
        val binding: ItemCityListDescriptionBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun getItemViewType(position: Int): Int =
        when (position) {
            0 -> FAVOURITE_CITY
            2 -> ANOTHER_CITIES
            else -> CITY_WEATHER
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            FAVOURITE_CITY, ANOTHER_CITIES -> CityListDescriptionViewHolder(
                ItemCityListDescriptionBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
            )
            CITY_WEATHER -> CityItemViewHolder(
                ItemCityListBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
            )
            else -> throw java.lang.IllegalStateException("Unknown item type")
        }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            FAVOURITE_CITY -> {
                val binding = (holder as CityListDescriptionViewHolder).binding.root
                binding.text = context.getString(R.string.favourite_place)
            }
            ANOTHER_CITIES -> {
                val binding = (holder as CityListDescriptionViewHolder).binding.root
                binding.text = context.getString(R.string.another_places)
            }
            CITY_WEATHER -> {
                val binding = (holder as CityItemViewHolder).binding
                val item =
                    if (position == 1) favouriteCityWeather!! else anotherCitiesWeather[position - 3]

                binding.bind(item)
                if (position == 1) {
                    Log.d("CityListAdapter", "$position, ${item.city}")
                    binding.city.setCompoundDrawablesRelativeWithIntrinsicBounds(
                        R.drawable.ic_location,
                        0,
                        0,
                        0
                    )
                }

                binding.root.setOnClickListener {
                    onClickListener(item.city)
                }
            }
        }
    }

    override fun getItemCount(): Int =
        anotherCitiesWeather.size + NUMBER_OF_DESCRIPTIONS + 1

    companion object {
        const val NUMBER_OF_DESCRIPTIONS = 2

        const val FAVOURITE_CITY = 0
        const val ANOTHER_CITIES = 1
        const val CITY_WEATHER = 2
    }
}