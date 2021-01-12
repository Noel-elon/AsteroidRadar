package com.example.remote.api

import com.example.remote.models.BaseResponse
import retrofit2.http.GET

interface AsteroidApiService {
    @GET()
    fun getAsteroidData(): BaseResponse


}