package google.codelabs.weatherapplication.database.forecast.hourly.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "hourly_forecast", primaryKeys = {"city_name", "dt"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017\u00a8\u00061"}, d2 = {"Lgoogle/codelabs/weatherapplication/database/forecast/hourly/entities/HourlyForecastEntity;", "", "city", "", "country", "dt", "", "timezone_offset", "temp", "", "feels_like", "humidity", "wind_speed", "wind_deg", "uvi", "icon", "(Ljava/lang/String;Ljava/lang/String;JJFFJFJFLjava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getDt", "()J", "getFeels_like", "()F", "getHumidity", "getIcon", "getTemp", "getTimezone_offset", "getUvi", "getWind_deg", "getWind_speed", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class HourlyForecastEntity {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "city_name")
    private final java.lang.String city = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "country")
    private final java.lang.String country = null;
    @androidx.room.ColumnInfo(name = "dt")
    private final long dt = 0L;
    @androidx.room.ColumnInfo(name = "timezone_offset")
    private final long timezone_offset = 0L;
    @androidx.room.ColumnInfo(name = "temp")
    private final float temp = 0.0F;
    @androidx.room.ColumnInfo(name = "feels_like")
    private final float feels_like = 0.0F;
    @androidx.room.ColumnInfo(name = "humidity")
    private final long humidity = 0L;
    @androidx.room.ColumnInfo(name = "wind_speed")
    private final float wind_speed = 0.0F;
    @androidx.room.ColumnInfo(name = "wind_deg")
    private final long wind_deg = 0L;
    @androidx.room.ColumnInfo(name = "uvi")
    private final float uvi = 0.0F;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "icon")
    private final java.lang.String icon = null;
    
    @org.jetbrains.annotations.NotNull()
    public final google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String country, long dt, long timezone_offset, float temp, float feels_like, long humidity, float wind_speed, long wind_deg, float uvi, @org.jetbrains.annotations.NotNull()
    java.lang.String icon) {
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
    
    public HourlyForecastEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String country, long dt, long timezone_offset, float temp, float feels_like, long humidity, float wind_speed, long wind_deg, float uvi, @org.jetbrains.annotations.NotNull()
    java.lang.String icon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getDt() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getTimezone_offset() {
        return 0L;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    public final float getTemp() {
        return 0.0F;
    }
    
    public final float component6() {
        return 0.0F;
    }
    
    public final float getFeels_like() {
        return 0.0F;
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
    
    public final float getWind_speed() {
        return 0.0F;
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long getWind_deg() {
        return 0L;
    }
    
    public final float component10() {
        return 0.0F;
    }
    
    public final float getUvi() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIcon() {
        return null;
    }
}