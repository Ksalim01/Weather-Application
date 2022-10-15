package google.codelabs.weatherapplication.screen.cityweather.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.FragmentCityWeatherBinding
import google.codelabs.weatherapplication.databinding.FragmentMainBinding
import google.codelabs.weatherapplication.repository.forecast.ForecastRepository
import google.codelabs.weatherapplication.repository.utils.Injector
import google.codelabs.weatherapplication.screen.cityweather.adapter.CurrentWeatherAdapter
import google.codelabs.weatherapplication.screen.cityweather.adapter.HourlyForecastRecyclerViewAdapter
import google.codelabs.weatherapplication.screen.cityweather.adapter.DailyForecastAdapter
import google.codelabs.weatherapplication.screen.cityweather.viewmodels.ForecastViewModel

class CityWeatherFragment : Fragment(R.layout.fragment_city_weather) {
    private lateinit var binding : FragmentCityWeatherBinding

    private val args by navArgs<CityWeatherFragmentArgs>()

    private val viewModel: ForecastViewModel by viewModels {
        Injector.provideForecastViewModelFactory(requireContext())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.setCityParameters(CityParameters(args.lat, args.lon))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCityWeatherBinding.bind(view)
        
        hide()
        initAll()
    }


    private fun initAll() {
        initHourlyForecastRecyclerView()
        initDailyForecastLinerLayout()
        initCurrentWeather()
    }

    private fun hide() {
        with(binding) {
            nestedScroll.root.visibility = View.GONE
            progressBar.visibility = View.VISIBLE
            appBar.visibility = View.GONE
            cityName.visibility = View.GONE
            toolbar.visibility = View.GONE
        }
    }

    private fun showFragment() {
        with(binding) {
            nestedScroll.root.visibility = View.VISIBLE
            progressBar.visibility = View.GONE
            appBar.visibility = View.VISIBLE
            cityName.visibility = View.VISIBLE
            toolbar.visibility = View.VISIBLE
        }
    }

    private fun initHourlyForecastRecyclerView() {
        val hourlyRecyclerView = binding.nestedScroll.dayForecast
        val dayAdapter: HourlyForecastRecyclerViewAdapter = HourlyForecastRecyclerViewAdapter()

        viewModel.hourlyForecastData.observe(viewLifecycleOwner) {
            dayAdapter.data = it
            if (it.isNotEmpty()) {
                showFragment()
            }
        }

        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        hourlyRecyclerView.layoutManager = layoutManager
        hourlyRecyclerView.adapter = dayAdapter
        hourlyRecyclerView.isNestedScrollingEnabled = false
    }

    private fun initDailyForecastLinerLayout() {
        val layoutInflater = LayoutInflater.from(requireContext())
        val dailyForecastAdapter = DailyForecastAdapter(requireContext(), binding, layoutInflater)
        viewModel.dailyForecastData.observe(viewLifecycleOwner, Observer {
            dailyForecastAdapter.data = it
        })
    }

    private fun initCurrentWeather() {
        val currentWeatherAdapter = CurrentWeatherAdapter(binding, requireContext())
        viewModel.currentForecastData.observe(viewLifecycleOwner, Observer {
            currentWeatherAdapter.data = it
        })
    }
}

class ForecastViewModelFactory(
    private val repository: ForecastRepository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>) =
        ForecastViewModel(repository) as T
}