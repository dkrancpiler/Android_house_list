package com.example.android.house_list.data.db.entity

import androidx.room.Embedded


data class Cover(
    var background: String,
    @Embedded (prefix = "description_")
    var description: Any,
    var id: String?,
    var title: String,
    var type: String
)