package google.codelabs.weatherapplication.screen.weathercitylist.adapters

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.databinding.FragmentCityListBinding
import google.codelabs.weatherapplication.databinding.RecyclerViewCityItemBinding

class CityListViewAdapter :
    RecyclerView.Adapter<CityListViewAdapter.CityListViewHolder>() {

    //var cityList :

        class CityListViewHolder(binding: RecyclerViewCityItemBinding) :
                RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityListViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CityListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}