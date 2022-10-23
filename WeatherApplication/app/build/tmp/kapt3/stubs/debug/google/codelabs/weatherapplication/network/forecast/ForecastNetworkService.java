package google.codelabs.weatherapplication.network.forecast;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ#\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lgoogle/codelabs/weatherapplication/network/forecast/ForecastNetworkService;", "Lgoogle/codelabs/weatherapplication/network/forecast/BaseRetrofitService;", "retrofit", "Lgoogle/codelabs/weatherapplication/network/forecast/api/WeatherAPI;", "geocoder", "Landroid/location/Geocoder;", "(Lgoogle/codelabs/weatherapplication/network/forecast/api/WeatherAPI;Landroid/location/Geocoder;)V", "fetchOneCallData", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/OneCallData;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchOneCallDataWithException", "(Ljava/lang/String;Landroid/location/Geocoder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class ForecastNetworkService extends google.codelabs.weatherapplication.network.forecast.BaseRetrofitService {
    private final google.codelabs.weatherapplication.network.forecast.api.WeatherAPI retrofit = null;
    private final android.location.Geocoder geocoder = null;
    @org.jetbrains.annotations.NotNull()
    public static final google.codelabs.weatherapplication.network.forecast.ForecastNetworkService.Companion Companion = null;
    private static final java.lang.String TAG = "ForecastNetworkService";
    private static final java.lang.String WEATHER_TOKEN = "b56d20a251f31d5b793420704b6909b6";
    
    @javax.inject.Inject()
    public ForecastNetworkService(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.network.forecast.api.WeatherAPI retrofit, @org.jetbrains.annotations.NotNull()
    android.location.Geocoder geocoder) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchOneCallData(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super google.codelabs.weatherapplication.network.forecast.entities.OneCallData> continuation) {
        return null;
    }
    
    private final java.lang.Object fetchOneCallDataWithException(java.lang.String city, android.location.Geocoder geocoder, kotlin.coroutines.Continuation<? super google.codelabs.weatherapplication.network.forecast.entities.OneCallData> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lgoogle/codelabs/weatherapplication/network/forecast/ForecastNetworkService$Companion;", "", "()V", "TAG", "", "WEATHER_TOKEN", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}