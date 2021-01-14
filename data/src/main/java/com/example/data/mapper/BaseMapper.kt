package com.example.data.mapper

import com.example.data.models.AsteroidData
import com.example.data.models.BaseData
import com.example.data.models.NearEarthData
import com.example.domain.models.AsteroidDomain
import com.example.domain.models.BaseDomain
import com.example.domain.models.NearEarthObjectDomain
import javax.inject.Inject

class BaseMapper @Inject constructor() : Mapper<BaseData, BaseDomain> {
    override fun mapDataToDomainLayer(type: BaseData): BaseDomain {
        return with(type) {
            BaseDomain(NearEarthObjectDomain(nearEarthObject.asteroidDataForDate.map { data ->
                with(data) {
                    AsteroidDomain(
                        id,
                        absoluteMagnitude,
                        estimatedDiameter,
                        isPotentiallyHazardous,
                        relativeVelocity,
                        missDistance
                    )
                }
            }))
        }
    }

    override fun mapDomainToDataLayer(type: BaseDomain): BaseData {
        return with(type) {
            BaseData(NearEarthData(nearEarthObject.asteroidDataForDate.map { asteroidDomain ->
                with(asteroidDomain) {
                    AsteroidData(
                        id,
                        absoluteMagnitude,
                        estimatedDiameter,
                        isPotentiallyHazardous,
                        relativeVelocity,
                        missDistance
                    )
                }

            }))
        }
    }
}