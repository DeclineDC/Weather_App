package com.example.weatherapp.app_features.presentation.weather_overview_screen

import com.example.weatherapp.app_features.domain.model.WeatherInfo

data class WeatherOverviewState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)