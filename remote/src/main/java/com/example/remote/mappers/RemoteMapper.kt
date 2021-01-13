package com.example.remote.mappers

import com.example.data.models.AsteroidData
import com.example.data.models.BaseData
import com.example.data.models.NearEarthData
import com.example.remote.models.BaseResponse
import javax.inject.Inject

class RemoteMapper @Inject constructor() : Mapper<BaseResponse, BaseData> {
    override fun mapToDataLayer(type: BaseResponse): BaseData {
        return with(type) {
            BaseData(NearEarthData(nearEarthObjects.asteroidForDate.map {
                with(it) {
                    AsteroidData(
                        id,
                        absoluteMagnitude,
                        estimatedDiameter.kilometers.estimatedDiameterMax.toString(),
                        isPotentiallyHazardous,
                        closeApproachData[0].relativeVelocity.kilometersPerSecond,
                        closeApproachData[0].missDistance.astronomical
                    )
                }
            }))
        }
    }


}