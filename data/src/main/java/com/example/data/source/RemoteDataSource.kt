package com.example.data.source

import com.example.data.models.BaseData
import kotlinx.coroutines.flow.Flow


interface RemoteDataSource {
    fun getAsteroidData(): Flow<BaseData>
}