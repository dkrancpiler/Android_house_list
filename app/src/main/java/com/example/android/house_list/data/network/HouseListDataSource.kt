package com.example.android.house_list.data.network

import androidx.lifecycle.LiveData
import com.example.android.house_list.data.response.CurrentList

interface HouseListDataSource {
    val downloadedCurrentList: LiveData<CurrentList>
    suspend fun fetchcurrentHouse()
}