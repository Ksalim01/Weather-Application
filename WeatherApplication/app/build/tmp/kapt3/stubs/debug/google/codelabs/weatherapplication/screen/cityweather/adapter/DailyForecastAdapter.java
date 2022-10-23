package google.codelabs.weatherapplication.screen.cityweather.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/cityweather/adapter/DailyForecastAdapter;", "", "context", "Landroid/content/Context;", "binding", "Lgoogle/codelabs/weatherapplication/databinding/FragmentCityWeatherBinding;", "layoutInflater", "Landroid/view/LayoutInflater;", "(Landroid/content/Context;Lgoogle/codelabs/weatherapplication/databinding/FragmentCityWeatherBinding;Landroid/view/LayoutInflater;)V", "value", "", "Lgoogle/codelabs/weatherapplication/database/forecast/daily/entities/DailyForecastEntity;", "data", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "items", "", "Landroid/view/View;", "onCreateLayout", "", "Companion", "app_debug"})
public final class DailyForecastAdapter {
    private final android.content.Context context = null;
    private final google.codelabs.weatherapplication.databinding.FragmentCityWeatherBinding binding = null;
    private final android.view.LayoutInflater layoutInflater = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity> data;
    private java.util.List<android.view.View> items;
    @org.jetbrains.annotations.NotNull()
    public static final google.codelabs.weatherapplication.screen.cityweather.adapter.DailyForecastAdapter.Companion Companion = null;
    public static final int MAX_DAYS = 7;
    
    public DailyForecastAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.databinding.FragmentCityWeatherBinding binding, @org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater layoutInflater) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity> value) {
    }
    
    private final void onCreateLayout() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/cityweather/adapter/DailyForecastAdapter$Companion;", "", "()V", "MAX_DAYS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}