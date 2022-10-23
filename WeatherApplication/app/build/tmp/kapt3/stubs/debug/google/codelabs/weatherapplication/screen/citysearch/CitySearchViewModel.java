package google.codelabs.weatherapplication.screen.citysearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lgoogle/codelabs/weatherapplication/repository/forecast/CityExistence;", "(Lgoogle/codelabs/weatherapplication/repository/forecast/CityExistence;)V", "_response", "Landroidx/lifecycle/MutableLiveData;", "Lgoogle/codelabs/weatherapplication/repository/forecast/entities/CityAddressResult;", "get_response", "()Landroidx/lifecycle/MutableLiveData;", "_response$delegate", "Lkotlin/Lazy;", "getRepository", "()Lgoogle/codelabs/weatherapplication/repository/forecast/CityExistence;", "response", "Landroidx/lifecycle/LiveData;", "getResponse", "()Landroidx/lifecycle/LiveData;", "checkCityExistence", "", "city", "", "app_debug"})
public final class CitySearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final google.codelabs.weatherapplication.repository.forecast.CityExistence repository = null;
    private final kotlin.Lazy _response$delegate = null;
    
    @javax.inject.Inject()
    public CitySearchViewModel(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.repository.forecast.CityExistence repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.repository.forecast.CityExistence getRepository() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<google.codelabs.weatherapplication.repository.forecast.entities.CityAddressResult> get_response() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<google.codelabs.weatherapplication.repository.forecast.entities.CityAddressResult> getResponse() {
        return null;
    }
    
    public final void checkCityExistence(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
}