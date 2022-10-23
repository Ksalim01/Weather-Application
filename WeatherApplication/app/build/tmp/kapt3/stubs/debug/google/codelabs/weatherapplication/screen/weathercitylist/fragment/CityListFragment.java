package google.codelabs.weatherapplication.screen.weathercitylist.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\fH\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\"\u001a\u00020\fH\u0002J\u0010\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006%"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/weathercitylist/fragment/CityListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lgoogle/codelabs/weatherapplication/databinding/FragmentCityListBinding;", "cityListViewModel", "Lgoogle/codelabs/weatherapplication/screen/weathercitylist/viewmodels/CityListViewModel;", "getCityListViewModel", "()Lgoogle/codelabs/weatherapplication/screen/weathercitylist/viewmodels/CityListViewModel;", "setCityListViewModel", "(Lgoogle/codelabs/weatherapplication/screen/weathercitylist/viewmodels/CityListViewModel;)V", "changeVisibility", "", "visibility", "", "createCityListAdapter", "Lgoogle/codelabs/weatherapplication/screen/weathercitylist/adapters/CityListViewAdapter;", "hideAll", "initAll", "initCityList", "initToolbar", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onItemClickListener", "city", "", "onViewCreated", "view", "Landroid/view/View;", "showAll", "subscribeToUpdates", "cityListViewAdapter", "app_debug"})
public final class CityListFragment extends androidx.fragment.app.Fragment {
    private google.codelabs.weatherapplication.databinding.FragmentCityListBinding binding;
    @javax.inject.Inject()
    public google.codelabs.weatherapplication.screen.weathercitylist.viewmodels.CityListViewModel cityListViewModel;
    
    public CityListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.screen.weathercitylist.viewmodels.CityListViewModel getCityListViewModel() {
        return null;
    }
    
    public final void setCityListViewModel(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.screen.weathercitylist.viewmodels.CityListViewModel p0) {
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void initAll() {
    }
    
    private final void initCityList() {
    }
    
    private final void initToolbar() {
    }
    
    private final google.codelabs.weatherapplication.screen.weathercitylist.adapters.CityListViewAdapter createCityListAdapter() {
        return null;
    }
    
    private final void onItemClickListener(java.lang.String city) {
    }
    
    private final void subscribeToUpdates(google.codelabs.weatherapplication.screen.weathercitylist.adapters.CityListViewAdapter cityListViewAdapter) {
    }
    
    private final void hideAll() {
    }
    
    private final void showAll() {
    }
    
    private final void changeVisibility(int visibility) {
    }
}