package com.example.android.house_list.data.response

import com.example.android.house_list.data.db.entity.DataX
import com.example.android.house_list.data.db.entity.Pagination


data class Data(
    val `data`: List<DataX>,
    val pagination: Pagination
)