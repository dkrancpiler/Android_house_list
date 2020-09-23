package com.example.android.house_list.data.response


import com.example.android.house_list.data.response.Avatar
import com.google.gson.annotations.SerializedName

data class Owner(
    val address: String,
    @SerializedName("agency_id")
    val agencyId: Int,
    val agencyTitle: String,
    val avatar: Avatar,
    @SerializedName("city_id")
    val cityId: Int,
    val description: String,
    val id: Int,
    val lat: Double,
    val link: String,
    val lng: Double,
    val order: Any,
    val postcode: String,
    val resourceType: String,
    val single: Int,
    val slug: String,
    val status: String,
    val title: String,
    val type: String
)