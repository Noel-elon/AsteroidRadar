package com.udacity.asteroidradar.di

import com.example.remote.api.AsteroidApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RemoteModule {

    companion object {
        const val BASE_URL = "https://api.nasa.gov/"
        const val API_KEY = "Ao6sS7Kggc55kQg5ILDXLPhoCttms6TVoTePIMag"
    }

    @Provides
    @Singleton
    fun providesApiKey() = API_KEY


    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideApi(retrofit: Retrofit): AsteroidApiService {
        return retrofit.create(AsteroidApiService::class.java)
    }


}