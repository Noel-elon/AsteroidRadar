package com.example.local.mapper

import com.example.data.models.AsteroidData
import com.example.local.model.AsteroidLocal
import javax.inject.Inject


class LocalMapper @Inject constructor() : Mapper<AsteroidData, AsteroidLocal> {
    override fun mapDataToLocal(type: AsteroidData): AsteroidLocal {
        return with(type) {
            AsteroidLocal(
                id,
                absoluteMagnitude,
                estimatedDiameter,
                isPotentiallyHazardous,
                relativeVelocity,
                missDistance
            )

        }
    }

    override fun mapLocalToData(type: AsteroidLocal): AsteroidData {
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