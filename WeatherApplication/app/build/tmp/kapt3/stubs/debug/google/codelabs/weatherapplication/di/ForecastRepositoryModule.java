package google.codelabs.weatherapplication.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lgoogle/codelabs/weatherapplication/di/ForecastRepositoryModule;", "", "provideCityAdding", "Lgoogle/codelabs/weatherapplication/repository/forecast/CityAdding;", "repo", "Lgoogle/codelabs/weatherapplication/repository/forecast/ForecastRepository;", "provideCityExistence", "Lgoogle/codelabs/weatherapplication/repository/forecast/CityExistence;", "provideCityForecastDataProvider", "Lgoogle/codelabs/weatherapplication/repository/forecast/CityForecastDataProvider;", "provideCityListDataProvider", "Lgoogle/codelabs/weatherapplication/repository/forecast/CityListDataProvider;", "app_debug"})
@dagger.Module()
public abstract interface ForecastRepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract google.codelabs.weatherapplication.repository.forecast.CityForecastDataProvider provideCityForecastDataProvider(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.repository.forecast.ForecastRepository repo);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract google.codelabs.weatherapplication.repository.forecast.CityAdding provideCityAdding(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.repository.forecast.ForecastRepository repo);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract google.codelabs.weatherapplication.repository.forecast.CityListDataProvider provideCityListDataProvider(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.repository.forecast.ForecastRepository repo);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract google.codelabs.weatherapplication.repository.forecast.CityExistence provideCityExistence(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.repository.forecast.ForecastRepository repo);
}