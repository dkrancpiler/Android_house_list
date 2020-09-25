package com.example.android.house_list.data.db.entity


data class Pagination(
    val lastPage: Int,
    val page: Int,
    val perPage: Int,
    val total: Int
)