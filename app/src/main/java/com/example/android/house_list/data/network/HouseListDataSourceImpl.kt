package com.example.android.house_list.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.house_list.data.response.CurrentList
import com.example.android.house_list.internal.NoConnectivityException

class HouseListDataSourceImpl(
    private val apihouses: HousePull
) : HouseListDataSource {
    private val _downloadedCurrentList = MutableLiveData<CurrentList>()
    override val downloadedCurrentList: LiveData<CurrentList>
        get() = _downloadedCurrentList

    override suspend fun fetchcurrentHouse() {
        try {
            val fetchedCurrentList = apihouses
                .gethouselist()
            _downloadedCurrentList.postValue(fetchedCurrentList)
        }
        catch (e: NoConnectivityException) {
            Log.e("Connectivity", "No internet connection", e)
        }
    }
}