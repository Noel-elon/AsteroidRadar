package com.example.remote.models

import com.squareup.moshi.Json

data class AsteroidResponse(
    val id: String,
    @Json(name = "absolute_magnitude_h") val absoluteMagnitude: Double,
    @Json(name = "estimated_diameter") val estimatedDiameter: EstimatedDiameter,
    @Json(name = "is_potentially_hazardous_asteroid") val isPotentiallyHazardous: Boolean,
  @Json(name = "close_approach_data")  val closeApproachData: List<CloseApproach>


)


