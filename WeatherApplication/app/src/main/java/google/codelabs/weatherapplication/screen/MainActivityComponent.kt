package google.codelabs.weatherapplication.screen

import dagger.Component
import dagger.Subcomponent
import google.codelabs.weatherapplication.screen.citysearch.CitySearchFragment
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragment
import google.codelabs.weatherapplication.screen.weathercitylist.fragment.CityListFragment


@Subcomponent
@MainActivityScope
interface MainActivityComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): MainActivityComponent
    }

    fun inject(fragment: CitySearchFragment)
    fun inject(fragment: CityListFragment)
    fun inject(fragment: CityWeatherFragment)
}