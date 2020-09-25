package com.example.android.house_list.data.db.entity


import androidx.room.Embedded
import com.google.gson.annotations.SerializedName

data class City(
    @SerializedName("country_id")
    var countryId: Int,
    var id: Int,
    var lat: Double,
    var lng: Double,
    @Embedded(prefix = "polygon_")
    var polygon: Any,
    @SerializedName("region_id")
    var regionId: Int,
    var slug: String,
    var title: String
)