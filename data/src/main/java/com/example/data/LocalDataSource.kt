package com.example.data

import com.example.data.models.AsteroidData
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {
    fun getAsteroidData(): Flow<List<AsteroidData>>
    fun addAsteroidData(asteroids: List<AsteroidData>): Flow<Unit>
}