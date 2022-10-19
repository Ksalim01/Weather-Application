package google.codelabs.weatherapplication

import android.Manifest
import android.content.Context
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.location.Geocoder
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.gms.location.LocationServices
import google.codelabs.weatherapplication.databinding.FragmentMainBinding
import google.codelabs.weatherapplication.screen.cityweather.fragment.Coordinates
import google.codelabs.weatherapplication.screen.cityweather.utils.cityName
import java.util.*

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
                try {
                    val geocoder = Geocoder(context, Locale.getDefault())
                    val city = cityName(it.latitude.toFloat(), it.longitude.toFloat(), geocoder)!!
                    citySharedPreferences.edit()
                        .putString(CURRENT_CITY, city)
                        .apply()
                } catch (e: Exception) {

                }
                onStartDefaultCityWeatherFragment()
            }
        }
    }

    private fun onStartDefaultCityWeatherFragment() {
        val city = citySharedPreferences.getString(CURRENT_CITY, "")
        if (city != null) onStartCityWeatherFragment(city)
    }

    private fun onStartCityWeatherFragment(city: String) {
        val directions = MainFragmentDirections
            .actionMainFragmentToCityWeatherFragment("Новосибирск")
        findNavController().navigate(directions)
    }


    private companion object {
        private const val TAG = "MainFragment"
        private const val CITY_PREFERENCES = "CITY_PREFERENCES"
        private const val CURRENT_CITY = "CURRENT_CITY"
    }
}