package com.example.weatherapp.presentation.weather_overview_screen.components

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

@Composable
fun CurrentWeatherDetailsRow(
    temperature: String,
    weatherDescription: String,
    painter: Painter
) {

    Row(Modifier.fillMaxWidth()) {

        Column(Modifier.weight(.5f)) {
            Text(text = "$temperature°", style = MaterialTheme.typography.h3, color = Color.White)
            Text(text = weatherDescription, color = Color.Gray)

        }

        Image(painter, contentDescription = null, Modifier.weight(.5f))

    }

}