package google.codelabs.weatherapplication.database.forecast.daily.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "daily_forecast", primaryKeys = {"city_name", "dt"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b>\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u000bH\u00c6\u0003J\t\u00105\u001a\u00020\u000bH\u00c6\u0003J\t\u00106\u001a\u00020\u000bH\u00c6\u0003J\t\u00107\u001a\u00020\u000bH\u00c6\u0003J\t\u00108\u001a\u00020\u000bH\u00c6\u0003J\t\u00109\u001a\u00020\u000bH\u00c6\u0003J\t\u0010:\u001a\u00020\u000bH\u00c6\u0003J\t\u0010;\u001a\u00020\u0006H\u00c6\u0003J\t\u0010<\u001a\u00020\u000bH\u00c6\u0003J\t\u0010=\u001a\u00020\u0006H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u000bH\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\t\u0010C\u001a\u00020\u0006H\u00c6\u0003J\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\t\u0010E\u001a\u00020\u000bH\u00c6\u0003J\t\u0010F\u001a\u00020\u000bH\u00c6\u0003J\t\u0010G\u001a\u00020\u000bH\u00c6\u0003J\u00db\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010L\u001a\u00020MH\u00d6\u0001J\t\u0010N\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0016\u0010\u0018\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0016\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0016\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010!\u00a8\u0006O"}, d2 = {"Lgoogle/codelabs/weatherapplication/database/forecast/daily/entities/DailyForecastEntity;", "", "city", "", "country", "dt", "", "timezone_offset", "sunrise", "sunset", "temp_morn", "", "temp_day", "temp_eve", "temp_night", "temp_min", "temp_max", "feels_like_morn", "feels_like_day", "feels_like_eve", "feels_like_night", "humidity", "wind_speed", "wind_deg", "uvi", "icon", "(Ljava/lang/String;Ljava/lang/String;JJJJFFFFFFFFFFJFJFLjava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getDt", "()J", "getFeels_like_day", "()F", "getFeels_like_eve", "getFeels_like_morn", "getFeels_like_night", "getHumidity", "getIcon", "getSunrise", "getSunset", "getTemp_day", "getTemp_eve", "getTemp_max", "getTemp_min", "getTemp_morn", "getTemp_night", "getTimezone_offset", "getUvi", "getWind_deg", "getWind_speed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class DailyForecastEntity {
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
    @androidx.room.ColumnInfo(name = "sunrise")
    private final long sunrise = 0L;
    @androidx.room.ColumnInfo(name = "sunset")
    private final long sunset = 0L;
    @androidx.room.ColumnInfo(name = "temp_morn")
    private final float temp_morn = 0.0F;
    @androidx.room.ColumnInfo(name = "temp_day")
    private final float temp_day = 0.0F;
    @androidx.room.ColumnInfo(name = "temp_eve")
    private final float temp_eve = 0.0F;
    @androidx.room.ColumnInfo(name = "temp_night")
    private final float temp_night = 0.0F;
    @androidx.room.ColumnInfo(name = "temp_min")
    private final float temp_min = 0.0F;
    @androidx.room.ColumnInfo(name = "temp_max")
    private final float temp_max = 0.0F;
    @androidx.room.ColumnInfo(name = "feels_like_morn")
    private final float feels_like_morn = 0.0F;
    @androidx.room.ColumnInfo(name = "feels_like_day")
    private final float feels_like_day = 0.0F;
    @androidx.room.ColumnInfo(name = "feels_like_eve")
    private final float feels_like_eve = 0.0F;
    @androidx.room.ColumnInfo(name = "feels_like_night")
    private final float feels_like_night = 0.0F;
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
    public final google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String country, long dt, long timezone_offset, long sunrise, long sunset, float temp_morn, float temp_day, float temp_eve, float temp_night, float temp_min, float temp_max, float feels_like_morn, float feels_like_day, float feels_like_eve, float feels_like_night, long humidity, float wind_speed, long wind_deg, float uvi, @org.jetbrains.annotations.NotNull()
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
    
    public DailyForecastEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String country, long dt, long timezone_offset, long sunrise, long sunset, float temp_morn, float temp_day, float temp_eve, float temp_night, float temp_min, float temp_max, float feels_like_morn, float feels_like_day, float feels_like_eve, float feels_like_night, long humidity, float wind_speed, long wind_deg, float uvi, @org.jetbrains.annotations.NotNull()
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
    
    public final long component5() {
        return 0L;
    }
    
    public final long getSunrise() {
        return 0L;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getSunset() {
        return 0L;
    }
    
    public final float component7() {
        return 0.0F;
    }
    
    public final float getTemp_morn() {
        return 0.0F;
    }
    
    public final float component8() {
        return 0.0F;
    }
    
    public final float getTemp_day() {
        return 0.0F;
    }
    
    public final float component9() {
        return 0.0F;
    }
    
    public final float getTemp_eve() {
        return 0.0F;
    }
    
    public final float component10() {
        return 0.0F;
    }
    
    public final float getTemp_night() {
        return 0.0F;
    }
    
    public final float component11() {
        return 0.0F;
    }
    
    public final float getTemp_min() {
        return 0.0F;
    }
    
    public final float component12() {
        return 0.0F;
    }
    
    public final float getTemp_max() {
        return 0.0F;
    }
    
    public final float component13() {
        return 0.0F;
    }
    
    public final float getFeels_like_morn() {
        return 0.0F;
    }
    
    public final float component14() {
        return 0.0F;
    }
    
    public final float getFeels_like_day() {
        return 0.0F;
    }
    
    public final float component15() {
        return 0.0F;
    }
    
    public final float getFeels_like_eve() {
        return 0.0F;
    }
    
    public final float component16() {
        return 0.0F;
    }
    
    public final float getFeels_like_night() {
        return 0.0F;
    }
    
    public final long component17() {
        return 0L;
    }
    
    public final long getHumidity() {
        return 0L;
    }
    
    public final float component18() {
        return 0.0F;
    }
    
    public final float getWind_speed() {
        return 0.0F;
    }
    
    public final long component19() {
        return 0L;
    }
    
    public final long getWind_deg() {
        return 0L;
    }
    
    public final float component20() {
        return 0.0F;
    }
    
    public final float getUvi() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIcon() {
        return null;
    }
}