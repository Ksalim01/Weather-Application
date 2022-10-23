package google.codelabs.weatherapplication.screen.cityweather.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u001f\u001a\u00020 2\u001c\u0010!\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0012\u0004\u0018\u00010%0\"H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0016\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\'\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000f\u0010\tR\'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0013\u0010\tR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/cityweather/viewmodels/ForecastViewModel;", "Landroidx/lifecycle/ViewModel;", "forecastRepository", "Lgoogle/codelabs/weatherapplication/repository/forecast/CityForecastDataProvider;", "(Lgoogle/codelabs/weatherapplication/repository/forecast/CityForecastDataProvider;)V", "_currentForecastData", "Landroidx/lifecycle/MutableLiveData;", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/CurrentWeatherEntity;", "get_currentForecastData", "()Landroidx/lifecycle/MutableLiveData;", "_currentForecastData$delegate", "Lkotlin/Lazy;", "_dailyForecastData", "", "Lgoogle/codelabs/weatherapplication/database/forecast/daily/entities/DailyForecastEntity;", "get_dailyForecastData", "_dailyForecastData$delegate", "_hourlyForecastData", "Lgoogle/codelabs/weatherapplication/database/forecast/hourly/entities/HourlyForecastEntity;", "get_hourlyForecastData", "_hourlyForecastData$delegate", "cityParameters", "Lgoogle/codelabs/weatherapplication/screen/cityweather/fragment/Coordinates;", "currentForecastData", "Landroidx/lifecycle/LiveData;", "getCurrentForecastData", "()Landroidx/lifecycle/LiveData;", "dailyForecastData", "getDailyForecastData", "hourlyForecastData", "getHourlyForecastData", "launchDataLoad", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "setCityParameters", "city", "", "update", "", "app_debug"})
public final class ForecastViewModel extends androidx.lifecycle.ViewModel {
    private final google.codelabs.weatherapplication.repository.forecast.CityForecastDataProvider forecastRepository = null;
    private google.codelabs.weatherapplication.screen.cityweather.fragment.Coordinates cityParameters;
    private final kotlin.Lazy _dailyForecastData$delegate = null;
    private final kotlin.Lazy _hourlyForecastData$delegate = null;
    private final kotlin.Lazy _currentForecastData$delegate = null;
    
    @javax.inject.Inject()
    public ForecastViewModel(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.repository.forecast.CityForecastDataProvider forecastRepository) {
        super();
    }
    
    private final androidx.lifecycle.MutableLiveData<java.util.List<google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity>> get_dailyForecastData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity>> getDailyForecastData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.util.List<google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity>> get_hourlyForecastData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity>> getHourlyForecastData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity> get_currentForecastData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity> getCurrentForecastData() {
        return null;
    }
    
    public final void setCityParameters(@org.jetbrains.annotations.NotNull()
    java.lang.String city, boolean update) {
    }
    
    private final kotlinx.coroutines.Job launchDataLoad(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
}