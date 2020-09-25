package com.example.android.house_list.data.db.entity

import androidx.room.Embedded


data class Avatar(
    val background: String,
    @Embedded (prefix = "")
    val description: Any,
    val id: Int,
    val square: Boolean,
    val title: String,
    val type: String
)