package com.example.data

import javax.inject.Inject

class DataSourceFactory @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) {
    fun localDs() = localDataSource
    fun remoteDs() = remoteDataSource
}