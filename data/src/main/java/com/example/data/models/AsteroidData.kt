package com.example.data.models

data class AsteroidData(
    val id: String,
    val absoluteMagnitude: Double,
    val estimatedDiameter: String,
    val isPotentiallyHazardous: Boolean,
    val relativeVelocity: String,
    val missDistance: String
)