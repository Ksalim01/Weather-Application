package google.codelabs.weatherapplication.di

import dagger.Binds
import dagger.Module
import google.codelabs.weatherapplication.repository.forecast.CityAdding
import google.codelabs.weatherapplication.repository.forecast.CityForecastDataProvider
import google.codelabs.weatherapplication.repository.forecast.ForecastRepository

@Module
interface ForecastRepositoryModule {

    @Binds
    fun provideForecastRepository(repo: ForecastRepository) : CityForecastDataProvider

    @Binds
    fun provideCityAdding(repo: ForecastRepository) : CityAdding
}