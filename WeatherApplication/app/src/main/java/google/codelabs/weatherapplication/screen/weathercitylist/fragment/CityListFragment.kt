package google.codelabs.weatherapplication.screen.weathercitylist.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.FragmentCityListBinding
import google.codelabs.weatherapplication.screen.weathercitylist.adapters.CityListViewAdapter

class CityListFragment : Fragment(R.layout.fragment_city_list) {
    private lateinit var binding: FragmentCityListBinding

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
        with(binding.cityList) {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = CityListViewAdapter().also { it.data = listOf("Moscow", "Never", "Sleep") }
        }

    }

    private fun initToolbar() {
        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

    }

}