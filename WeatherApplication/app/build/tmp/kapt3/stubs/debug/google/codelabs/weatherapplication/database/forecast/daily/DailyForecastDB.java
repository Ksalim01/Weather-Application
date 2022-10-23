package google.codelabs.weatherapplication.database.forecast.daily;

import java.lang.System;

@androidx.room.Database(entities = {google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lgoogle/codelabs/weatherapplication/database/forecast/daily/DailyForecastDB;", "Landroidx/room/RoomDatabase;", "()V", "dailyForecastDao", "Lgoogle/codelabs/weatherapplication/database/forecast/daily/dao/DailyForecastDao;", "app_debug"})
public abstract class DailyForecastDB extends androidx.room.RoomDatabase {
    
    public DailyForecastDB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao dailyForecastDao();
}