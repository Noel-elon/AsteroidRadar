package com.example.data.repository

import com.example.data.mapper.BaseMapper
import com.example.data.source.DataSourceFactory
import com.example.domain.models.BaseDomain
import com.example.domain.repository.RemoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class RemoteRepositoryImpl @Inject constructor(
    private val dataSourceFactory: DataSourceFactory,
    private val baseMapper: BaseMapper
) : RemoteRepository {
    override fun getAsteroids(): Flow<BaseDomain> {
        return dataSourceFactory.remoteDs().getAsteroidData().map {
            baseMapper.mapDataToDomainLayer(it)
        }
    }
}