package com.example.weatherapp.app_features.presentation.weather_overview_screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.R
import com.example.weatherapp.app_features.domain.model.WeatherData
import com.example.weatherapp.ui.theme.LocalSpacing
import java.time.format.DateTimeFormatter

@Composable
fun WeatherCard(
    weatherData: WeatherData
) {

    val formattedTime = remember(weatherData) {
        weatherData.time.format(
            DateTimeFormatter.ofPattern("HH:mm")
        )
    }
    val spacing = LocalSpacing.current

    Card(
        shape = RoundedCornerShape(spacing.spaceMedium),
        elevation = 1.dp,
        backgroundColor = MaterialTheme.colors.secondary,
        modifier = Modifier.padding(spacing.spaceSmall)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(
                start = spacing.spaceMedium,
                end = spacing.spaceMedium,
                bottom = spacing.space12,
                top = spacing.space12
            )
        ) {
            Text(text = formattedTime, color = Color.Gray)
            Spacer(modifier = Modifier.padding(spacing.spaceExtraSmall))
            Icon(
                painter = painterResource(id = weatherData.weatherType.iconRes),
                contentDescription = null,
                Modifier.size(40.dp),
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.padding(spacing.spaceExtraSmall))
            Text(text = "${weatherData.temperatureCelsius.toInt()}°", color = Color.White)

        }


    }

}