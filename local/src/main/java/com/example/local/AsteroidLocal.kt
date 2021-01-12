package com.example.local

import com.example.data.models.CloseApproachData

data class AsteroidLocal(
    val id: String,
    val absoluteMagnitude: Double,
    val estimatedDiameter: String,
    val isPotentiallyHazardous: Boolean,
    val closeApproachData: List<CloseApproachData>
)