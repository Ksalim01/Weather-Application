package google.codelabs.weatherapplication.screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a6\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00010\u000bj\b\u0012\u0004\u0012\u0002H\u0006`\f\u001a%\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u0006\u00a2\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013*(\u0010\u0014\u001a\u0004\b\u0000\u0010\u0006\"\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00010\u000b\u00a8\u0006\u0015"}, d2 = {"bind", "", "Lgoogle/codelabs/weatherapplication/databinding/ItemCityListBinding;", "item", "Lgoogle/codelabs/weatherapplication/repository/forecast/entities/CityWeather;", "listenResults", "T", "Landroidx/fragment/app/Fragment;", "key", "", "listener", "Lkotlin/Function1;", "Lgoogle/codelabs/weatherapplication/screen/ResultsListener;", "sendResultToPreviousFragment", "result", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/Object;)V", "sharedPreferences", "Lgoogle/codelabs/weatherapplication/App;", "context", "Landroid/content/Context;", "ResultsListener", "app_debug"})
public final class FragmentExtensionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final google.codelabs.weatherapplication.App sharedPreferences(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$sharedPreferences, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Send some results to the previous fragment.
     */
    public static final <T extends java.lang.Object>void sendResultToPreviousFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$sendResultToPreviousFragment, @org.jetbrains.annotations.NotNull()
    java.lang.String key, T result) {
    }
    
    public static final <T extends java.lang.Object>void listenResults(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$listenResults, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> listener) {
    }
    
    public static final void bind(@org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.databinding.ItemCityListBinding $this$bind, @org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.repository.forecast.entities.CityWeather item) {
    }
}