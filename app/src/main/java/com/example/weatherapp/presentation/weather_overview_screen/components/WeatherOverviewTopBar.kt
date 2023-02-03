package com.example.weatherapp.presentation.weather_overview_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun WeatherOverviewTopBar(
    location: String,
    date: String,
) {

    Row(Modifier.fillMaxWidth()) {
        Column() {
            Text(text = location, style = MaterialTheme.typography.h1, color = Color.White)
            Text(text = date, color = Color.Gray)

        }
    }


}