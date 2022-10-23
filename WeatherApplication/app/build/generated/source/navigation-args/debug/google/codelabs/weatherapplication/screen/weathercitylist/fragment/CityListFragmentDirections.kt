package google.codelabs.weatherapplication.screen.weathercitylist.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import google.codelabs.weatherapplication.R

public class CityListFragmentDirections private constructor() {
  public companion object {
    public fun actionCityListFragmentToCitySearchFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_cityListFragment_to_citySearchFragment)
  }
}
