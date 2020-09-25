package com.example.android.house_list.data.repository

import androidx.lifecycle.LiveData
import com.example.android.house_list.data.db.UsableHouseData

interface HousesRepository {
    suspend fun getCurrentHouse (): LiveData<UsableHouseData>
}