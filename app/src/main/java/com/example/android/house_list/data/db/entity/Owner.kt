package com.example.android.house_list.data.db.entity


import androidx.room.Embedded
import com.google.gson.annotations.SerializedName

data class Owner(
    var address: String,
    @SerializedName("agency_id")
    var agencyId: Int,
    var agencyTitle: String,
    @Embedded
    var avatar: Avatar,
    @SerializedName("city_id")
    var cityId: Int,
    var description: String,
    var id: Int,
    var lat: Double,
    var link: String,
    var lng: Double,
    @Embedded (prefix = "order_")
    var order: Any,
    var postcode: String,
    var resourceType: String,
    var single: Int,
    var slug: String,
    var status: String,
    var title: String,
    var type: String
)