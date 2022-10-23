package google.codelabs.weatherapplication.screen.cityweather.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020\u0014H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006("}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/cityweather/fragment/CityWeatherFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lgoogle/codelabs/weatherapplication/screen/cityweather/fragment/CityWeatherFragmentArgs;", "getArgs", "()Lgoogle/codelabs/weatherapplication/screen/cityweather/fragment/CityWeatherFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lgoogle/codelabs/weatherapplication/databinding/FragmentCityWeatherBinding;", "city", "", "viewModel", "Lgoogle/codelabs/weatherapplication/screen/cityweather/viewmodels/ForecastViewModel;", "getViewModel", "()Lgoogle/codelabs/weatherapplication/screen/cityweather/viewmodels/ForecastViewModel;", "setViewModel", "(Lgoogle/codelabs/weatherapplication/screen/cityweather/viewmodels/ForecastViewModel;)V", "changeVisibility", "", "v", "", "hide", "initAll", "initCurrentWeather", "initDailyForecastLinerLayout", "initHourlyForecastRecyclerView", "initToolbar", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "showFragment", "Companion", "app_debug"})
public final class CityWeatherFragment extends androidx.fragment.app.Fragment {
    private google.codelabs.weatherapplication.databinding.FragmentCityWeatherBinding binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @javax.inject.Inject()
    public google.codelabs.weatherapplication.screen.cityweather.viewmodels.ForecastViewModel viewModel;
    private java.lang.String city = "";
    @org.jetbrains.annotations.NotNull()
    public static final google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CITY_KEY = "CITY_KEY";
    
    public CityWeatherFragment() {
        super();
    }
    
    private final google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.screen.cityweather.viewmodels.ForecastViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.screen.cityweather.viewmodels.ForecastViewModel p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initAll() {
    }
    
    private final void initToolbar() {
    }
    
    private final void hide() {
    }
    
    private final void showFragment() {
    }
    
    private final void changeVisibility(int v) {
    }
    
    private final void initHourlyForecastRecyclerView() {
    }
    
    private final void initDailyForecastLinerLayout() {
    }
    
    private final void initCurrentWeather() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/cityweather/fragment/CityWeatherFragment$Companion;", "", "()V", "CITY_KEY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}