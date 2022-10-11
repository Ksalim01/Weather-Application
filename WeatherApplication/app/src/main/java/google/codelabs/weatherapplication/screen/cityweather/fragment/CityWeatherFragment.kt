package google.codelabs.weatherapplication.screen.cityweather.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.FragmentCityWeatherBinding
import google.codelabs.weatherapplication.repository.forecast.ForecastRepository
import google.codelabs.weatherapplication.repository.utils.Injector
import google.codelabs.weatherapplication.screen.cityweather.adapter.CurrentWeatherAdapter
import google.codelabs.weatherapplication.screen.cityweather.adapter.DailyForecastRecyclerViewAdapter
import google.codelabs.weatherapplication.screen.cityweather.adapter.WeekForecastAdapter
import google.codelabs.weatherapplication.screen.cityweather.viewmodels.ForecastViewModel

class CityWeatherFragment : Fragment() {
    private lateinit var binding : FragmentCityWeatherBinding

    private lateinit var dailyRecyclerView: RecyclerView
    private var dayAdapter: DailyForecastRecyclerViewAdapter = DailyForecastRecyclerViewAdapter()

    private lateinit var weekLinearLayout: LinearLayout
    private lateinit var weekAdapter: WeekForecastAdapter

    private lateinit var currentWeatherAdapter: CurrentWeatherAdapter
    private lateinit var cityParameters: CityParameters

    private val viewModel: ForecastViewModel by viewModels {
        Injector.provideForecastViewModelFactory(requireContext())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cityParameters = requireArguments().getParcelable<CityParameters>(CITY_KEY)!!
        viewModel.setCityParameters(cityParameters)
        Log.d("cityWeatherFragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        binding = FragmentCityWeatherBinding.inflate(inflater, container, false)

        hide()
        initHourlyForecastRecyclerView()
        initCityViews()
        initWeekForecastLinerLayout()
        initCurrentWeather()

        return binding.root
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.inflateMenu(R.menu.menu_scrolling)
    }

    private fun initHourlyForecastRecyclerView() {
        dailyRecyclerView = binding.nestedScroll.dayForecast!!
        weekLinearLayout = binding.nestedScroll.weekForecast!!

        viewModel.hourlyForecastData.observe(viewLifecycleOwner) {
            dayAdapter.data = it
            if (it.isNotEmpty()) {
                showFragment()
            }
        }

        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        dailyRecyclerView.layoutManager = layoutManager
        dailyRecyclerView.adapter = dayAdapter
        dailyRecyclerView.setNestedScrollingEnabled(false)

    }

    private fun initWeekForecastLinerLayout() {
        val layoutInflater = LayoutInflater.from(requireContext())
        weekAdapter = WeekForecastAdapter(requireContext(), binding, layoutInflater)
        viewModel.dailyForecastData.observe(viewLifecycleOwner, Observer {
            weekAdapter.data = it
        })
    }

    private fun initCityViews() {
        binding.cityName.text = cityParameters.city
        binding.toolCity.text = cityParameters.city
    }

    private fun initCurrentWeather() {
        currentWeatherAdapter = CurrentWeatherAdapter(binding, requireContext())
        viewModel.currentForecastData.observe(viewLifecycleOwner, Observer {
            currentWeatherAdapter.data = it
        })

    }


    companion object {
        fun newInstance(cityParameters: CityParameters) : CityWeatherFragment {
            val bundle = Bundle()
            bundle.putParcelable(CITY_KEY, cityParameters)
            val fragment = CityWeatherFragment()
            fragment.arguments = bundle
            return fragment
        }

        const val CITY_KEY = "CITY_KEY"
    }
}

class ForecastViewModelFactory(
    private val repository: ForecastRepository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>) =
        ForecastViewModel(repository) as T
}