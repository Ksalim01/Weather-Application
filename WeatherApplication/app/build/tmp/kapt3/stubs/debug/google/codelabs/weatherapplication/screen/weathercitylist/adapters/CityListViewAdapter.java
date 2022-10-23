package google.codelabs.weatherapplication.screen.weathercitylist.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016R0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/weathercitylist/adapters/CityListViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lgoogle/codelabs/weatherapplication/screen/weathercitylist/adapters/CityListViewAdapter$CityItemViewHolder;", "context", "Landroid/content/Context;", "onClickListener", "Lkotlin/Function1;", "", "", "Lgoogle/codelabs/weatherapplication/screen/weathercitylist/adapters/CityItemClickListener;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "newValue", "", "Lgoogle/codelabs/weatherapplication/repository/forecast/entities/CityWeather;", "anotherCitiesWeather", "getAnotherCitiesWeather", "()Ljava/util/List;", "setAnotherCitiesWeather", "(Ljava/util/List;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CityItemViewHolder", "app_debug"})
public final class CityListViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<google.codelabs.weatherapplication.screen.weathercitylist.adapters.CityListViewAdapter.CityItemViewHolder> {
    private final android.content.Context context = null;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<google.codelabs.weatherapplication.repository.forecast.entities.CityWeather> anotherCitiesWeather;
    private final android.view.LayoutInflater layoutInflater = null;
    
    public CityListViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.repository.forecast.entities.CityWeather> getAnotherCitiesWeather() {
        return null;
    }
    
    public final void setAnotherCitiesWeather(@org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.repository.forecast.entities.CityWeather> newValue) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public google.codelabs.weatherapplication.screen.weathercitylist.adapters.CityListViewAdapter.CityItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.screen.weathercitylist.adapters.CityListViewAdapter.CityItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/weathercitylist/adapters/CityListViewAdapter$CityItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lgoogle/codelabs/weatherapplication/databinding/ItemCityListBinding;", "(Lgoogle/codelabs/weatherapplication/databinding/ItemCityListBinding;)V", "getBinding", "()Lgoogle/codelabs/weatherapplication/databinding/ItemCityListBinding;", "app_debug"})
    public static final class CityItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final google.codelabs.weatherapplication.databinding.ItemCityListBinding binding = null;
        
        public CityItemViewHolder(@org.jetbrains.annotations.NotNull()
        google.codelabs.weatherapplication.databinding.ItemCityListBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final google.codelabs.weatherapplication.databinding.ItemCityListBinding getBinding() {
            return null;
        }
    }
}