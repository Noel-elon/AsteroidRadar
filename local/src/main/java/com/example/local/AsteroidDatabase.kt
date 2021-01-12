package com.example.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, exportSchema = false, entities = [AsteroidLocal::class])
abstract class AsteroidDatabase : RoomDatabase(){
    abstract fun dao(): AsteroidDao
}