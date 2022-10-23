package google.codelabs.weatherapplication.network.forecast.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\tH\u00c6\u0003J\t\u00103\u001a\u00020\tH\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\tH\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\tH\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\tH\u00c6\u0003J\t\u0010>\u001a\u00020\u000bH\u00c6\u0003J\t\u0010?\u001a\u00020\rH\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u00b9\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\t2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010E\u001a\u00020FH\u00d6\u0001J\t\u0010G\u001a\u00020HH\u00d6\u0001R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d\u00a8\u0006I"}, d2 = {"Lgoogle/codelabs/weatherapplication/network/forecast/entities/Daily;", "", "dt", "", "sunrise", "sunset", "moonrise", "moonset", "moon_phase", "", "temp", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/Temp;", "feels_like", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/FeelsLike;", "pressure", "humidity", "dew_point", "wind_speed", "wind_deg", "uvi", "clouds", "pop", "weather", "", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/Weather;", "(JJJJJFLgoogle/codelabs/weatherapplication/network/forecast/entities/Temp;Lgoogle/codelabs/weatherapplication/network/forecast/entities/FeelsLike;JJFFJFJFLjava/util/List;)V", "getClouds", "()J", "getDew_point", "()F", "getDt", "getFeels_like", "()Lgoogle/codelabs/weatherapplication/network/forecast/entities/FeelsLike;", "getHumidity", "getMoon_phase", "getMoonrise", "getMoonset", "getPop", "getPressure", "getSunrise", "getSunset", "getTemp", "()Lgoogle/codelabs/weatherapplication/network/forecast/entities/Temp;", "getUvi", "getWeather", "()Ljava/util/List;", "getWind_deg", "getWind_speed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Daily {
    @com.squareup.moshi.Json(name = "dt")
    private final long dt = 0L;
    @com.squareup.moshi.Json(name = "sunrise")
    private final long sunrise = 0L;
    @com.squareup.moshi.Json(name = "sunset")
    private final long sunset = 0L;
    @com.squareup.moshi.Json(name = "moonrise")
    private final long moonrise = 0L;
    @com.squareup.moshi.Json(name = "moonset")
    private final long moonset = 0L;
    @com.squareup.moshi.Json(name = "moon_phase")
    private final float moon_phase = 0.0F;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "temp")
    private final google.codelabs.weatherapplication.network.forecast.entities.Temp temp = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "feels_like")
    private final google.codelabs.weatherapplication.network.forecast.entities.FeelsLike feels_like = null;
    @com.squareup.moshi.Json(name = "pressure")
    private final long pressure = 0L;
    @com.squareup.moshi.Json(name = "humidity")
    private final long humidity = 0L;
    @com.squareup.moshi.Json(name = "dew_point")
    private final float dew_point = 0.0F;
    @com.squareup.moshi.Json(name = "wind_speed")
    private final float wind_speed = 0.0F;
    @com.squareup.moshi.Json(name = "wind_deg")
    private final long wind_deg = 0L;
    @com.squareup.moshi.Json(name = "uvi")
    private final float uvi = 0.0F;
    @com.squareup.moshi.Json(name = "clouds")
    private final long clouds = 0L;
    @com.squareup.moshi.Json(name = "pop")
    private final float pop = 0.0F;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weather")
    private final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> weather = null;
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.network.forecast.entities.Daily copy(long dt, long sunrise, long sunset, long moonrise, long moonset, float moon_phase, @org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.network.forecast.entities.Temp temp, @org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.network.forecast.entities.FeelsLike feels_like, long pressure, long humidity, float dew_point, float wind_speed, long wind_deg, float uvi, long clouds, float pop, @org.jetbrains.annotations.NotNull()
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
    
    public Daily(long dt, long sunrise, long sunset, long moonrise, long moonset, float moon_phase, @org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.network.forecast.entities.Temp temp, @org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.network.forecast.entities.FeelsLike feels_like, long pressure, long humidity, float dew_point, float wind_speed, long wind_deg, float uvi, long clouds, float pop, @org.jetbrains.annotations.NotNull()
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
    
    public final long component4() {
        return 0L;
    }
    
    public final long getMoonrise() {
        return 0L;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getMoonset() {
        return 0L;
    }
    
    public final float component6() {
        return 0.0F;
    }
    
    public final float getMoon_phase() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.network.forecast.entities.Temp component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.network.forecast.entities.Temp getTemp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.network.forecast.entities.FeelsLike component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.network.forecast.entities.FeelsLike getFeels_like() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long getPressure() {
        return 0L;
    }
    
    public final long component10() {
        return 0L;
    }
    
    public final long getHumidity() {
        return 0L;
    }
    
    public final float component11() {
        return 0.0F;
    }
    
    public final float getDew_point() {
        return 0.0F;
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
    
    public final float component14() {
        return 0.0F;
    }
    
    public final float getUvi() {
        return 0.0F;
    }
    
    public final long component15() {
        return 0L;
    }
    
    public final long getClouds() {
        return 0L;
    }
    
    public final float component16() {
        return 0.0F;
    }
    
    public final float getPop() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Weather> getWeather() {
        return null;
    }
}