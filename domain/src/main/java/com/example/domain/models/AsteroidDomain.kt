package com.example.domain.models

data class AsteroidDomain (
    val id: String,
    val absoluteMagnitude: Double,
    val estimatedDiameter: String,
    val isPotentiallyHazardous: Boolean,
    val relativeVelocity: String,
    val missDistance: String
        )