package google.codelabs.weatherapplication.di

import dagger.Binds
import dagger.Module
import google.codelabs.weatherapplication.repository.forecast.*

@Module
interface ForecastRepositoryModule {

    @Binds
    fun provideCityForecastDataProvider(repo: ForecastRepository): CityForecastDataProvider

    @Binds
    fun provideCityAdding(repo: ForecastRepository): CityAdding

    @Binds
    fun provideCityListDataProvider(repo: ForecastRepository): CityListDataProvider

    @Binds
    fun provideCityExistence(repo: ForecastRepository): CityExistence
}