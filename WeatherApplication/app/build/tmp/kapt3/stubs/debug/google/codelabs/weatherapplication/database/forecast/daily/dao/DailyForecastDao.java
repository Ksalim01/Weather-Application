package google.codelabs.weatherapplication.database.forecast.daily.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lgoogle/codelabs/weatherapplication/database/forecast/daily/dao/DailyForecastDao;", "", "allCityForecast", "", "Lgoogle/codelabs/weatherapplication/database/forecast/daily/entities/AllCityForecastEntity;", "dt", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cityForecast", "Lgoogle/codelabs/weatherapplication/database/forecast/daily/entities/DailyForecastEntity;", "city", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCity", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "forecast", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DailyForecastDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM daily_forecast WHERE city_name = :city")
    public abstract java.lang.Object deleteCity(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM daily_forecast WHERE city_name = :city and dt - timezone_offset >= :dt ORDER BY dt")
    public abstract java.lang.Object cityForecast(@org.jetbrains.annotations.NotNull()
    java.lang.String city, long dt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT city_name, country, timezone_offset, dt, temp_min, temp_max FROM daily_forecast WHERE abs(dt - timezone_offset - :dt) <= 86400 ORDER BY dt")
    public abstract java.lang.Object allCityForecast(long dt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<google.codelabs.weatherapplication.database.forecast.daily.entities.AllCityForecastEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.util.List<google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity> forecast, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}