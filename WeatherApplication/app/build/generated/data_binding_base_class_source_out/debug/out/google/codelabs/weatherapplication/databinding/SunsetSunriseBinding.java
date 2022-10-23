// Generated by view binder compiler. Do not edit!
package google.codelabs.weatherapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import google.codelabs.weatherapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SunsetSunriseBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout sunrise;

  @NonNull
  public final TextView sunriseTime;

  @NonNull
  public final TextView sunriseTitle;

  @NonNull
  public final TextView sunsetTime;

  @NonNull
  public final TextView sunsetTitle;

  private SunsetSunriseBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout sunrise,
      @NonNull TextView sunriseTime, @NonNull TextView sunriseTitle, @NonNull TextView sunsetTime,
      @NonNull TextView sunsetTitle) {
    this.rootView = rootView;
    this.sunrise = sunrise;
    this.sunriseTime = sunriseTime;
    this.sunriseTitle = sunriseTitle;
    this.sunsetTime = sunsetTime;
    this.sunsetTitle = sunsetTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SunsetSunriseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SunsetSunriseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.sunset_sunrise, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SunsetSunriseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.sunrise;
      LinearLayout sunrise = rootView.findViewById(id);
      if (sunrise == null) {
        break missingId;
      }

      id = R.id.sunrise_time;
      TextView sunriseTime = rootView.findViewById(id);
      if (sunriseTime == null) {
        break missingId;
      }

      id = R.id.sunrise_title;
      TextView sunriseTitle = rootView.findViewById(id);
      if (sunriseTitle == null) {
        break missingId;
      }

      id = R.id.sunset_time;
      TextView sunsetTime = rootView.findViewById(id);
      if (sunsetTime == null) {
        break missingId;
      }

      id = R.id.sunset_title;
      TextView sunsetTitle = rootView.findViewById(id);
      if (sunsetTitle == null) {
        break missingId;
      }

      return new SunsetSunriseBinding((LinearLayout) rootView, sunrise, sunriseTime, sunriseTitle,
          sunsetTime, sunsetTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}