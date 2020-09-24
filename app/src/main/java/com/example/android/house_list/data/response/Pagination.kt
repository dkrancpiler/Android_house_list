package com.example.android.house_list.data.response


data class Pagination(
    val lastPage: Int,
    val page: Int,
    val perPage: Int,
    val total: Int
)