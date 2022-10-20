package google.codelabs.weatherapplication.screen.weathercitylist.fragment

import android.content.Context
import android.opengl.Visibility
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.App
import google.codelabs.weatherapplication.MainFragment
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.FragmentCityListBinding
import google.codelabs.weatherapplication.screen.BounceEdgeEffectFactory
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragment.Companion.CITY_KEY
import google.codelabs.weatherapplication.screen.cityweather.utils.dateFormat
import google.codelabs.weatherapplication.screen.cityweather.utils.offsetToGMT
import google.codelabs.weatherapplication.screen.cityweather.utils.toTempMaxMin
import google.codelabs.weatherapplication.screen.cityweather.utils.toTemperature
import google.codelabs.weatherapplication.screen.sendResultToPreviousFragment
import google.codelabs.weatherapplication.screen.sharedPreferences
import google.codelabs.weatherapplication.screen.weathercitylist.adapters.CityListViewAdapter
import google.codelabs.weatherapplication.screen.weathercitylist.viewmodels.CityListViewModel
import javax.inject.Inject

class CityListFragment : Fragment(R.layout.fragment_city_list) {
    private lateinit var binding: FragmentCityListBinding

    @Inject
    lateinit var cityListViewModel: CityListViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireContext().applicationContext as App).appComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCityListBinding.bind(view)

        cityListViewModel.launchCityListData(sharedPreferences(requireContext()).getFavouritePlace()!!)
        initAll()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        cityListViewModel.otherCitiesWeather.removeObservers(viewLifecycleOwner)
        cityListViewModel.favouriteCityWeather.removeObservers(viewLifecycleOwner)
    }

    private fun initAll() {
        hideAll()
        initCityList()
        initToolbar()
    }

    private fun initCityList() {

        val cityListViewAdapter = CityListViewAdapter(requireContext()) {
            sendResultToPreviousFragment(CITY_KEY, it)
            findNavController().navigateUp()
        }

        cityListViewModel.otherCitiesWeather.observe(viewLifecycleOwner) {
            cityListViewAdapter.anotherCitiesWeather = it
            cityListViewAdapter.notifyDataSetChanged()
            showAll()
        }

        cityListViewModel.favouriteCityWeather.observe(viewLifecycleOwner) {
            cityListViewAdapter.favouriteCityWeather = it
            cityListViewAdapter.notifyDataSetChanged()
            showAll()
        }

        with(binding.cityList) {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = cityListViewAdapter
            edgeEffectFactory = BounceEdgeEffectFactory()
        }
    }


    private fun initToolbar() {
        binding.toolbar.inflateMenu(R.menu.menu_city_list)
        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        binding.toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.addCity -> {
                    findNavController().navigate(R.id.action_cityListFragment_to_citySearchFragment)
                    true
                }
                else -> false
            }
        }
    }

    private fun hideAll() {
        changeVisibility(View.GONE)
    }

    private fun showAll() {
        changeVisibility(View.VISIBLE)
    }

    private fun changeVisibility(visibility: Int) {
        with(binding) {
            cityList.visibility = visibility
        }
    }
}