package com.example.android.house_list.data.db.entity

import androidx.room.Embedded


data class Cover(
    var background: String,
    @Embedded (prefix = "description_")
    var description: Any,
    @Embedded (prefix = "id_")
    var id: Any,
    var title: String,
    var type: String
)