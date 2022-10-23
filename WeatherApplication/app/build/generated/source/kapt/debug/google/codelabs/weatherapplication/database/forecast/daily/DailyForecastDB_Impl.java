package google.codelabs.weatherapplication.database.forecast.daily;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao;
import google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DailyForecastDB_Impl extends DailyForecastDB {
  private volatile DailyForecastDao _dailyForecastDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `daily_forecast` (`city_name` TEXT NOT NULL, `country` TEXT NOT NULL, `dt` INTEGER NOT NULL, `timezone_offset` INTEGER NOT NULL, `sunrise` INTEGER NOT NULL, `sunset` INTEGER NOT NULL, `temp_morn` REAL NOT NULL, `temp_day` REAL NOT NULL, `temp_eve` REAL NOT NULL, `temp_night` REAL NOT NULL, `temp_min` REAL NOT NULL, `temp_max` REAL NOT NULL, `feels_like_morn` REAL NOT NULL, `feels_like_day` REAL NOT NULL, `feels_like_eve` REAL NOT NULL, `feels_like_night` REAL NOT NULL, `humidity` INTEGER NOT NULL, `wind_speed` REAL NOT NULL, `wind_deg` INTEGER NOT NULL, `uvi` REAL NOT NULL, `icon` TEXT NOT NULL, PRIMARY KEY(`city_name`, `dt`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f045a9c47d01be0cee0459d08ffb2afc')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `daily_forecast`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDailyForecast = new HashMap<String, TableInfo.Column>(21);
        _columnsDailyForecast.put("city_name", new TableInfo.Column("city_name", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("country", new TableInfo.Column("country", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("dt", new TableInfo.Column("dt", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("timezone_offset", new TableInfo.Column("timezone_offset", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("sunrise", new TableInfo.Column("sunrise", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("sunset", new TableInfo.Column("sunset", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("temp_morn", new TableInfo.Column("temp_morn", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("temp_day", new TableInfo.Column("temp_day", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("temp_eve", new TableInfo.Column("temp_eve", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("temp_night", new TableInfo.Column("temp_night", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("temp_min", new TableInfo.Column("temp_min", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("temp_max", new TableInfo.Column("temp_max", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("feels_like_morn", new TableInfo.Column("feels_like_morn", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("feels_like_day", new TableInfo.Column("feels_like_day", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("feels_like_eve", new TableInfo.Column("feels_like_eve", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("feels_like_night", new TableInfo.Column("feels_like_night", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("humidity", new TableInfo.Column("humidity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("wind_speed", new TableInfo.Column("wind_speed", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("wind_deg", new TableInfo.Column("wind_deg", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("uvi", new TableInfo.Column("uvi", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyForecast.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDailyForecast = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDailyForecast = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDailyForecast = new TableInfo("daily_forecast", _columnsDailyForecast, _foreignKeysDailyForecast, _indicesDailyForecast);
        final TableInfo _existingDailyForecast = TableInfo.read(_db, "daily_forecast");
        if (! _infoDailyForecast.equals(_existingDailyForecast)) {
          return new RoomOpenHelper.ValidationResult(false, "daily_forecast(google.codelabs.weatherapplication.database.forecast.daily.entities.DailyForecastEntity).\n"
                  + " Expected:\n" + _infoDailyForecast + "\n"
                  + " Found:\n" + _existingDailyForecast);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f045a9c47d01be0cee0459d08ffb2afc", "075b58c3bceedbee24b17d87f3d8c033");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "daily_forecast");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `daily_forecast`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DailyForecastDao.class, DailyForecastDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public DailyForecastDao dailyForecastDao() {
    if (_dailyForecastDao != null) {
      return _dailyForecastDao;
    } else {
      synchronized(this) {
        if(_dailyForecastDao == null) {
          _dailyForecastDao = new DailyForecastDao_Impl(this);
        }
        return _dailyForecastDao;
      }
    }
  }
}
