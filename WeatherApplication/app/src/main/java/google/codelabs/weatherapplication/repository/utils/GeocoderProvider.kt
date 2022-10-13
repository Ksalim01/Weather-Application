package google.codelabs.weatherapplication.repository.utils

import android.content.Context
import android.location.Geocoder
import java.util.*

class GeocoderProvider {
    companion object {
        @Volatile private var geocoder: Geocoder? = null

        fun getInstance(context: Context): Geocoder {
            return geocoder ?: synchronized(this) {
                geocoder?: Geocoder(context, Locale.getDefault())
                    .also { geocoder = it }
            }
        }
    }
}