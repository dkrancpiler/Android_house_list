package com.example.android.house_list.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.android.house_list.data.db.entity.DataX

@Dao
interface HouseListDao {
    @Insert
    suspend fun insertHouses(houseEntry: DataX)

    @Query ("SELECT * FROM houses_table")
    suspend fun getHouses(): List<DataX>

    @Query("SELECT * FROM houses_table WHERE id = :id ")
    suspend fun getHouseById(id: Int): DataX
}