package com.example.android.house_list.data.db

import androidx.room.ColumnInfo

interface UsableHouseData {
    @get:ColumnInfo(name = "id")
    val id: Int
    @get:ColumnInfo(name = "cover_id")
    val img: Int
    @get:ColumnInfo(name = "description")
    val fulldesc: String
    @get:ColumnInfo(name = "seoDesc")
    val smalldesc: String
    @get:ColumnInfo(name = "title")
    val title: String
    @get:ColumnInfo(name = "seoTitle")
    val smalltitle: String
    @get:ColumnInfo(name = "address")
    val address: String
    @get:ColumnInfo(name = "price")
    val price: Int
}