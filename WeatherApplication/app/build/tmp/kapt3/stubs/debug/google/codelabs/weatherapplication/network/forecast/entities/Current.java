package google.codelabs.weatherapplication.network.forecast.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0007H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\u009b\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u000209H\u00d6\u0001J\t\u0010:\u001a\u00020;H\u00d6\u0001R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018\u00a8\u0006<"}, d2 = {"Lgoogle/codelabs/weatherapplication/network/forecast/entities/Current;", "", "dt", "", "sunrise", "sunset", "temp", "", "feels_like", "pressure", "humidity", "dew_point", "uvi", "clouds", "visibility", "wind_speed", "wind_deg", "weather", "", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/Weather;", "(JJJFFJJFFJJFJLjava/util/List;)V", "getClouds", "()J", "getDew_point", "()F", "getDt", "getFeels_like", "getHumidity", "getPressure", "getSunrise", "getSunset", "getTemp", "getUvi", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind_deg", "getWind_speed", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Current {
    @com.squareup.moshi.Json(name = "dt")
    private final long dt = 0L;
    @com.squareup.moshi.Json(name = "sunrise")
    private final long sunrise = 0L;
    @com.squareup.moshi.Json(name = "sunset")
    private final long sunset = 0L;
    @com.squareup.moshi.Json(name = "temp")
    private final float temp = 0.0F;
    @com.squareup.moshi.Json(name = "feels_like")
    private final float feels_like = 0.0F;
    @com.squareup.moshi.Json(name = "pressure")
    private final long pressure = 0L;
    @com.squareup.moshi.Json(name = "humidity")
    private final long humidity = 0L;
    @com.squareup.moshi.Json(name = "dew_point")
    private final float dew_point = 0.0F;
    @com.squareup.moshi.Json(name = "uvi")
    private final float uvi = 0.0F;
    @com.squareup.moshi.Json(name = "clouds")
    private final long clouds = 0L;
    @com.squareup.moshi.Json(name = "visibility")
    private final long visibility = 0L;
    @com.squareup.moshi.Json(name = "wind_speed")
    private final float wind_speed = 0.0F;
    @com.squareup.moshi.Json(name = "wind_deg")
    private final long wind_deg = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weather")
    private final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> weather = null;
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.network.forecast.entities.Current copy(long dt, long sunrise, long sunset, float temp, float feels_like, long pressure, long humidity, float dew_point, float uvi, long clouds, long visibility, float wind_speed, long wind_deg, @org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> weather) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Current(long dt, long sunrise, long sunset, float temp, float feels_like, long pressure, long humidity, float dew_point, float uvi, long clouds, long visibility, float wind_speed, long wind_deg, @org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> weather) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getDt() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getSunrise() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getSunset() {
        return 0L;
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    public final float getTemp() {
        return 0.0F;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    public final float getFeels_like() {
        return 0.0F;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getPressure() {
        return 0L;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long getHumidity() {
        return 0L;
    }
    
    public final float component8() {
        return 0.0F;
    }
    
    public final float getDew_point() {
        return 0.0F;
    }
    
    public final float component9() {
        return 0.0F;
    }
    
    public final float getUvi() {
        return 0.0F;
    }
    
    public final long component10() {
        return 0L;
    }
    
    public final long getClouds() {
        return 0L;
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final long getVisibility() {
        return 0L;
    }
    
    public final float component12() {
        return 0.0F;
    }
    
    public final float getWind_speed() {
        return 0.0F;
    }
    
    public final long component13() {
        return 0L;
    }
    
    public final long getWind_deg() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> getWeather() {
        return null;
    }
}