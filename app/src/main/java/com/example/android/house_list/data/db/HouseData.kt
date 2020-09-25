package com.example.android.house_list.data.db

import androidx.room.ColumnInfo

class HouseData (
    @ColumnInfo(name = "id")
    var id: Int = 0,
    @ColumnInfo(name = "cover_id")
    var img: Int = 0,
    @ColumnInfo(name = "description")
    var fulldesc: String = "",
    @ColumnInfo(name = "seoDesc")
    var smalldesc: String = "",
    @ColumnInfo(name = "title")
    var title: String = "",
    @ColumnInfo(name = "seoTitle")
    var smalltitle: String = "",
    @ColumnInfo(name = "address")
    var address: String = "",
    @ColumnInfo(name = "price")
    var price: Int = 0
)