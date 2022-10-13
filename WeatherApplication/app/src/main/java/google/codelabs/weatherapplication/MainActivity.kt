package google.codelabs.weatherapplication

import android.Manifest
import android.content.Context
import android.content.SharedPreferences
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import com.google.android.gms.location.LocationServices
import google.codelabs.weatherapplication.databinding.ActivityMainBinding
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityParameters
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var citySharedPreferences: SharedPreferences

    private val requestLocationPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission(),
        ::onGotLocationPermissionResult
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        citySharedPreferences = getSharedPreferences(CITY_PREFERENCES, Context.MODE_PRIVATE)
        askLocationPermission()
    }

    private fun permissionFineLocation() =
        ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)

    private fun askLocationPermission() {
        when (permissionFineLocation()) {
            PackageManager.PERMISSION_GRANTED ->
                onGotLocationPermissionGranted()
            PackageManager.PERMISSION_DENIED ->
                requestLocationPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
        }

    }

    private fun onGotLocationPermissionResult(granted: Boolean) {
        if (granted) onGotLocationPermissionGranted()
        else onStartDefaultCityWeatherFragment()
    }

    private fun onGotLocationPermissionGranted() {
        val fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        fusedLocationClient.lastLocation.addOnSuccessListener {
            citySharedPreferences.edit()
                .putFloat(CURRENT_CITY_LAT, it.latitude.toFloat())
                .putFloat(CURRENT_CITY_LONG, it.longitude.toFloat())
                .apply()

            onStartDefaultCityWeatherFragment()
        }
    }

    private fun onStartDefaultCityWeatherFragment() {
        val city = CityParameters(
            citySharedPreferences.getFloat(CURRENT_CITY_LAT, 0F),
            citySharedPreferences.getFloat(CURRENT_CITY_LONG, 0F)
        )

        onStartCityWeatherFragment(city)
    }

    private fun onStartCityWeatherFragment(cityParameters: CityParameters) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, CityWeatherFragment.newInstance(cityParameters))
            .commit()
    }

    private companion object {
        private const val CITY_PREFERENCES = "CITY_PREFERENCES"
        private const val CURRENT_CITY_LAT = "CURRENT_CITY_LAT"
        private const val CURRENT_CITY_LONG = "CURRENT_CITY_LONG"
    }
}
