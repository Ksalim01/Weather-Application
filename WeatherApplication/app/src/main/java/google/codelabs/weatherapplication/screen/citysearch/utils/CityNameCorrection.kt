package google.codelabs.weatherapplication.screen.citysearch.utils

fun correctCityName(city: String): String =
    city.lowercase().replaceFirstChar { it.uppercase() }.trim()
