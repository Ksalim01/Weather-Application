package google.codelabs.weatherapplication.database.forecast.daily.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import google.codelabs.weatherapplication.database.forecast.daily.entities.AllCityForecastEntity;
import google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DailyForecastDao_Impl implements DailyForecastDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DailyForecastEntity> __insertionAdapterOfDailyForecastEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCity;

  public DailyForecastDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDailyForecastEntity = new EntityInsertionAdapter<DailyForecastEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `daily_forecast` (`city_name`,`country`,`dt`,`timezone_offset`,`sunrise`,`sunset`,`temp_morn`,`temp_day`,`temp_eve`,`temp_night`,`temp_min`,`temp_max`,`feels_like_morn`,`feels_like_day`,`feels_like_eve`,`feels_like_night`,`humidity`,`wind_speed`,`wind_deg`,`uvi`,`icon`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DailyForecastEntity value) {
        if (value.getCity() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCity());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCountry());
        }
        stmt.bindLong(3, value.getDt());
        stmt.bindLong(4, value.getTimezone_offset());
        stmt.bindLong(5, value.getSunrise());
        stmt.bindLong(6, value.getSunset());
        stmt.bindDouble(7, value.getTemp_morn());
        stmt.bindDouble(8, value.getTemp_day());
        stmt.bindDouble(9, value.getTemp_eve());
        stmt.bindDouble(10, value.getTemp_night());
        stmt.bindDouble(11, value.getTemp_min());
        stmt.bindDouble(12, value.getTemp_max());
        stmt.bindDouble(13, value.getFeels_like_morn());
        stmt.bindDouble(14, value.getFeels_like_day());
        stmt.bindDouble(15, value.getFeels_like_eve());
        stmt.bindDouble(16, value.getFeels_like_night());
        stmt.bindLong(17, value.getHumidity());
        stmt.bindDouble(18, value.getWind_speed());
        stmt.bindLong(19, value.getWind_deg());
        stmt.bindDouble(20, value.getUvi());
        if (value.getIcon() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getIcon());
        }
      }
    };
    this.__preparedStmtOfDeleteCity = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM daily_forecast WHERE city_name = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final List<DailyForecastEntity> forecast,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDailyForecastEntity.insert(forecast);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteCity(final String city, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCity.acquire();
        int _argIndex = 1;
        if (city == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, city);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteCity.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object cityForecast(final String city, final long dt,
      final Continuation<? super List<DailyForecastEntity>> continuation) {
    final String _sql = "SELECT * FROM daily_forecast WHERE city_name = ? and dt - timezone_offset >= ? ORDER BY dt";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (city == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, city);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, dt);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DailyForecastEntity>>() {
      @Override
      public List<DailyForecastEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city_name");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfDt = CursorUtil.getColumnIndexOrThrow(_cursor, "dt");
          final int _cursorIndexOfTimezoneOffset = CursorUtil.getColumnIndexOrThrow(_cursor, "timezone_offset");
          final int _cursorIndexOfSunrise = CursorUtil.getColumnIndexOrThrow(_cursor, "sunrise");
          final int _cursorIndexOfSunset = CursorUtil.getColumnIndexOrThrow(_cursor, "sunset");
          final int _cursorIndexOfTempMorn = CursorUtil.getColumnIndexOrThrow(_cursor, "temp_morn");
          final int _cursorIndexOfTempDay = CursorUtil.getColumnIndexOrThrow(_cursor, "temp_day");
          final int _cursorIndexOfTempEve = CursorUtil.getColumnIndexOrThrow(_cursor, "temp_eve");
          final int _cursorIndexOfTempNight = CursorUtil.getColumnIndexOrThrow(_cursor, "temp_night");
          final int _cursorIndexOfTempMin = CursorUtil.getColumnIndexOrThrow(_cursor, "temp_min");
          final int _cursorIndexOfTempMax = CursorUtil.getColumnIndexOrThrow(_cursor, "temp_max");
          final int _cursorIndexOfFeelsLikeMorn = CursorUtil.getColumnIndexOrThrow(_cursor, "feels_like_morn");
          final int _cursorIndexOfFeelsLikeDay = CursorUtil.getColumnIndexOrThrow(_cursor, "feels_like_day");
          final int _cursorIndexOfFeelsLikeEve = CursorUtil.getColumnIndexOrThrow(_cursor, "feels_like_eve");
          final int _cursorIndexOfFeelsLikeNight = CursorUtil.getColumnIndexOrThrow(_cursor, "feels_like_night");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_speed");
          final int _cursorIndexOfWindDeg = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_deg");
          final int _cursorIndexOfUvi = CursorUtil.getColumnIndexOrThrow(_cursor, "uvi");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final List<DailyForecastEntity> _result = new ArrayList<DailyForecastEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DailyForecastEntity _item;
            final String _tmpCity;
            if (_cursor.isNull(_cursorIndexOfCity)) {
              _tmpCity = null;
            } else {
              _tmpCity = _cursor.getString(_cursorIndexOfCity);
            }
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final long _tmpDt;
            _tmpDt = _cursor.getLong(_cursorIndexOfDt);
            final long _tmpTimezone_offset;
            _tmpTimezone_offset = _cursor.getLong(_cursorIndexOfTimezoneOffset);
            final long _tmpSunrise;
            _tmpSunrise = _cursor.getLong(_cursorIndexOfSunrise);
            final long _tmpSunset;
            _tmpSunset = _cursor.getLong(_cursorIndexOfSunset);
            final float _tmpTemp_morn;
            _tmpTemp_morn = _cursor.getFloat(_cursorIndexOfTempMorn);
            final float _tmpTemp_day;
            _tmpTemp_day = _cursor.getFloat(_cursorIndexOfTempDay);
            final float _tmpTemp_eve;
            _tmpTemp_eve = _cursor.getFloat(_cursorIndexOfTempEve);
            final float _tmpTemp_night;
            _tmpTemp_night = _cursor.getFloat(_cursorIndexOfTempNight);
            final float _tmpTemp_min;
            _tmpTemp_min = _cursor.getFloat(_cursorIndexOfTempMin);
            final float _tmpTemp_max;
            _tmpTemp_max = _cursor.getFloat(_cursorIndexOfTempMax);
            final float _tmpFeels_like_morn;
            _tmpFeels_like_morn = _cursor.getFloat(_cursorIndexOfFeelsLikeMorn);
            final float _tmpFeels_like_day;
            _tmpFeels_like_day = _cursor.getFloat(_cursorIndexOfFeelsLikeDay);
            final float _tmpFeels_like_eve;
            _tmpFeels_like_eve = _cursor.getFloat(_cursorIndexOfFeelsLikeEve);
            final float _tmpFeels_like_night;
            _tmpFeels_like_night = _cursor.getFloat(_cursorIndexOfFeelsLikeNight);
            final long _tmpHumidity;
            _tmpHumidity = _cursor.getLong(_cursorIndexOfHumidity);
            final float _tmpWind_speed;
            _tmpWind_speed = _cursor.getFloat(_cursorIndexOfWindSpeed);
            final long _tmpWind_deg;
            _tmpWind_deg = _cursor.getLong(_cursorIndexOfWindDeg);
            final float _tmpUvi;
            _tmpUvi = _cursor.getFloat(_cursorIndexOfUvi);
            final String _tmpIcon;
            if (_cursor.isNull(_cursorIndexOfIcon)) {
              _tmpIcon = null;
            } else {
              _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            }
            _item = new DailyForecastEntity(_tmpCity,_tmpCountry,_tmpDt,_tmpTimezone_offset,_tmpSunrise,_tmpSunset,_tmpTemp_morn,_tmpTemp_day,_tmpTemp_eve,_tmpTemp_night,_tmpTemp_min,_tmpTemp_max,_tmpFeels_like_morn,_tmpFeels_like_day,_tmpFeels_like_eve,_tmpFeels_like_night,_tmpHumidity,_tmpWind_speed,_tmpWind_deg,_tmpUvi,_tmpIcon);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object allCityForecast(final long dt,
      final Continuation<? super List<AllCityForecastEntity>> continuation) {
    final String _sql = "SELECT city_name, country, timezone_offset, dt, temp_min, temp_max FROM daily_forecast WHERE abs(dt - timezone_offset - ?) <= 86400 ORDER BY dt";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, dt);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<AllCityForecastEntity>>() {
      @Override
      public List<AllCityForecastEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCity = 0;
          final int _cursorIndexOfCountry = 1;
          final int _cursorIndexOfTimezoneOffset = 2;
          final int _cursorIndexOfDt = 3;
          final int _cursorIndexOfTempMin = 4;
          final int _cursorIndexOfTempMax = 5;
          final List<AllCityForecastEntity> _result = new ArrayList<AllCityForecastEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AllCityForecastEntity _item;
            final String _tmpCity;
            if (_cursor.isNull(_cursorIndexOfCity)) {
              _tmpCity = null;
            } else {
              _tmpCity = _cursor.getString(_cursorIndexOfCity);
            }
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final long _tmpTimezone_offset;
            _tmpTimezone_offset = _cursor.getLong(_cursorIndexOfTimezoneOffset);
            final long _tmpDt;
            _tmpDt = _cursor.getLong(_cursorIndexOfDt);
            final float _tmpTemp_min;
            _tmpTemp_min = _cursor.getFloat(_cursorIndexOfTempMin);
            final float _tmpTemp_max;
            _tmpTemp_max = _cursor.getFloat(_cursorIndexOfTempMax);
            _item = new AllCityForecastEntity(_tmpCity,_tmpCountry,_tmpTimezone_offset,_tmpDt,_tmpTemp_min,_tmpTemp_max);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
