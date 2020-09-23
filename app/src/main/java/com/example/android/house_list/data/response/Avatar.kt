package com.example.android.house_list.data.response


import com.google.gson.annotations.SerializedName

data class Avatar(
    val background: String,
    val description: Any,
    val id: Int,
    val square: Boolean,
    val title: String,
    val type: String
)