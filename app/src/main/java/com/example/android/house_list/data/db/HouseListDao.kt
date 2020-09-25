package com.example.android.house_list.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.android.house_list.data.db.entity.DataX
import com.example.android.house_list.data.response.Data

@Dao
interface HouseListDao {
    @Insert
    suspend fun insertHouses(houseEntry: List<DataX>)

    @Query ("SELECT * FROM houses_table")
    fun getHouses(): LiveData<UsableHouseData>

    @Query("SELECT * FROM houses_table WHERE id = :id ")
    suspend fun getHouseById(id: Int): DataX
}