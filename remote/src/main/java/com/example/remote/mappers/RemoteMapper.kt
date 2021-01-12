package com.example.remote.mappers

import com.example.data.models.AsteroidData
import com.example.data.models.BaseData
import com.example.data.models.CloseApproachData
import com.example.remote.models.BaseResponse
import javax.inject.Inject

class RemoteMapper @Inject constructor() : Mapper<BaseResponse, BaseData> {
    override fun mapToDataLayer(type: BaseResponse): BaseData {
        return with(type) {
            BaseData(nearEarthObjects.map { asteroidResponse ->
                with(asteroidResponse) {
                    AsteroidData(
                        id,
                        absoluteMagnitude,
                        estimatedDiameter.kilometers.estimatedDiameterMax.toString(),
                        isPotentiallyHazardous, closeApproachData.map { closeApproach ->
                            with(closeApproach) {
                                CloseApproachData(
                                    relativeVelocity.kilometersPerSecond,
                                    missDistance.astronomical
                                )
                            }
                        }
                    )
                }

            })
        }
    }


}