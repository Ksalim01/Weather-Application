package google.codelabs.weatherapplication.repository.forecast;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lgoogle/codelabs/weatherapplication/repository/forecast/CityForecastDataProvider;", "", "currentWeather", "", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/CurrentWeatherEntity;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dailyForecast", "Lgoogle/codelabs/weatherapplication/database/forecast/daily/entities/DailyForecastEntity;", "hourlyForecast", "Lgoogle/codelabs/weatherapplication/database/forecast/hourly/entities/HourlyForecastEntity;", "updateData", "Lgoogle/codelabs/weatherapplication/repository/forecast/entities/UpdateResult;", "app_debug"})
public abstract interface CityForecastDataProvider {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object currentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object hourlyForecast(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object dailyForecast(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateData(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super google.codelabs.weatherapplication.repository.forecast.entities.UpdateResult> continuation);
}