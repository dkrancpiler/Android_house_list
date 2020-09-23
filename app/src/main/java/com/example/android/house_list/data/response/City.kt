package com.example.android.house_list.data.response


import com.google.gson.annotations.SerializedName

data class City(
    @SerializedName("country_id")
    val countryId: Int,
    val id: Int,
    val lat: Double,
    val lng: Double,
    val polygon: Any,
    @SerializedName("region_id")
    val regionId: Int,
    val slug: String,
    val title: String
)