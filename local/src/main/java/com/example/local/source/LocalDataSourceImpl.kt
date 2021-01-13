package com.example.local.source

import com.example.data.LocalDataSource
import com.example.data.models.AsteroidData
import com.example.local.database.AsteroidDatabase
import com.example.local.mapper.LocalMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    private val database: AsteroidDatabase, private val mapper: LocalMapper
) :
    LocalDataSource {
    override fun getAsteroidData(): Flow<List<AsteroidData>> {
        return database.dao().getAsteroids().map { asteroids ->
            asteroids.map {
                mapper.mapLocalToData(it)
            }
        }
    }

    override fun addAsteroidData(asteroids: List<AsteroidData>): Flow<Unit> {
        return flow {
            emit(database.dao().insertAsteroids(asteroids.map {
                mapper.mapDataToLocal(it)
            }))
        }
    }
}