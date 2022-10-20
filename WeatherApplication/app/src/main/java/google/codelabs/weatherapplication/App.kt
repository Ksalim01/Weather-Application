package google.codelabs.weatherapplication

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import google.codelabs.weatherapplication.di.AppComponent
import google.codelabs.weatherapplication.di.DaggerAppComponent

class App : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }

    private lateinit var citySharedPreferences: SharedPreferences

    override fun onCreate() {
        super.onCreate()
        citySharedPreferences = applicationContext.getSharedPreferences(CITY_PREFERENCES, Context.MODE_PRIVATE)
    }

    fun setFavouritePlace(city: String) {
        citySharedPreferences.edit()
            .putString(CURRENT_CITY, city)
            .apply()
    }

    fun getFavouritePlace(): String? =
        citySharedPreferences.getString(CURRENT_CITY, "")

    private companion object {
        const val CITY_PREFERENCES = "CITY_PREFERENCES"
        const val CURRENT_CITY = "CURRENT_CITY"
    }
}