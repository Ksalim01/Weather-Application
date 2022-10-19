package google.codelabs.weatherapplication.screen.weathercitylist.fragment

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.App
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.FragmentCityListBinding
import google.codelabs.weatherapplication.screen.BounceEdgeEffectFactory
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCityListBinding.bind(view)

        initAll()
    }

    private fun initAll() {
        initCityList()
        initToolbar()
    }

    private fun initCityList() {
        cityListViewModel.launchCityListData()

        val cityListViewAdapter = CityListViewAdapter()
        cityListViewModel.cityListWeather.observe(viewLifecycleOwner) {
            cityListViewAdapter.data = it
        }

        with(binding.cityList) {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = cityListViewAdapter
            //edgeEffectFactory = BounceEdgeEffectFactory()
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
}