package google.codelabs.weatherapplication.di

import dagger.Module
import google.codelabs.weatherapplication.screen.MainActivityComponent

@Module(
    subcomponents = [
        MainActivityComponent::class
    ]
)
interface AppSubcomponents