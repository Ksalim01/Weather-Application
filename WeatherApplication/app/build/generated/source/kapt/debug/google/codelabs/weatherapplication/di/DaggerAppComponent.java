// Generated by Dagger (https://dagger.dev).
package google.codelabs.weatherapplication.di;

import android.content.Context;
import android.location.Geocoder;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import google.codelabs.weatherapplication.database.forecast.daily.DailyForecastDB;
import google.codelabs.weatherapplication.database.forecast.daily.dao.DailyForecastDao;
import google.codelabs.weatherapplication.database.forecast.hourly.HourlyForecastDB;
import google.codelabs.weatherapplication.database.forecast.hourly.dao.HourlyForecastDao;
import google.codelabs.weatherapplication.network.forecast.ForecastNetworkService;
import google.codelabs.weatherapplication.network.forecast.ForecastNetworkService_Factory;
import google.codelabs.weatherapplication.network.forecast.api.WeatherAPI;
import google.codelabs.weatherapplication.repository.forecast.ForecastRepository;
import google.codelabs.weatherapplication.repository.forecast.ForecastRepository_Factory;
import google.codelabs.weatherapplication.screen.citysearch.CitySearchFragment;
import google.codelabs.weatherapplication.screen.citysearch.CitySearchFragment_MembersInjector;
import google.codelabs.weatherapplication.screen.citysearch.CitySearchViewModel;
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragment;
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragment_MembersInjector;
import google.codelabs.weatherapplication.screen.cityweather.viewmodels.ForecastViewModel;
import google.codelabs.weatherapplication.screen.weathercitylist.fragment.CityListFragment;
import google.codelabs.weatherapplication.screen.weathercitylist.fragment.CityListFragment_MembersInjector;
import google.codelabs.weatherapplication.screen.weathercitylist.viewmodels.CityListViewModel;
import google.codelabs.weatherapplication.screen.weathercitylist.viewmodels.CityListViewModel_Factory;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final DaggerAppComponent appComponent = this;

  private Provider<Context> contextProvider;

  private Provider<DailyForecastDB> provideDailyForecastDBProvider;

  private Provider<DailyForecastDao> provideDailyForecastDBDaoProvider;

  private Provider<HourlyForecastDB> provideHourlyForecastDBProvider;

  private Provider<HourlyForecastDao> provideHourlyForecastDBDaoProvider;

  private Provider<Retrofit.Builder> provideRetrofitBuilderProvider;

  private Provider<WeatherAPI> provideWeatherAPIProvider;

  private Provider<Geocoder> provideGeocoderProvider;

  private Provider<ForecastNetworkService> forecastNetworkServiceProvider;

  private Provider<ForecastRepository> forecastRepositoryProvider;

  private Provider<CityListViewModel> cityListViewModelProvider;

  private DaggerAppComponent(HourlyForecastDBModule hourlyForecastDBModuleParam,
      DailyForecastModule dailyForecastModuleParam, GeocoderModule geocoderModuleParam,
      NetworkModule networkModuleParam, Context contextParam) {

    initialize(hourlyForecastDBModuleParam, dailyForecastModuleParam, geocoderModuleParam, networkModuleParam, contextParam);

  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  private ForecastViewModel forecastViewModel() {
    return new ForecastViewModel(forecastRepositoryProvider.get());
  }

  private CitySearchViewModel citySearchViewModel() {
    return new CitySearchViewModel(forecastRepositoryProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final HourlyForecastDBModule hourlyForecastDBModuleParam,
      final DailyForecastModule dailyForecastModuleParam, final GeocoderModule geocoderModuleParam,
      final NetworkModule networkModuleParam, final Context contextParam) {
    this.contextProvider = InstanceFactory.create(contextParam);
    this.provideDailyForecastDBProvider = DailyForecastModule_ProvideDailyForecastDBFactory.create(dailyForecastModuleParam, contextProvider);
    this.provideDailyForecastDBDaoProvider = DailyForecastModule_ProvideDailyForecastDBDaoFactory.create(dailyForecastModuleParam, provideDailyForecastDBProvider);
    this.provideHourlyForecastDBProvider = HourlyForecastDBModule_ProvideHourlyForecastDBFactory.create(hourlyForecastDBModuleParam, contextProvider);
    this.provideHourlyForecastDBDaoProvider = HourlyForecastDBModule_ProvideHourlyForecastDBDaoFactory.create(hourlyForecastDBModuleParam, provideHourlyForecastDBProvider);
    this.provideRetrofitBuilderProvider = NetworkModule_ProvideRetrofitBuilderFactory.create(networkModuleParam);
    this.provideWeatherAPIProvider = NetworkModule_ProvideWeatherAPIFactory.create(networkModuleParam, provideRetrofitBuilderProvider);
    this.provideGeocoderProvider = GeocoderModule_ProvideGeocoderFactory.create(geocoderModuleParam, contextProvider);
    this.forecastNetworkServiceProvider = ForecastNetworkService_Factory.create(provideWeatherAPIProvider, provideGeocoderProvider);
    this.forecastRepositoryProvider = DoubleCheck.provider(ForecastRepository_Factory.create(provideDailyForecastDBDaoProvider, provideHourlyForecastDBDaoProvider, forecastNetworkServiceProvider, provideGeocoderProvider));
    this.cityListViewModelProvider = DoubleCheck.provider(CityListViewModel_Factory.create(((Provider) forecastRepositoryProvider)));
  }

  @Override
  public void inject(CityWeatherFragment fragment) {
    injectCityWeatherFragment(fragment);
  }

  @Override
  public void inject(CityListFragment fragment) {
    injectCityListFragment(fragment);
  }

  @Override
  public void inject(CitySearchFragment fragment) {
    injectCitySearchFragment(fragment);
  }

  private CityWeatherFragment injectCityWeatherFragment(CityWeatherFragment instance) {
    CityWeatherFragment_MembersInjector.injectViewModel(instance, forecastViewModel());
    return instance;
  }

  private CityListFragment injectCityListFragment(CityListFragment instance) {
    CityListFragment_MembersInjector.injectCityListViewModel(instance, cityListViewModelProvider.get());
    return instance;
  }

  private CitySearchFragment injectCitySearchFragment(CitySearchFragment instance) {
    CitySearchFragment_MembersInjector.injectCitySearchViewModel(instance, citySearchViewModel());
    return instance;
  }

  private static final class Factory implements AppComponent.Factory {
    @Override
    public AppComponent create(Context context) {
      Preconditions.checkNotNull(context);
      return new DaggerAppComponent(new HourlyForecastDBModule(), new DailyForecastModule(), new GeocoderModule(), new NetworkModule(), context);
    }
  }
}
