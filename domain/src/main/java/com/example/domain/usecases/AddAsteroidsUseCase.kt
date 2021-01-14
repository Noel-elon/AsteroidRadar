package com.example.domain.usecases

import com.example.domain.models.AsteroidDomain
import com.example.domain.repository.LocalRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class addAsteroidsUseCase @Inject constructor(
private val localRepository: LocalRepository,
private val dispatcher: CoroutineDispatcher
) {

    operator fun invoke(asteroids: List<AsteroidDomain>) : Flow<Unit> {
        return localRepository.insertAsteroids(asteroids).flowOn(dispatcher)
    }


}