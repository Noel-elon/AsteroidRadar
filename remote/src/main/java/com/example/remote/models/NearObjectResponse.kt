package com.example.remote.models

import com.squareup.moshi.Json

data class NearObjectResponse (
    @Json(name = "2015-09-08") val asteroidForDate: List<AsteroidResponse>
        )