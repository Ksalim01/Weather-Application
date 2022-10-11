package google.codelabs.weatherapplication.repository.utils

import android.content.Context
import google.codelabs.weatherapplication.database.forecast.daily.DailyForecastDB
import google.codelabs.weatherapplication.database.forecast.hourly.HourlyForecastDB
import google.codelabs.weatherapplication.network.forecast.ForecastNetworkService
import google.codelabs.weatherapplication.repository.forecast.ForecastRepository
import google.codelabs.weatherapplication.screen.cityweather.fragment.ForecastViewModelFactory

interface ViewModelFactoryProvider {
    fun provideForecastViewModelFactory(context: Context): ForecastViewModelFactory
}

val Injector: ViewModelFactoryProvider
    get() = DefaultViewModelProvider

private object DefaultViewModelProvider: ViewModelFactoryProvider {
    private fun getPlantRepository(context: Context): ForecastRepository {
        return ForecastRepository.getInstance(
            dailyDao(context),
            hourlyDao(context),
            forecastNetworkService()
        )
    }

    private fun forecastNetworkService() = ForecastNetworkService()


    private fun hourlyDao(context: Context) =
        HourlyForecastDB.getInstance(context.applicationContext).hourlyForecastDao()

    private fun dailyDao(context: Context) =
        DailyForecastDB.getInstance(context.applicationContext).dailyForecastDao()


    override fun provideForecastViewModelFactory(context: Context): ForecastViewModelFactory {
        val repository = getPlantRepository(context)
        return ForecastViewModelFactory(repository)
    }
}