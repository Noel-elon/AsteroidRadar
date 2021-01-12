package com.example.local

import com.example.data.models.AsteroidData
import com.example.data.models.CloseApproachData
import javax.inject.Inject


class LocalMapper @Inject constructor() : Mapper<AsteroidData, AsteroidLocal> {
    override fun mapDataToLocal(type: AsteroidData): AsteroidLocal {
        return with(type) {
            AsteroidLocal(
                id,
                absoluteMagnitude,
                estimatedDiameter,
                isPotentiallyHazardous,
                closeApproachData.map {
                    with(it) {
                        CloseApproachData(relativeVelocity, missDistance)
                    }
                })

    }
}

override fun mapLocalToData(type: AsteroidLocal): AsteroidData {
    return with(type) {
        AsteroidData(
            id,
            absoluteMagnitude,
            estimatedDiameter,
            isPotentiallyHazardous,
            closeApproachData.map {
                with(it) {
                    CloseApproachData(relativeVelocity, missDistance)
                }
            })

    }
}

}