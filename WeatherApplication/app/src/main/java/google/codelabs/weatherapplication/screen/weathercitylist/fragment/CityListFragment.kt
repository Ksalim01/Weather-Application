package google.codelabs.weatherapplication.screen.weathercitylist.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import google.codelabs.weatherapplication.databinding.FragmentCityListBinding
import google.codelabs.weatherapplication.databinding.FragmentCityWeatherBinding

class CityListFragment : Fragment() {
    private lateinit var binding: FragmentCityListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        binding = FragmentCityListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    private fun initAll() {
        initCityList()
    }

    private fun initCityList() {

    }
}