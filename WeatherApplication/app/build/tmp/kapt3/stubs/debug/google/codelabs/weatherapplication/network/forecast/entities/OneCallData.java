package google.codelabs.weatherapplication.network.forecast.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\bH\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003Jo\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u000202H\u00d6\u0001J\t\u00103\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u00064"}, d2 = {"Lgoogle/codelabs/weatherapplication/network/forecast/entities/OneCallData;", "", "lat", "", "lon", "timezone", "", "timezone_offset", "", "current", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/Current;", "hourly", "", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/Hourly;", "daily", "Lgoogle/codelabs/weatherapplication/network/forecast/entities/Daily;", "city", "country", "(FFLjava/lang/String;JLgoogle/codelabs/weatherapplication/network/forecast/entities/Current;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "getCountry", "setCountry", "getCurrent", "()Lgoogle/codelabs/weatherapplication/network/forecast/entities/Current;", "getDaily", "()Ljava/util/List;", "getHourly", "getLat", "()F", "getLon", "getTimezone", "getTimezone_offset", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class OneCallData {
    @com.squareup.moshi.Json(name = "lat")
    private final float lat = 0.0F;
    @com.squareup.moshi.Json(name = "lon")
    private final float lon = 0.0F;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "timezone")
    private final java.lang.String timezone = null;
    @com.squareup.moshi.Json(name = "timezone_offset")
    private final long timezone_offset = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "current")
    private final google.codelabs.weatherapplication.network.forecast.entities.Current current = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "hourly")
    private final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Hourly> hourly = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "daily")
    private final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Daily> daily = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String city;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String country;
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.network.forecast.entities.OneCallData copy(float lat, float lon, @org.jetbrains.annotations.NotNull()
    java.lang.String timezone, long timezone_offset, @org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.network.forecast.entities.Current current, @org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Hourly> hourly, @org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Daily> daily, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String country) {
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
    
    public OneCallData(float lat, float lon, @org.jetbrains.annotations.NotNull()
    java.lang.String timezone, long timezone_offset, @org.jetbrains.annotations.NotNull()
    google.codelabs.weatherapplication.network.forecast.entities.Current current, @org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Hourly> hourly, @org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Daily> daily, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String country) {
        super();
    }
    
    public final float component1() {
        return 0.0F;
    }
    
    public final float getLat() {
        return 0.0F;
    }
    
    public final float component2() {
        return 0.0F;
    }
    
    public final float getLon() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimezone() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getTimezone_offset() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.network.forecast.entities.Current component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.network.forecast.entities.Current getCurrent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Hourly> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Hourly> getHourly() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Daily> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<google.codelabs.weatherapplication.network.forecast.entities.Daily> getDaily() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final void setCountry(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}