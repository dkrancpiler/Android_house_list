package com.example.android.house_list.data.repository

import androidx.lifecycle.LiveData
import com.example.android.house_list.data.db.HouseData

interface HousesRepository {
    suspend fun getCurrentHouse (): LiveData<HouseData>
}