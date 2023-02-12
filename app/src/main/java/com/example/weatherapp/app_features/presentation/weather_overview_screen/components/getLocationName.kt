package com.example.weatherapp.app_features.presentation.weather_overview_screen.components

import android.location.Geocoder
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun getLocationName(lat: Double, long: Double): String {

    val context = LocalContext.current

    val geoCoder = Geocoder(context)
    val location = geoCoder.getFromLocation(lat, long, 1)
    val cityName: String? = location?.get(0)?.locality

    return cityName ?: ""


}