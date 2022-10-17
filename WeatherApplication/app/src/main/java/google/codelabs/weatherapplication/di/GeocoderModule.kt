package google.codelabs.weatherapplication.di

import android.content.Context
import android.location.Geocoder
import dagger.Module
import dagger.Provides
import java.util.*

@Module
class GeocoderModule {
    @Provides
    fun provideGeocoder(context: Context) : Geocoder =
        Geocoder(context, Locale.getDefault())
}