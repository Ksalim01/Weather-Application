package google.codelabs.weatherapplication.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lgoogle/codelabs/weatherapplication/di/HourlyForecastDBModule;", "", "()V", "provideHourlyForecastDB", "Lgoogle/codelabs/weatherapplication/database/forecast/hourly/HourlyForecastDB;", "context", "Landroid/content/Context;", "provideHourlyForecastDBDao", "Lgoogle/codelabs/weatherapplication/database/forecast/hourly/dao/HourlyForecastDao;", "hourlyForecastDB", "Companion", "app_debug"})
@dagger.Module()
public final class HourlyForecastDBModule {
    @org.jetbrains.annotations.NotNull()
    public static final google.codelabs.weatherapplication.di.HourlyForecastDBModule.Companion Companion = null;
    private static final java.lang.String HOURLY_DATABASE = "weather.hourly";
    
    public HourlyForecastDBModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final google.codelabs.weatherapplication.database.forecast.hourly.HourlyForecastDB provideHourlyForecastDB(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao provideHourlyForecastDBDao(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.database.forecast.hourly.HourlyForecastDB hourlyForecastDB) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lgoogle/codelabs/weatherapplication/di/HourlyForecastDBModule$Companion;", "", "()V", "HOURLY_DATABASE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}