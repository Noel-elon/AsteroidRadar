package com.example.remote.mappers

interface Mapper<in R, out D> {
    fun mapToDataLayer(type: R): D
}