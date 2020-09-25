package com.example.android.house_list.data.db

import androidx.room.ColumnInfo

class HouseData (
    @get:ColumnInfo(name = "id")
    override var id: Int = 0,
    @get:ColumnInfo(name = "cover_id")
    override var img: Int = 0,
    @get:ColumnInfo(name = "description")
    override var fulldesc: String = "",
    @get:ColumnInfo(name = "seoDesc")
    override var smalldesc: String = "",
    @get:ColumnInfo(name = "title")
    override var title: String = "",
    @get:ColumnInfo(name = "seoTitle")
    override var smalltitle: String = "",
    @get:ColumnInfo(name = "address")
    override var address: String = "",
    @get:ColumnInfo(name = "price")
    override var price: Int = 0
) : UsableHouseData