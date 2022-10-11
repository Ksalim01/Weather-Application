package google.codelabs.weatherapplication

import android.Manifest
import android.content.Context
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.location.Geocoder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import google.codelabs.weatherapplication.databinding.ActivityMainBinding
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityParameters
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragment
import google.codelabs.weatherapplication.screen.cityweather.fragment.DefaultCityParameters
import google.codelabs.weatherapplication.screen.cityweather.utils.currentCity
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var citySharedPreferences: SharedPreferences

    private val requestLocationPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission(),
        ::onGotLocationPermissionResult
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        citySharedPreferences = getSharedPreferences(CITY_PREFERENCES, Context.MODE_PRIVATE)
        askLocationPermission()
    }


    private fun askLocationPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            == PackageManager.PERMISSION_GRANTED
        ) {
            onGotLocationPermissionGranted()
        } else {
            requestLocationPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }

    private fun onGotLocationPermissionResult(granted: Boolean) {
        if (!granted) {
            onStartDefaultCityWeatherFragment()
        }

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            == PackageManager.PERMISSION_GRANTED
        ) {
            onGotLocationPermissionGranted()
        }
    }

    private fun onGotLocationPermissionGranted() {
        fusedLocationClient.lastLocation.addOnSuccessListener {
            val geocoder = Geocoder(this, Locale.getDefault())
            val city = currentCity(geocoder, it.latitude, it.longitude)

            citySharedPreferences.edit()
                .putString(CURRENT_CITY, city.city)
                .putFloat(CURRENT_CITY_LAT, city.lat)
                .putFloat(CURRENT_CITY_LONG, city.long)
                .apply()

            onStartDefaultCityWeatherFragment()
        }
    }

    private fun onStartDefaultCityWeatherFragment() {
        // TODO if preferences are empty then it should be a field with choosing city
        val city = CityParameters(
            citySharedPreferences.getString(CURRENT_CITY, DefaultCityParameters.city)!!,
            citySharedPreferences.getFloat(CURRENT_CITY_LAT, DefaultCityParameters.lat),
            citySharedPreferences.getFloat(CURRENT_CITY_LONG, DefaultCityParameters.long)
        )

        val TEST_CITY = CityParameters (
            city = "Лондон",
            lat = 51.5085F,
            long = -0.1257F
        )
        onStartCityWeatherFragment(city)
    }

    private fun onStartCityWeatherFragment(cityParameters: CityParameters) {
        Log.d("mainActivity", "onStartFragment")
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, CityWeatherFragment.newInstance(cityParameters))
            .commit()
    }


    private companion object {
        @JvmStatic
        val CITY_PREFERENCES = "CITY_PREFERENCES"
        @JvmStatic
        val CURRENT_CITY = "CURRENT_CITY"
        @JvmStatic
        val CURRENT_CITY_LAT = "CURRENT_CITY_LAT"
        @JvmStatic
        val CURRENT_CITY_LONG = "CURRENT_CITY_LONG"
    }
}
