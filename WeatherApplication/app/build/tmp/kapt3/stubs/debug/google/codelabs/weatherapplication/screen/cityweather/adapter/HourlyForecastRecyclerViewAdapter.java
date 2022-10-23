package google.codelabs.weatherapplication.screen.cityweather.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/cityweather/adapter/HourlyForecastRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lgoogle/codelabs/weatherapplication/screen/cityweather/adapter/HourlyForecastRecyclerViewAdapter$TimeTemperatureViewHolder;", "()V", "value", "", "Lgoogle/codelabs/weatherapplication/database/forecast/hourly/entities/HourlyForecastEntity;", "data", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "TimeTemperatureViewHolder", "app_debug"})
public final class HourlyForecastRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<google.codelabs.weatherapplication.screen.cityweather.adapter.HourlyForecastRecyclerViewAdapter.TimeTemperatureViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity> data;
    @org.jetbrains.annotations.NotNull()
    public static final google.codelabs.weatherapplication.screen.cityweather.adapter.HourlyForecastRecyclerViewAdapter.Companion Companion = null;
    public static final int NUMBER_OF_DISPLAYING_HOURS = 24;
    
    public HourlyForecastRecyclerViewAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public google.codelabs.weatherapplication.screen.cityweather.adapter.HourlyForecastRecyclerViewAdapter.TimeTemperatureViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.screen.cityweather.adapter.HourlyForecastRecyclerViewAdapter.TimeTemperatureViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/cityweather/adapter/HourlyForecastRecyclerViewAdapter$TimeTemperatureViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lgoogle/codelabs/weatherapplication/databinding/ItemHourlyForecastBinding;", "(Lgoogle/codelabs/weatherapplication/databinding/ItemHourlyForecastBinding;)V", "getBinding", "()Lgoogle/codelabs/weatherapplication/databinding/ItemHourlyForecastBinding;", "app_debug"})
    public static final class TimeTemperatureViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final google.codelabs.weatherapplication.databinding.ItemHourlyForecastBinding binding = null;
        
        public TimeTemperatureViewHolder(@org.jetbrains.annotations.NotNull()
        google.codelabs.weatherapplication.databinding.ItemHourlyForecastBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final google.codelabs.weatherapplication.databinding.ItemHourlyForecastBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lgoogle/codelabs/weatherapplication/screen/cityweather/adapter/HourlyForecastRecyclerViewAdapter$Companion;", "", "()V", "NUMBER_OF_DISPLAYING_HOURS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}