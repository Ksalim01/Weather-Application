package google.codelabs.weatherapplication.repository.forecast;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010 \u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0019\u0010\'\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lgoogle/codelabs/weatherapplication/repository/forecast/ForecastRepository;", "Lgoogle/codelabs/weatherapplication/repository/forecast/CityForecastDataProvider;", "Lgoogle/codelabs/weatherapplication/repository/forecast/CityExistence;", "Lgoogle/codelabs/weatherapplication/repository/forecast/CityListDataProvider;", "dailyForecastDao", "Lgoogle/codelabs/weatherapplication/database/forecast/daily/dao/DailyForecastDao;", "hourlyForecastDao", "Lgoogle/codelabs/weatherapplication/database/forecast/hourly/dao/HourlyForecastDao;", "forecastNetworkService", "Lgoogle/codelabs/weatherapplication/network/forecast/ForecastNetworkService;", "geocoder", "Landroid/location/Geocoder;", "(Lgoogle/codelabs/weatherapplication/database/forecast/daily/dao/DailyForecastDao;Lgoogle/codelabs/weatherapplication/database/forecast/hourly/dao/HourlyForecastDao;Lgoogle/codelabs/weatherapplication/network/forecast/ForecastNetworkService;Landroid/location/Geocoder;)V", "addCity", "Lgoogle/codelabs/weatherapplication/repository/forecast/entities/UpdateResult;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allCityWeather", "", "Lgoogle/codelabs/weatherapplication/repository/forecast/entities/CityWeather;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkCityExistence", "Lgoogle/codelabs/weatherapplication/repository/forecast/entities/CityAddressResult;", "currentWeather", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/CurrentWeatherEntity;", "dailyForecast", "Lgoogle/codelabs/weatherapplication/database/forecast/daily/entities/DailyForecastEntity;", "fetchData", "Lgoogle/codelabs/weatherapplication/repository/forecast/entities/NetworkResponseResult;", "hourlyForecast", "Lgoogle/codelabs/weatherapplication/database/forecast/hourly/entities/HourlyForecastEntity;", "isDataUpToDate", "", "updateDBFrom", "", "oneCallData", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/OneCallData;", "(Lgoogle/codelabs/weatherapplication/network/forecast/entities/OneCallData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateData", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class ForecastRepository implements google.codelabs.weatherapplication.repository.forecast.CityForecastDataProvider, google.codelabs.weatherapplication.repository.forecast.CityExistence, google.codelabs.weatherapplication.repository.forecast.CityListDataProvider {
    private final google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao dailyForecastDao = null;
    private final google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao hourlyForecastDao = null;
    private final google.codelabs.weatherapplication.network.forecast.ForecastNetworkService forecastNetworkService = null;
    private final android.location.Geocoder geocoder = null;
    @org.jetbrains.annotations.NotNull()
    public static final google.codelabs.weatherapplication.repository.forecast.ForecastRepository.Companion Companion = null;
    private static final java.lang.String TAG = "ForecastRepository";
    
    @javax.inject.Inject()
    public ForecastRepository(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao dailyForecastDao, @org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao hourlyForecastDao, @org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.network.forecast.ForecastNetworkService forecastNetworkService, @org.jetbrains.annotations.NotNull()
    android.location.Geocoder geocoder) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object currentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object hourlyForecast(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object dailyForecast(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addCity(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super google.codelabs.weatherapplication.repository.forecast.entities.UpdateResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object checkCityExistence(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super google.codelabs.weatherapplication.repository.forecast.entities.CityAddressResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateData(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super google.codelabs.weatherapplication.repository.forecast.entities.UpdateResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object allCityWeather(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<google.codelabs.weatherapplication.repository.forecast.entities.CityWeather>> continuation) {
        return null;
    }
    
    private final java.lang.Object fetchData(java.lang.String city, kotlin.coroutines.Continuation<? super google.codelabs.weatherapplication.repository.forecast.entities.NetworkResponseResult> continuation) {
        return null;
    }
    
    private final java.lang.Object updateDBFrom(google.codelabs.weatherapplication.network.forecast.entities.OneCallData oneCallData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object isDataUpToDate(java.lang.String city, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lgoogle/codelabs/weatherapplication/repository/forecast/ForecastRepository$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}