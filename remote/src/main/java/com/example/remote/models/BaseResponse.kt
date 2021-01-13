package com.example.remote.models

import com.squareup.moshi.Json

data class BaseResponse(
    @Json(name = "near_earth_objects") val nearEarthObjects: NearObjectResponse
)