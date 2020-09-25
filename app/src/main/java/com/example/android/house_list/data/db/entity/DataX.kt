package com.example.android.house_list.data.db.entity


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "houses_table")
data class DataX(
    var address: String = "",
    @Embedded(prefix = "city_")
    var city: City? = null,
    @Embedded(prefix = "cover_")
    var cover: Cover? = null,
    var description: String = "",
    @PrimaryKey var id: Int = 0,
    var lat: Double = 0.0,
    var lng: Double = 0.0,
    var locked: Int = 0,
    @Embedded(prefix = "media_")
    var media: Any? = null,
    var price: Int = 0,
    var `protected`: Int = 0,
    @SerializedName("seo_desc")
    var seoDesc: String = "",
    @SerializedName("seo_title")
    var seoTitle: String = "",
    var title: String = ""
)