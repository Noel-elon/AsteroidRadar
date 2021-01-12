package com.example.remote.models

import com.squareup.moshi.Json

data class CloseApproach(
    @Json(name = "relative_velocity") val relativeVelocity: RelativeVelocity,
    @Json(name = "miss_distance") val missDistance: MissDistance
)