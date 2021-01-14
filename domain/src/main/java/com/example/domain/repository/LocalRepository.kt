package com.example.domain.repository

import com.example.domain.models.AsteroidDomain
import kotlinx.coroutines.flow.Flow

interface LocalRepository {

    fun insertAsteroids(asteroids: List<AsteroidDomain>): Flow<Unit>

    fun getAsteroids(): Flow<List<AsteroidDomain>>
}