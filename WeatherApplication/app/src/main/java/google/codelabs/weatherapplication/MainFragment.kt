package google.codelabs.weatherapplication

import android.Manifest
import android.content.Context
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.Display.Mode
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.gms.location.LocationServices
import google.codelabs.weatherapplication.databinding.FragmentMainBinding
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityParameters

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding
    private lateinit var citySharedPreferences: SharedPreferences

    private val requestLocationPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission(),
        ::onGotLocationPermissionResult
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        citySharedPreferences = requireContext().getSharedPreferences(CITY_PREFERENCES, Context.MODE_PRIVATE)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        askLocationPermission()
    }

    private fun permissionFineLocation() =
        ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_FINE_LOCATION)

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
        val fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())
        if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_FINE_LOCATION)
            == PackageManager.PERMISSION_GRANTED) {
            fusedLocationClient.lastLocation.addOnSuccessListener {
                citySharedPreferences.edit()
                    .putFloat(CURRENT_CITY_LAT, it.latitude.toFloat())
                    .putFloat(CURRENT_CITY_LONG, it.longitude.toFloat())
                    .apply()

                onStartDefaultCityWeatherFragment()
            }
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
        val directions = MainFragmentDirections
            .actionMainFragmentToCityWeatherFragment(cityParameters.lat, cityParameters.long)
        findNavController().navigate(directions)
    }


    private companion object {
        private const val TAG = "MainFragment"
        private const val CITY_PREFERENCES = "CITY_PREFERENCES"
        private const val CURRENT_CITY_LAT = "CURRENT_CITY_LAT"
        private const val CURRENT_CITY_LONG = "CURRENT_CITY_LONG"
    }
}