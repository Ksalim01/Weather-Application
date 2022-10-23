package google.codelabs.weatherapplication.screen.cityweather.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import google.codelabs.weatherapplication.R

public class CityWeatherFragmentDirections private constructor() {
  public companion object {
    public fun actionCityWeatherFragmentToCityListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_cityWeatherFragment_to_cityListFragment)
  }
}
