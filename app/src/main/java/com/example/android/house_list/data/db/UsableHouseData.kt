package com.example.android.house_list.data.db

import androidx.room.ColumnInfo

interface UsableHouseData {
    var id: Int
    var img: Int
    var fulldesc: String
    var smalldesc: String
    var title: String
    var smalltitle: String
    var address: String
    var price: Int
}