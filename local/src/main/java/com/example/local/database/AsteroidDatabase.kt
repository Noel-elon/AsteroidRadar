package com.example.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.local.model.AsteroidLocal
import com.example.local.dao.AsteroidDao

@Database(version = 1, exportSchema = false, entities = [AsteroidLocal::class])
abstract class AsteroidDatabase : RoomDatabase(){
    abstract fun dao(): AsteroidDao
}