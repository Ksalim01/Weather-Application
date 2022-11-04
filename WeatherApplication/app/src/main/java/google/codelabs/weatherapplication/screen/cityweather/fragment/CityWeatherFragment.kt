package google.codelabs.weatherapplication.screen.cityweather.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.FragmentCityWeatherBinding
import google.codelabs.weatherapplication.screen.MainActivity
import google.codelabs.weatherapplication.screen.cityweather.adapter.CurrentWeatherAdapter
import google.codelabs.weatherapplication.screen.cityweather.adapter.DailyForecastAdapter
import google.codelabs.weatherapplication.screen.cityweather.adapter.HourlyForecastRecyclerViewAdapter
import google.codelabs.weatherapplication.screen.cityweather.viewmodels.ForecastViewModel
import google.codelabs.weatherapplication.screen.listenResults
import javax.inject.Inject

class CityWeatherFragment : Fragment(R.layout.fragment_city_weather) {
    private lateinit var binding : FragmentCityWeatherBinding

    private val args by navArgs<CityWeatherFragmentArgs>()

    @Inject
    lateinit var viewModel: ForecastViewModel

    private var city: String = ""

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity as MainActivity).mainActivityComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        city = args.city
        viewModel.setCityParameters(city, true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCityWeatherBinding.bind(view)

        listenResults<String>(CITY_KEY) {
            city = it
            viewModel.setCityParameters(city, false)
        }

        initAll()
    }

    private fun initAll() {
        hide()
        initToolbar()
        initHourlyForecastRecyclerView()
        initDailyForecastLinerLayout()
        initCurrentWeather()
    }

    private fun initToolbar() {
        binding.toolbar.inflateMenu(R.menu.menu_scrolling)
        binding.toolbar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.cityList -> {
                    findNavController().navigate(R.id.action_cityWeatherFragment_to_cityListFragment)
                    true
                }
                R.id.refresh -> {
                    hide()
                    viewModel.setCityParameters(city, true)
                    true
                }
                else -> super.onOptionsItemSelected(it)
            }
        }
    }

    private fun hide() {
        changeVisibility(View.GONE)
        binding.progressBar.visibility = View.VISIBLE
    }

    private fun showFragment() {
        changeVisibility(View.VISIBLE)
        binding.progressBar.visibility = View.GONE
    }

    private fun changeVisibility(v: Int) {
        with(binding) {
            nestedScroll.root.visibility = v
            appBar.visibility = v
            cityName.visibility = v
            currentTemperature.visibility = v
            tempMinMax.visibility = v
            feelsLike.visibility = v
            currentWeatherIcon.visibility = v
            toolbar.visibility = v
        }
    }

    private fun initHourlyForecastRecyclerView() {
        val hourlyRecyclerView = binding.nestedScroll.dayForecast
        val dayAdapter = HourlyForecastRecyclerViewAdapter()

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

    companion object {
        const val CITY_KEY = "CITY_KEY"
    }
}
