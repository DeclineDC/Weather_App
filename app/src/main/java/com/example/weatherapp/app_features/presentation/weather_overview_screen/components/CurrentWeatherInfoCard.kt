package com.example.weatherapp.app_features.presentation.weather_overview_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.R
import com.example.weatherapp.app_features.domain.model.WeatherData
import com.example.weatherapp.ui.theme.LocalSpacing

@Composable
fun CurrentWeatherInfoCard(
    weatherData: WeatherData
) {

    val spacing = LocalSpacing.current

    Card(
        shape = RoundedCornerShape(spacing.spaceMedium),
        elevation = 1.dp,
        backgroundColor = MaterialTheme.colors.secondary,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(spacing.spaceMedium),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_wind),
                    contentDescription = null,
                    Modifier.size(32.dp)
                )
                Text(text = "${weatherData.windSpeed.toInt()} m/s", color = Color.White)
                Text(text = "Wind", color = Color.Gray)

            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_wind),
                    contentDescription = null,
                    Modifier.size(32.dp)
                )
                Text(text = "${weatherData.humidity.toInt()}%", color = Color.White)
                Text(text = "Humidity", color = Color.Gray)

            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_wind),
                    contentDescription = null,
                    Modifier.size(32.dp)
                )
                Text(text = weatherData.pressure.toInt().toString(), color = Color.White)
                Text(text = "Pressure", color = Color.Gray)

            }
        }


    }

}


