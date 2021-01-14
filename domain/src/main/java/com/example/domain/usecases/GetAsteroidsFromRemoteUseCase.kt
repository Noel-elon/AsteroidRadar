package com.example.domain.usecases


import com.example.domain.models.BaseDomain
import com.example.domain.repository.RemoteRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class getAsteroidsFromRemoteUseCase @Inject constructor(
    private val remoteRepository: RemoteRepository,
    private val dispatcher: CoroutineDispatcher
) {

    operator fun invoke(): Flow<BaseDomain> {
        return remoteRepository.getAsteroids().flowOn(dispatcher)
    }
}