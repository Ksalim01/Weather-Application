package google.codelabs.weatherapplication.screen

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import google.codelabs.weatherapplication.App
import google.codelabs.weatherapplication.databinding.ItemCityListBinding
import google.codelabs.weatherapplication.repository.forecast.entities.CityWeather
import google.codelabs.weatherapplication.screen.cityweather.utils.dateFormat
import google.codelabs.weatherapplication.screen.cityweather.utils.offsetToGMT
import google.codelabs.weatherapplication.screen.cityweather.utils.toTempMaxMin
import google.codelabs.weatherapplication.screen.cityweather.utils.toTemperature

fun Fragment.sharedPreferences(context: Context): App {
    return (context.applicationContext as App)
}

typealias ResultsListener<T> = (T) -> Unit

/**
 * Send some results to the previous fragment.
 */
fun <T> Fragment.sendResultToPreviousFragment(key: String, result: T) {
    findNavController().previousBackStackEntry?.savedStateHandle?.set(key, result)
}

fun <T> Fragment.listenResults(key: String, listener: ResultsListener<T>) {
    val liveData = findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<T>(key)
    liveData?.observe(viewLifecycleOwner) { result ->
        if (result != null) {
            listener(result)
            liveData.value = null
        }
    }
}

fun ItemCityListBinding.bind(item: CityWeather) {
    city.text = item.city
    cityTemperature.text = toTemperature(item.current_temp)
    maxMinTemp.text = toTempMaxMin(item.temp_max, item.temp_min)
    date.text = dateFormat(item.dt, item.timezone_offset)
    currentTime.timeZone = offsetToGMT(item.timezone_offset)
    country.text = item.country
}