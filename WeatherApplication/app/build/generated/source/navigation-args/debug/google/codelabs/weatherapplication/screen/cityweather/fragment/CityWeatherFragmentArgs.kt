package google.codelabs.weatherapplication.screen.cityweather.fragment

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class CityWeatherFragmentArgs(
  public val city: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("city", this.city)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CityWeatherFragmentArgs {
      bundle.setClassLoader(CityWeatherFragmentArgs::class.java.classLoader)
      val __city : String?
      if (bundle.containsKey("city")) {
        __city = bundle.getString("city")
        if (__city == null) {
          throw IllegalArgumentException("Argument \"city\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"city\" is missing and does not have an android:defaultValue")
      }
      return CityWeatherFragmentArgs(__city)
    }
  }
}
