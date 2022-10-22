package google.codelabs.weatherapplication.screen.weathercitylist.adapters

import androidx.recyclerview.widget.DiffUtil
import google.codelabs.weatherapplication.repository.forecast.entities.CityWeather

class CityListDiffCallback(
    private val oldData: List<CityWeather>,
    private val newData: List<CityWeather>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldData.size

    override fun getNewListSize(): Int = newData.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldData[oldItemPosition].city == newData[newItemPosition].city

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldData[oldItemPosition] == newData[newItemPosition]
}