package com.example.weatherapp.app_features.data.repository

import com.example.weatherapp.app_features.data.mappers.toWeatherInfo
import com.example.weatherapp.app_features.data.remote.WeatherAPI
import com.example.weatherapp.app_features.data.util.Resource
import com.example.weatherapp.app_features.domain.model.WeatherInfo
import com.example.weatherapp.app_features.domain.repository.WeatherRepository
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherAPI
) : WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )

        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An error occurred")
        }
    }
}