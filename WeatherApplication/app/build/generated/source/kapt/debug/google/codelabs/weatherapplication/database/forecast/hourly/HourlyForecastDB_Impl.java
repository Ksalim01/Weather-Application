package google.codelabs.weatherapplication.database.forecast.hourly;

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
import google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao;
import google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao_Impl;
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
public final class HourlyForecastDB_Impl extends HourlyForecastDB {
  private volatile HourlyForecastDao _hourlyForecastDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `hourly_forecast` (`city_name` TEXT NOT NULL, `country` TEXT NOT NULL, `dt` INTEGER NOT NULL, `timezone_offset` INTEGER NOT NULL, `temp` REAL NOT NULL, `feels_like` REAL NOT NULL, `humidity` INTEGER NOT NULL, `wind_speed` REAL NOT NULL, `wind_deg` INTEGER NOT NULL, `uvi` REAL NOT NULL, `icon` TEXT NOT NULL, PRIMARY KEY(`city_name`, `dt`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08d6188d19db1e8c67e02ccb7a311255')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `hourly_forecast`");
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
        final HashMap<String, TableInfo.Column> _columnsHourlyForecast = new HashMap<String, TableInfo.Column>(11);
        _columnsHourlyForecast.put("city_name", new TableInfo.Column("city_name", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHourlyForecast.put("country", new TableInfo.Column("country", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHourlyForecast.put("dt", new TableInfo.Column("dt", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHourlyForecast.put("timezone_offset", new TableInfo.Column("timezone_offset", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHourlyForecast.put("temp", new TableInfo.Column("temp", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHourlyForecast.put("feels_like", new TableInfo.Column("feels_like", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHourlyForecast.put("humidity", new TableInfo.Column("humidity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHourlyForecast.put("wind_speed", new TableInfo.Column("wind_speed", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHourlyForecast.put("wind_deg", new TableInfo.Column("wind_deg", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHourlyForecast.put("uvi", new TableInfo.Column("uvi", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHourlyForecast.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHourlyForecast = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHourlyForecast = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHourlyForecast = new TableInfo("hourly_forecast", _columnsHourlyForecast, _foreignKeysHourlyForecast, _indicesHourlyForecast);
        final TableInfo _existingHourlyForecast = TableInfo.read(_db, "hourly_forecast");
        if (! _infoHourlyForecast.equals(_existingHourlyForecast)) {
          return new RoomOpenHelper.ValidationResult(false, "hourly_forecast(google.codelabs.weatherapplication.database.forecast.hourly.entities.HourlyForecastEntity).\n"
                  + " Expected:\n" + _infoHourlyForecast + "\n"
                  + " Found:\n" + _existingHourlyForecast);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "08d6188d19db1e8c67e02ccb7a311255", "467a98a2d4a3a149283c504eec1a3e1e");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "hourly_forecast");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `hourly_forecast`");
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
    _typeConvertersMap.put(HourlyForecastDao.class, HourlyForecastDao_Impl.getRequiredConverters());
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
  public HourlyForecastDao hourlyForecastDao() {
    if (_hourlyForecastDao != null) {
      return _hourlyForecastDao;
    } else {
      synchronized(this) {
        if(_hourlyForecastDao == null) {
          _hourlyForecastDao = new HourlyForecastDao_Impl(this);
        }
        return _hourlyForecastDao;
      }
    }
  }
}
