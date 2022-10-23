package google.codelabs.weatherapplication.network.forecast.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u0091\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u000208H\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017\u00a8\u00069"}, d2 = {"Lgoogle/codelabs/weatherapplication/network/forecast/entities/Hourly;", "", "dt", "", "temp", "", "feels_like", "pressure", "humidity", "dew_point", "uvi", "clouds", "visibility", "wind_speed", "wind_deg", "pop", "weather", "", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/Weather;", "(JFFJJFFJJFJFLjava/util/List;)V", "getClouds", "()J", "getDew_point", "()F", "getDt", "getFeels_like", "getHumidity", "getPop", "getPressure", "getTemp", "getUvi", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind_deg", "getWind_speed", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Hourly {
    @com.squareup.moshi.Json(name = "dt")
    private final long dt = 0L;
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
    @com.squareup.moshi.Json(name = "pop")
    private final float pop = 0.0F;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weather")
    private final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> weather = null;
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.network.forecast.entities.Hourly copy(long dt, float temp, float feels_like, long pressure, long humidity, float dew_point, float uvi, long clouds, long visibility, float wind_speed, long wind_deg, float pop, @org.jetbrains.annotations.NotNull()
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
    
    public Hourly(long dt, float temp, float feels_like, long pressure, long humidity, float dew_point, float uvi, long clouds, long visibility, float wind_speed, long wind_deg, float pop, @org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> weather) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getDt() {
        return 0L;
    }
    
    public final float component2() {
        return 0.0F;
    }
    
    public final float getTemp() {
        return 0.0F;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final float getFeels_like() {
        return 0.0F;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getPressure() {
        return 0L;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getHumidity() {
        return 0L;
    }
    
    public final float component6() {
        return 0.0F;
    }
    
    public final float getDew_point() {
        return 0.0F;
    }
    
    public final float component7() {
        return 0.0F;
    }
    
    public final float getUvi() {
        return 0.0F;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final long getClouds() {
        return 0L;
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long getVisibility() {
        return 0L;
    }
    
    public final float component10() {
        return 0.0F;
    }
    
    public final float getWind_speed() {
        return 0.0F;
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final long getWind_deg() {
        return 0L;
    }
    
    public final float component12() {
        return 0.0F;
    }
    
    public final float getPop() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> getWeather() {
        return null;
    }
}