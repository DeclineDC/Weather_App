package com.example.weatherapp.app_features.presentation.weather_overview_screen.components

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
import com.example.weatherapp.ui.theme.LocalSpacing

@Composable
fun WeatherCard() {

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
            Text(text = "10 am", color = Color.Gray)
            Spacer(modifier = Modifier.padding(spacing.spaceExtraSmall))
            Icon(
                painter = painterResource(id = R.drawable.ic_sunny),
                contentDescription = null,
                Modifier.size(40.dp)
            )
            Spacer(modifier = Modifier.padding(spacing.spaceExtraSmall))
            Text(text = "16°", color = Color.White)

        }


    }

}