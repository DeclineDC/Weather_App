package com.example.weatherapp.presentation.util

sealed class Screen(val route: String) {
    object WeatherOverviewScreen : Screen("weather_overview_screen")
    object WeatherDetailScreen : Screen("weather_detail_screen")
}