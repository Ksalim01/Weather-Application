package google.codelabs.weatherapplication.screen.weathercitylist.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J.\u0010\u001b\u001a\u00020\u00172\u001c\u0010\u001c\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001dH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u001aR!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\'\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/weathercitylist/viewmodels/CityListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lgoogle/codelabs/weatherapplication/repository/forecast/CityListDataProvider;", "(Lgoogle/codelabs/weatherapplication/repository/forecast/CityListDataProvider;)V", "_favouriteCityWeather", "Landroidx/lifecycle/MutableLiveData;", "Lgoogle/codelabs/weatherapplication/repository/forecast/entities/CityWeather;", "get_favouriteCityWeather", "()Landroidx/lifecycle/MutableLiveData;", "_favouriteCityWeather$delegate", "Lkotlin/Lazy;", "_otherCitiesWeather", "", "get_otherCitiesWeather", "_otherCitiesWeather$delegate", "favouriteCityWeather", "Landroidx/lifecycle/LiveData;", "getFavouriteCityWeather", "()Landroidx/lifecycle/LiveData;", "otherCitiesWeather", "getOtherCitiesWeather", "divideCityListWeather", "", "cityWeather", "favouriteCity", "", "launch", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)V", "launchCityListData", "launchCityListDataWithNewCity", "newCity", "app_debug"})
@javax.inject.Singleton()
public final class CityListViewModel extends androidx.lifecycle.ViewModel {
    private final google.codelabs.weatherapplication.repository.forecast.CityListDataProvider repository = null;
    private final kotlin.Lazy _otherCitiesWeather$delegate = null;
    private final kotlin.Lazy _favouriteCityWeather$delegate = null;
    
    @javax.inject.Inject()
    public CityListViewModel(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.repository.forecast.CityListDataProvider repository) {
        super();
    }
    
    private final androidx.lifecycle.MutableLiveData<java.util.List<google.codelabs.weatherapplication.repository.forecast.entities.CityWeather>> get_otherCitiesWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<google.codelabs.weatherapplication.repository.forecast.entities.CityWeather>> getOtherCitiesWeather() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<google.codelabs.weatherapplication.repository.forecast.entities.CityWeather> get_favouriteCityWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<google.codelabs.weatherapplication.repository.forecast.entities.CityWeather> getFavouriteCityWeather() {
        return null;
    }
    
    public final void launchCityListData(@org.jetbrains.annotations.NotNull()
    java.lang.String favouriteCity) {
    }
    
    public final void launchCityListDataWithNewCity(@org.jetbrains.annotations.NotNull()
    java.lang.String newCity) {
    }
    
    private final void divideCityListWeather(java.util.List<google.codelabs.weatherapplication.repository.forecast.entities.CityWeather> cityWeather, java.lang.String favouriteCity) {
    }
    
    private final void launch(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
    }
}