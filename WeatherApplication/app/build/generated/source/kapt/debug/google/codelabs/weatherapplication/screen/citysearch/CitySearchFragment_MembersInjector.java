// Generated by Dagger (https://dagger.dev).
package google.codelabs.weatherapplication.screen.citysearch;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CitySearchFragment_MembersInjector implements MembersInjector<CitySearchFragment> {
  private final Provider<CitySearchViewModel> citySearchViewModelProvider;

  public CitySearchFragment_MembersInjector(
      Provider<CitySearchViewModel> citySearchViewModelProvider) {
    this.citySearchViewModelProvider = citySearchViewModelProvider;
  }

  public static MembersInjector<CitySearchFragment> create(
      Provider<CitySearchViewModel> citySearchViewModelProvider) {
    return new CitySearchFragment_MembersInjector(citySearchViewModelProvider);
  }

  @Override
  public void injectMembers(CitySearchFragment instance) {
    injectCitySearchViewModel(instance, citySearchViewModelProvider.get());
  }

  @InjectedFieldSignature("google.codelabs.weatherapplication.screen.citysearch.CitySearchFragment.citySearchViewModel")
  public static void injectCitySearchViewModel(CitySearchFragment instance,
      CitySearchViewModel citySearchViewModel) {
    instance.citySearchViewModel = citySearchViewModel;
  }
}