package google.codelabs.weatherapplication.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import google.codelabs.weatherapplication.screen.MainActivityComponent
import google.codelabs.weatherapplication.screen.citysearch.CitySearchFragment
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragment
import google.codelabs.weatherapplication.screen.weathercitylist.fragment.CityListFragment
import javax.inject.Scope
import javax.inject.Singleton

@ApplicationScope
@Component(
    modules = [
        HourlyForecastDBModule::class,
        DailyForecastModule::class,
        GeocoderModule::class,
        NetworkModule::class,
        ForecastRepositoryModule::class,
        AppSubcomponents::class
    ]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun mainActivityComponent(): MainActivityComponent.Factory
}