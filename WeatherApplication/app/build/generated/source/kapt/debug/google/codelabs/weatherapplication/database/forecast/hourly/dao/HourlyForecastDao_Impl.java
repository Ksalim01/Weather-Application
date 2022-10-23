package google.codelabs.weatherapplication.database.forecast.hourly.dao;

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
import google.codelabs.weatherapplication.database.forecast.hourly.entities.AllCityCurrentWeather;
import google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity;
import google.codelabs.weatherapplication.network.forecast.entities.CurrentWeatherEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
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
public final class HourlyForecastDao_Impl implements HourlyForecastDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HourlyForecastEntity> __insertionAdapterOfHourlyForecastEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCity;

  public HourlyForecastDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHourlyForecastEntity = new EntityInsertionAdapter<HourlyForecastEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `hourly_forecast` (`city_name`,`country`,`dt`,`timezone_offset`,`temp`,`feels_like`,`humidity`,`wind_speed`,`wind_deg`,`uvi`,`icon`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HourlyForecastEntity value) {
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
        stmt.bindDouble(5, value.getTemp());
        stmt.bindDouble(6, value.getFeels_like());
        stmt.bindLong(7, value.getHumidity());
        stmt.bindDouble(8, value.getWind_speed());
        stmt.bindLong(9, value.getWind_deg());
        stmt.bindDouble(10, value.getUvi());
        if (value.getIcon() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getIcon());
        }
      }
    };
    this.__preparedStmtOfDeleteCity = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM hourly_forecast WHERE city_name = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final List<HourlyForecastEntity> forecast,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHourlyForecastEntity.insert(forecast);
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
      final Continuation<? super List<HourlyForecastEntity>> continuation) {
    final String _sql = "SELECT * FROM hourly_forecast WHERE city_name = ? and dt >= ? ORDER BY dt";
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
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<HourlyForecastEntity>>() {
      @Override
      public List<HourlyForecastEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city_name");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfDt = CursorUtil.getColumnIndexOrThrow(_cursor, "dt");
          final int _cursorIndexOfTimezoneOffset = CursorUtil.getColumnIndexOrThrow(_cursor, "timezone_offset");
          final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "temp");
          final int _cursorIndexOfFeelsLike = CursorUtil.getColumnIndexOrThrow(_cursor, "feels_like");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_speed");
          final int _cursorIndexOfWindDeg = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_deg");
          final int _cursorIndexOfUvi = CursorUtil.getColumnIndexOrThrow(_cursor, "uvi");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final List<HourlyForecastEntity> _result = new ArrayList<HourlyForecastEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final HourlyForecastEntity _item;
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
            final float _tmpTemp;
            _tmpTemp = _cursor.getFloat(_cursorIndexOfTemp);
            final float _tmpFeels_like;
            _tmpFeels_like = _cursor.getFloat(_cursorIndexOfFeelsLike);
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
            _item = new HourlyForecastEntity(_tmpCity,_tmpCountry,_tmpDt,_tmpTimezone_offset,_tmpTemp,_tmpFeels_like,_tmpHumidity,_tmpWind_speed,_tmpWind_deg,_tmpUvi,_tmpIcon);
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
  public Object currentWeather(final String city, final long dt,
      final Continuation<? super List<CurrentWeatherEntity>> continuation) {
    final String _sql = "SELECT timezone_offset, dt, temp, feels_like, humidity, wind_speed, icon, city_name FROM hourly_forecast WHERE city_name = ? and dt = ? ORDER BY dt";
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
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<CurrentWeatherEntity>>() {
      @Override
      public List<CurrentWeatherEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTimezoneOffset = 0;
          final int _cursorIndexOfTemp = 2;
          final int _cursorIndexOfFeelsLike = 3;
          final int _cursorIndexOfHumidity = 4;
          final int _cursorIndexOfWindSpeed = 5;
          final int _cursorIndexOfIcon = 6;
          final int _cursorIndexOfCity = 7;
          final List<CurrentWeatherEntity> _result = new ArrayList<CurrentWeatherEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CurrentWeatherEntity _item;
            final long _tmpTimezone_offset;
            _tmpTimezone_offset = _cursor.getLong(_cursorIndexOfTimezoneOffset);
            final float _tmpTemp;
            _tmpTemp = _cursor.getFloat(_cursorIndexOfTemp);
            final float _tmpFeels_like;
            _tmpFeels_like = _cursor.getFloat(_cursorIndexOfFeelsLike);
            final long _tmpHumidity;
            _tmpHumidity = _cursor.getLong(_cursorIndexOfHumidity);
            final float _tmpWind_speed;
            _tmpWind_speed = _cursor.getFloat(_cursorIndexOfWindSpeed);
            final String _tmpIcon;
            if (_cursor.isNull(_cursorIndexOfIcon)) {
              _tmpIcon = null;
            } else {
              _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            }
            final String _tmpCity;
            if (_cursor.isNull(_cursorIndexOfCity)) {
              _tmpCity = null;
            } else {
              _tmpCity = _cursor.getString(_cursorIndexOfCity);
            }
            _item = new CurrentWeatherEntity(_tmpTimezone_offset,_tmpTemp,_tmpFeels_like,_tmpHumidity,_tmpWind_speed,_tmpIcon,_tmpCity);
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
  public Object allCityCurrentWeather(final long dt,
      final Continuation<? super List<AllCityCurrentWeather>> continuation) {
    final String _sql = "SELECT city_name, dt, timezone_offset, temp, icon FROM hourly_forecast WHERE dt = ? ORDER BY dt";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, dt);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<AllCityCurrentWeather>>() {
      @Override
      public List<AllCityCurrentWeather> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCity = 0;
          final int _cursorIndexOfDt = 1;
          final int _cursorIndexOfTimezoneOffset = 2;
          final int _cursorIndexOfTemp = 3;
          final int _cursorIndexOfIcon = 4;
          final List<AllCityCurrentWeather> _result = new ArrayList<AllCityCurrentWeather>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AllCityCurrentWeather _item;
            final String _tmpCity;
            if (_cursor.isNull(_cursorIndexOfCity)) {
              _tmpCity = null;
            } else {
              _tmpCity = _cursor.getString(_cursorIndexOfCity);
            }
            final long _tmpDt;
            _tmpDt = _cursor.getLong(_cursorIndexOfDt);
            final long _tmpTimezone_offset;
            _tmpTimezone_offset = _cursor.getLong(_cursorIndexOfTimezoneOffset);
            final float _tmpTemp;
            _tmpTemp = _cursor.getFloat(_cursorIndexOfTemp);
            final String _tmpIcon;
            if (_cursor.isNull(_cursorIndexOfIcon)) {
              _tmpIcon = null;
            } else {
              _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            }
            _item = new AllCityCurrentWeather(_tmpCity,_tmpDt,_tmpTimezone_offset,_tmpTemp,_tmpIcon);
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
  public Object lastUpdate(final String city, final Continuation<? super List<Long>> continuation) {
    final String _sql = "SELECT min(dt) FROM hourly_forecast WHERE city_name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (city == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, city);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<Long> _result = new ArrayList<Long>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Long _item;
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _item = _tmp;
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
