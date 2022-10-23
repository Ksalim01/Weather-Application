package google.codelabs.weatherapplication.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lgoogle/codelabs/weatherapplication/di/AppComponent;", "", "inject", "", "fragment", "Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchFragment;", "Lgoogle/codelabs/weatherapplication/screen/cityweather/fragment/CityWeatherFragment;", "Lgoogle/codelabs/weatherapplication/screen/weathercitylist/fragment/CityListFragment;", "Factory", "app_debug"})
@dagger.Component(modules = {google.codelabs.weatherapplication.di.HourlyForecastDBModule.class, google.codelabs.weatherapplication.di.DailyForecastModule.class, google.codelabs.weatherapplication.di.GeocoderModule.class, google.codelabs.weatherapplication.di.NetworkModule.class, google.codelabs.weatherapplication.di.ForecastRepositoryModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.screen.weathercitylist.fragment.CityListFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.screen.citysearch.CitySearchFragment fragment);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lgoogle/codelabs/weatherapplication/di/AppComponent$Factory;", "", "create", "Lgoogle/codelabs/weatherapplication/di/AppComponent;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract google.codelabs.weatherapplication.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context context);
    }
}