package com.example.data.mapper

import com.example.data.models.AsteroidData
import com.example.domain.models.AsteroidDomain
import javax.inject.Inject

class AsteroidMapper @Inject constructor() : Mapper<AsteroidData, AsteroidDomain> {
    override fun mapDataToDomainLayer(type: AsteroidData): AsteroidDomain {
        return with(type) {
            AsteroidDomain(
                id,
                absoluteMagnitude,
                estimatedDiameter,
                isPotentiallyHazardous,
                relativeVelocity,
                missDistance
            )
        }
    }

    override fun mapDomainToDataLayer(type: AsteroidDomain): AsteroidData {
        return with(type) {
            AsteroidData(
                id,
                absoluteMagnitude,
                estimatedDiameter,
                isPotentiallyHazardous,
                relativeVelocity,
                missDistance
            )
        }
    }
}