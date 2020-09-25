package com.example.android.house_list.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.android.house_list.data.db.entity.DataX

@Database (
    entities = [DataX::class],
    version = 1
)
abstract class HousesDatabase: RoomDatabase() {
    abstract fun roomHouseListDao(): HouseListDao

    companion object {
        @Volatile
        private var instance: HousesDatabase? = null

        fun getInstance(context: Context): HousesDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }
        private fun buildDatabase(context: Context): HousesDatabase {
            return Room.databaseBuilder(context, HousesDatabase::class.java, "houses.db")
                .build()
        }
    }
}