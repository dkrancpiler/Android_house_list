package com.example.android.house_list.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import com.example.android.house_list.data.db.HouseData
import com.example.android.house_list.data.db.HouseListDao
import com.example.android.house_list.data.network.HouseListDataSource
import com.example.android.house_list.data.response.CurrentList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.ZonedDateTime

class HousesRepositoryImpl (
    private val houseListDao: HouseListDao,
    private val houseListDataSource: HouseListDataSource
)   : HousesRepository {

    init{
        houseListDataSource.downloadedCurrentList.observeForever {newCurrentHouse ->
            persistFetchedCurrentHouses(newCurrentHouse)
        }
    }

    override suspend fun getCurrentHouse(): LiveData<HouseData> {
        return withContext(Dispatchers.IO) {
            initHouseData()
            houseListDao.getHouses()
        }
    }
    private fun persistFetchedCurrentHouses(currentHouses: CurrentList) {
        GlobalScope.launch(Dispatchers.IO) {
            val GetData = currentHouses.data
            houseListDao.insertHouses(GetData.data)
        }
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private suspend fun initHouseData() {
        if (isFetchNeeded(ZonedDateTime.now().minusHours(1)))
            fetchCurrentHouses()
    }
    private suspend fun fetchCurrentHouses() {
        houseListDataSource.fetchcurrentHouse()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun isFetchNeeded(lastFetchTime: ZonedDateTime): Boolean {
        val thirtyMinutesAgo = ZonedDateTime.now().minusMinutes(30)
        return lastFetchTime.isBefore(thirtyMinutesAgo)
    }
}