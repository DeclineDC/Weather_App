package com.example.weatherapp.app_features.domain.repository

import com.example.weatherapp.app_features.data.util.Resource
import com.example.weatherapp.app_features.domain.model.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}