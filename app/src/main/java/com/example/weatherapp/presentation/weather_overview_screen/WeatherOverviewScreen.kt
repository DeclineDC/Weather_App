package com.example.weatherapp.presentation.weather_overview_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.weatherapp.R
import com.example.weatherapp.presentation.weather_overview_screen.components.*
import com.example.weatherapp.ui.theme.LocalSpacing

@Composable
fun WeatherOverviewScreen() {

    val spacing = LocalSpacing.current

    Column(
        modifier = Modifier
            .padding(spacing.spaceMedium)
            .fillMaxSize()
            .background(MaterialTheme.colors.primary)
    ) {

        WeatherOverviewTopBar(location = "Tessenderlo", date = "3 February, Friday")
        Spacer(modifier = Modifier.padding(spacing.spaceMedium))
        CurrentWeatherDetailsRow(
            temperature = "10", weatherDescription = "Cloudy", painter = painterResource(
                id = R.drawable.ic_cloudy
            )
        )
        Spacer(modifier = Modifier.padding(spacing.spaceMedium))
        CurrentWeatherInfoCard()
        Spacer(modifier = Modifier.padding(spacing.spaceMedium))
        LazyRow(Modifier.fillMaxWidth()) {
            items(12) {
                WeatherCard()
            }
        }
        Spacer(modifier = Modifier.padding(spacing.spaceMedium))
        SunriseAndSunsetCard()


    }

}
