package google.codelabs.weatherapplication.screen.citysearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\u001a\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\'"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lgoogle/codelabs/weatherapplication/databinding/FragmentCitySearchBinding;", "citySearchListAdapter", "Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchListAdapter;", "citySearchViewModel", "Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchViewModel;", "getCitySearchViewModel", "()Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchViewModel;", "setCitySearchViewModel", "(Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchViewModel;)V", "clearSearchResult", "", "handleSearchRequest", "text", "", "hideAll", "initAll", "initCityListSearch", "initSearchBar", "initToolbar", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showResponseText", "showSearchResult", "cityAddress", "Lgoogle/codelabs/weatherapplication/repository/forecast/entities/CityAddress;", "showSoftKeyboard", "subscribeToUpdates", "Companion", "app_debug"})
public final class CitySearchFragment extends androidx.fragment.app.Fragment {
    private google.codelabs.weatherapplication.databinding.FragmentCitySearchBinding binding;
    private google.codelabs.weatherapplication.screen.citysearch.CitySearchListAdapter citySearchListAdapter;
    @javax.inject.Inject()
    public google.codelabs.weatherapplication.screen.citysearch.CitySearchViewModel citySearchViewModel;
    @org.jetbrains.annotations.NotNull()
    private static final google.codelabs.weatherapplication.screen.citysearch.CitySearchFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String TAG = "CitySearchFragment";
    
    public CitySearchFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.screen.citysearch.CitySearchViewModel getCitySearchViewModel() {
        return null;
    }
    
    public final void setCitySearchViewModel(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.screen.citysearch.CitySearchViewModel p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void initAll() {
    }
    
    private final void initCityListSearch() {
    }
    
    private final void initToolbar() {
    }
    
    private final void showSoftKeyboard(android.view.View view) {
    }
    
    private final void initSearchBar() {
    }
    
    private final void handleSearchRequest(java.lang.String text) {
    }
    
    private final void showSearchResult(google.codelabs.weatherapplication.repository.forecast.entities.CityAddress cityAddress) {
    }
    
    private final void clearSearchResult() {
    }
    
    private final void showResponseText(java.lang.String text) {
    }
    
    private final void subscribeToUpdates() {
    }
    
    private final void hideAll() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}