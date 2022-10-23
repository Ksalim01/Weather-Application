package google.codelabs.weatherapplication.screen.citysearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchListAdapter$CitySearchListHolder;", "onItemClickListener", "Lkotlin/Function1;", "", "", "Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchItemClickListener;", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "Lgoogle/codelabs/weatherapplication/repository/forecast/entities/CityAddress;", "data", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CitySearchListHolder", "app_debug"})
public final class CitySearchListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<google.codelabs.weatherapplication.screen.citysearch.CitySearchListAdapter.CitySearchListHolder> {
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onItemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<google.codelabs.weatherapplication.repository.forecast.entities.CityAddress> data;
    
    public CitySearchListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.repository.forecast.entities.CityAddress> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.repository.forecast.entities.CityAddress> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public google.codelabs.weatherapplication.screen.citysearch.CitySearchListAdapter.CitySearchListHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.screen.citysearch.CitySearchListAdapter.CitySearchListHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/citysearch/CitySearchListAdapter$CitySearchListHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lgoogle/codelabs/weatherapplication/databinding/ItemCitySearchBinding;", "(Lgoogle/codelabs/weatherapplication/databinding/ItemCitySearchBinding;)V", "getBinding", "()Lgoogle/codelabs/weatherapplication/databinding/ItemCitySearchBinding;", "app_debug"})
    public static final class CitySearchListHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final google.codelabs.weatherapplication.databinding.ItemCitySearchBinding binding = null;
        
        public CitySearchListHolder(@org.jetbrains.annotations.NotNull()
        google.codelabs.weatherapplication.databinding.ItemCitySearchBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final google.codelabs.weatherapplication.databinding.ItemCitySearchBinding getBinding() {
            return null;
        }
    }
}