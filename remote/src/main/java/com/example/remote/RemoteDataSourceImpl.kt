package com.example.remote

import com.example.data.RemoteDataSource
import com.example.data.models.BaseData
import com.example.remote.api.AsteroidApiService
import com.example.remote.mappers.RemoteMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val api: AsteroidApiService,
    private val mapper: RemoteMapper
) :
    RemoteDataSource {
    override fun getAsteroidData(): Flow<BaseData> {
        return flow {
            emit(mapper.mapToDataLayer(api.getAsteroidData()))
        }
    }
}