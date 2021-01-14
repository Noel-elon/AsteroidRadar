package com.example.data.mapper

interface Mapper<I, O> {
    fun mapDataToDomainLayer(type: I): O
    fun mapDomainToDataLayer(type: O): I
}