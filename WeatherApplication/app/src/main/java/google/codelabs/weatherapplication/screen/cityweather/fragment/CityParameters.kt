package google.codelabs.weatherapplication.screen.cityweather.fragment
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CityParameters(
    val city: String,
    val lat: Float,
    val long: Float
) : Parcelable

val DefaultCityParameters =
    CityParameters(
        "Moscow",
        lat = 55.7522F,
        long = 37.6156F
    )