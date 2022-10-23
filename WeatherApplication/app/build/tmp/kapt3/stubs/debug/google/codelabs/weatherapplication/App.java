package google.codelabs.weatherapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fR\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lgoogle/codelabs/weatherapplication/App;", "Landroid/app/Application;", "()V", "appComponent", "Lgoogle/codelabs/weatherapplication/di/AppComponent;", "getAppComponent", "()Lgoogle/codelabs/weatherapplication/di/AppComponent;", "appComponent$delegate", "Lkotlin/Lazy;", "citySharedPreferences", "Landroid/content/SharedPreferences;", "getFavouritePlace", "", "onCreate", "", "setFavouritePlace", "city", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appComponent$delegate = null;
    private android.content.SharedPreferences citySharedPreferences;
    @org.jetbrains.annotations.NotNull()
    private static final google.codelabs.weatherapplication.App.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String CITY_PREFERENCES = "CITY_PREFERENCES";
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String CURRENT_CITY = "CURRENT_CITY";
    
    public App() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.di.AppComponent getAppComponent() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public final void setFavouritePlace(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFavouritePlace() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lgoogle/codelabs/weatherapplication/App$Companion;", "", "()V", "CITY_PREFERENCES", "", "CURRENT_CITY", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}