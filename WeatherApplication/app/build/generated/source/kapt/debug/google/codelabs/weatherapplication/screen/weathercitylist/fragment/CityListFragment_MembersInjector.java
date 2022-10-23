// Generated by Dagger (https://dagger.dev).
package google.codelabs.weatherapplication.screen.weathercitylist.fragment;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import google.codelabs.weatherapplication.screen.weathercitylist.viewmodels.CityListViewModel;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CityListFragment_MembersInjector implements MembersInjector<CityListFragment> {
  private final Provider<CityListViewModel> cityListViewModelProvider;

  public CityListFragment_MembersInjector(Provider<CityListViewModel> cityListViewModelProvider) {
    this.cityListViewModelProvider = cityListViewModelProvider;
  }

  public static MembersInjector<CityListFragment> create(
      Provider<CityListViewModel> cityListViewModelProvider) {
    return new CityListFragment_MembersInjector(cityListViewModelProvider);
  }

  @Override
  public void injectMembers(CityListFragment instance) {
    injectCityListViewModel(instance, cityListViewModelProvider.get());
  }

  @InjectedFieldSignature("google.codelabs.weatherapplication.screen.weathercitylist.fragment.CityListFragment.cityListViewModel")
  public static void injectCityListViewModel(CityListFragment instance,
      CityListViewModel cityListViewModel) {
    instance.cityListViewModel = cityListViewModel;
  }
}
