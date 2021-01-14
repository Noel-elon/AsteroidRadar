package com.example.data.repository

import com.example.data.mapper.AsteroidMapper
import com.example.data.source.DataSourceFactory
import com.example.domain.models.AsteroidDomain
import com.example.domain.repository.LocalRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LocalRepositoryImpl @Inject constructor(
    private val dataSourceFactory: DataSourceFactory,
    private val asteroidMapper: AsteroidMapper
) : LocalRepository {
    override fun insertAsteroids(asteroids: List<AsteroidDomain>): Flow<Unit> {
        return dataSourceFactory.localDs().addAsteroidData(
            asteroids.map {
                asteroidMapper.mapDomainToDataLayer(it)
            }
        )
    }

    override fun getAsteroids(): Flow<List<AsteroidDomain>> {
        return dataSourceFactory.localDs().getAsteroidData().map { asteroids ->
            asteroids.map {
                asteroidMapper.mapDataToDomainLayer(it)
            }
        }
    }
}