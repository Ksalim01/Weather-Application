package google.codelabs.weatherapplication.screen

import android.Manifest
import android.content.pm.PackageManager
import android.location.Geocoder
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.gms.location.LocationServices
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.FragmentMainBinding
import google.codelabs.weatherapplication.screen.cityweather.utils.cityName
import java.util.*

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    private val requestLocationPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission(),
        ::onGotLocationPermissionResult
    )

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
                    Log.d(TAG, city)
                    sharedPreferences(requireContext()).setFavouritePlace(city)
                } catch (e: Exception) {

                }
                onStartDefaultCityWeatherFragment()
            }
        }
    }

    private fun onStartDefaultCityWeatherFragment() {
        val city = sharedPreferences(requireContext()).getFavouritePlace()
        Log.d(TAG, "$city")
        if (city != null) onStartCityWeatherFragment(city)
    }

    private fun onStartCityWeatherFragment(city: String) {
        val directions = MainFragmentDirections
            .actionMainFragmentToCityWeatherFragment(city)
        findNavController().navigate(directions)
    }

    private companion object {
        const val TAG = "MainFragment"
    }
}