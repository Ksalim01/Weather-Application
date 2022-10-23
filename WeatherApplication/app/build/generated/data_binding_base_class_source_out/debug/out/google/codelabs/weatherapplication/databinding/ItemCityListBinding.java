// Generated by view binder compiler. Do not edit!
package google.codelabs.weatherapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import google.codelabs.weatherapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCityListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline beginGuideline;

  @NonNull
  public final CheckBox checkbox;

  @NonNull
  public final TextView city;

  @NonNull
  public final TextView cityTemperature;

  @NonNull
  public final TextView country;

  @NonNull
  public final TextClock currentTime;

  @NonNull
  public final TextView date;

  @NonNull
  public final Guideline endGuideline;

  @NonNull
  public final ConstraintLayout favouriteCity;

  @NonNull
  public final TextView maxMinTemp;

  private ItemCityListBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline beginGuideline,
      @NonNull CheckBox checkbox, @NonNull TextView city, @NonNull TextView cityTemperature,
      @NonNull TextView country, @NonNull TextClock currentTime, @NonNull TextView date,
      @NonNull Guideline endGuideline, @NonNull ConstraintLayout favouriteCity,
      @NonNull TextView maxMinTemp) {
    this.rootView = rootView;
    this.beginGuideline = beginGuideline;
    this.checkbox = checkbox;
    this.city = city;
    this.cityTemperature = cityTemperature;
    this.country = country;
    this.currentTime = currentTime;
    this.date = date;
    this.endGuideline = endGuideline;
    this.favouriteCity = favouriteCity;
    this.maxMinTemp = maxMinTemp;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCityListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCityListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_city_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCityListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.beginGuideline;
      Guideline beginGuideline = rootView.findViewById(id);
      if (beginGuideline == null) {
        break missingId;
      }

      id = R.id.checkbox;
      CheckBox checkbox = rootView.findViewById(id);
      if (checkbox == null) {
        break missingId;
      }

      id = R.id.city;
      TextView city = rootView.findViewById(id);
      if (city == null) {
        break missingId;
      }

      id = R.id.city_temperature;
      TextView cityTemperature = rootView.findViewById(id);
      if (cityTemperature == null) {
        break missingId;
      }

      id = R.id.country;
      TextView country = rootView.findViewById(id);
      if (country == null) {
        break missingId;
      }

      id = R.id.current_time;
      TextClock currentTime = rootView.findViewById(id);
      if (currentTime == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = rootView.findViewById(id);
      if (date == null) {
        break missingId;
      }

      id = R.id.endGuideline;
      Guideline endGuideline = rootView.findViewById(id);
      if (endGuideline == null) {
        break missingId;
      }

      ConstraintLayout favouriteCity = (ConstraintLayout) rootView;

      id = R.id.max_min_temp;
      TextView maxMinTemp = rootView.findViewById(id);
      if (maxMinTemp == null) {
        break missingId;
      }

      return new ItemCityListBinding((ConstraintLayout) rootView, beginGuideline, checkbox, city,
          cityTemperature, country, currentTime, date, endGuideline, favouriteCity, maxMinTemp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}