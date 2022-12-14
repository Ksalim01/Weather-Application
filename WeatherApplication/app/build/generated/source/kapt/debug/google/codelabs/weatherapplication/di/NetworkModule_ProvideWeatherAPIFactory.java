// Generated by Dagger (https://dagger.dev).
package google.codelabs.weatherapplication.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import google.codelabs.weatherapplication.network.forecast.api.WeatherAPI;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideWeatherAPIFactory implements Factory<WeatherAPI> {
  private final NetworkModule module;

  private final Provider<Retrofit.Builder> retrofitProvider;

  public NetworkModule_ProvideWeatherAPIFactory(NetworkModule module,
      Provider<Retrofit.Builder> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public WeatherAPI get() {
    return provideWeatherAPI(module, retrofitProvider.get());
  }

  public static NetworkModule_ProvideWeatherAPIFactory create(NetworkModule module,
      Provider<Retrofit.Builder> retrofitProvider) {
    return new NetworkModule_ProvideWeatherAPIFactory(module, retrofitProvider);
  }

  public static WeatherAPI provideWeatherAPI(NetworkModule instance, Retrofit.Builder retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideWeatherAPI(retrofit));
  }
}
