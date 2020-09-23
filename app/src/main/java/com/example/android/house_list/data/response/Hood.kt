package com.example.android.house_list.data.response


import com.example.android.house_list.data.response.CoverX
import com.google.gson.annotations.SerializedName

data class Hood(
    @SerializedName("city_id")
    val cityId: Int,
    val cover: CoverX,
    val description: String,
    val id: Int,
    val lat: Double,
    val lng: Double,
    val polygon: List<List<Double>>,
    val postcode: String,
    val resourceType: String,
    val slug: String,
    @SerializedName("story_id")
    val storyId: Int,
    @SerializedName("text_falling_in_love")
    val textFallingInLove: String,
    @SerializedName("text_lifestyle")
    val textLifestyle: String,
    @SerializedName("text_market")
    val textMarket: String,
    @SerializedName("text_neighbours")
    val textNeighbours: String,
    @SerializedName("text_what_not_to_expect")
    val textWhatNotToExpect: String,
    @SerializedName("text_what_to_expect")
    val textWhatToExpect: String,
    val title: String,
    @SerializedName("user_id")
    val userId: Int
)