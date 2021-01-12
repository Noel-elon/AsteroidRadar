package com.udacity.asteroidradar.di

import android.content.Context
import androidx.room.Room
import com.example.local.AsteroidDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class LocalModule {

    @Provides
    @Singleton
    fun provideLocalDatabase(@ApplicationContext context: Context): AsteroidDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AsteroidDatabase::class.java,
            "asteroid_db"

        )
            .fallbackToDestructiveMigration()
            .build()
    }


    @Singleton
    @Provides
    fun provideContext(@ApplicationContext context: Context): Context {
        return context
    }
}