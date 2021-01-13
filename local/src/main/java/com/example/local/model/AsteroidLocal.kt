package com.example.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "asteroid_table")
data class AsteroidLocal(
    @PrimaryKey val id: String,
    val absoluteMagnitude: Double,
    val estimatedDiameter: String,
    val isPotentiallyHazardous: Boolean,
    val relativeVelocity: String,
    val missDistance: String
)