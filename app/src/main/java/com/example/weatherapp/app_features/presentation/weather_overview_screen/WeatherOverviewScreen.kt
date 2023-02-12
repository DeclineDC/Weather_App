package com.example.weatherapp.app_features.presentation.weather_overview_screen

import android.app.Application
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.toLowerCase
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.weatherapp.R
import com.example.weatherapp.app_features.presentation.weather_overview_screen.components.*
import com.example.weatherapp.ui.theme.LocalSpacing
import dagger.hilt.android.qualifiers.ApplicationContext

@Composable
fun WeatherOverviewScreen(
) {

    val viewModel: WeatherOverviewViewModel = hiltViewModel()
    val state = viewModel.state

    val spacing = LocalSpacing.current



    Column(
        modifier = Modifier
            .padding(spacing.spaceMedium)
            .fillMaxSize()
            .background(MaterialTheme.colors.primary)
    ) {
        state.weatherInfo?.currentWeatherData?.let { data ->

            WeatherOverviewTopBar(
                location = getLocationName(
                    lat = state.latitude,
                    long = state.longitude
                ),
                date = "${data.time.dayOfMonth} ${
                    data.time.month.toString().lowercase()
                }, ${data.time.dayOfWeek.toString().lowercase()}"
            )
            Spacer(modifier = Modifier.padding(spacing.spaceMedium))
            CurrentWeatherDetailsRow(
                temperature = data.temperatureCelsius.toInt().toString(),
                weatherDescription = data.weatherType.weatherDesc,
                painter = painterResource(
                    id = data.weatherType.iconRes
                )
            )
            Spacer(modifier = Modifier.padding(spacing.spaceMedium))
            CurrentWeatherInfoCard(weatherData = data)
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

}
