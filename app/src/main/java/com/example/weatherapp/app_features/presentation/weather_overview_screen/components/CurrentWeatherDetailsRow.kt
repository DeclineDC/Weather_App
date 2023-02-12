package com.example.weatherapp.app_features.presentation.weather_overview_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp

@Composable
fun CurrentWeatherDetailsRow(
    temperature: String,
    weatherDescription: String,
    painter: Painter
) {

    Row(Modifier.fillMaxWidth()) {

        Column(Modifier.weight(.5f)) {
            Text(text = "$temperature°", style = MaterialTheme.typography.h3, color = Color.White)
            Text(text = weatherDescription, color = Color.Gray, fontSize = 18.sp)

        }

        Image(painter, contentDescription = null, Modifier.weight(.5f))

    }

}