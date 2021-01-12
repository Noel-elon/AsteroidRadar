package com.example.remote.models

import com.squareup.moshi.Json

data class Kilometer(
    @Json(name = "estimated_diameter_max") val estimatedDiameterMax: Double
)