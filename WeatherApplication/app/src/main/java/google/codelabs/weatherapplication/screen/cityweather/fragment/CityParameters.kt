package google.codelabs.weatherapplication.screen.cityweather.fragment
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CityParameters(
    val lat: Float,
    val long: Float
) : Parcelable
