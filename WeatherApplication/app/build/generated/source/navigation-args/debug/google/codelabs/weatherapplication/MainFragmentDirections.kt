package google.codelabs.weatherapplication

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class MainFragmentDirections private constructor() {
  private data class ActionMainFragmentToCityWeatherFragment(
    public val city: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_mainFragment_to_cityWeatherFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("city", this.city)
      return result
    }
  }

  public companion object {
    public fun actionMainFragmentToCityWeatherFragment(city: String): NavDirections =
        ActionMainFragmentToCityWeatherFragment(city)
  }
}
