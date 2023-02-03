package com.example.weatherapp.di

import com.example.weatherapp.app_features.data.location.DefaultLocationTracker
import com.example.weatherapp.app_features.data.repository.WeatherRepositoryImpl
import com.example.weatherapp.app_features.domain.location.LocationTracker
import com.example.weatherapp.app_features.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}