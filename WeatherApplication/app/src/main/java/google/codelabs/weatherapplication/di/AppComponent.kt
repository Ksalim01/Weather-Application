package google.codelabs.weatherapplication.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragment
import google.codelabs.weatherapplication.screen.weathercitylist.fragment.CityListFragment
import javax.inject.Singleton

@Singleton
@Component(modules = [
    HourlyForecastDBModule::class,
    DailyForecastModule::class,
    GeocoderModule::class,
    NetworkModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(fragment: CityWeatherFragment)
    fun inject(fragment: CityListFragment)
}