package com.example.android.house_list.data.response


import com.google.gson.annotations.SerializedName

data class ListingTypes(
    val color: String,
    val hidden: Any,
    val id: Int,
    val slug: String,
    val title: String
)