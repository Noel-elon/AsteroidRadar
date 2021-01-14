package com.example.domain.repository

import com.example.domain.models.BaseDomain
import kotlinx.coroutines.flow.Flow

interface RemoteRepository {
    fun getAsteroids(): Flow<BaseDomain>
}