package com.example.weatherapp.app_features.presentation.weather_overview_screen

import android.location.Address
import com.example.weatherapp.app_features.domain.model.WeatherInfo

data class WeatherOverviewState(
    val weatherInfo: WeatherInfo? = null,
    val latitude: Double = 0.0,
    val longitude: Double = 0.0,
    val isLoading: Boolean = false,
    val error: String? = null
)