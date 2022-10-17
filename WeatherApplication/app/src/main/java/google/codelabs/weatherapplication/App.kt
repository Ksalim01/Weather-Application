package google.codelabs.weatherapplication

import android.app.Application
import google.codelabs.weatherapplication.di.AppComponent
import google.codelabs.weatherapplication.di.DaggerAppComponent

class App : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}