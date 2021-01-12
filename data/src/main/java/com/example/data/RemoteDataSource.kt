package com.example.data

import com.example.data.models.BaseData
import kotlinx.coroutines.flow.Flow


interface RemoteDataSource {
    fun getAsteroidData(): Flow<BaseData>
}