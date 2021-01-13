package com.example.local.mapper

interface Mapper<A, E> {
    fun mapDataToLocal(type: A): E

    fun mapLocalToData(type: E): A
}