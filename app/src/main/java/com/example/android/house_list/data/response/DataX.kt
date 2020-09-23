package com.example.android.house_list.data.response


import com.google.gson.annotations.SerializedName

data class DataX(
    val address: String,
    val address2: Any,
    @SerializedName("agency_id")
    val agencyId: Int,
    val area: Int,
    @SerializedName("available_from")
    val availableFrom: Any,
    @SerializedName("available_to")
    val availableTo: Any,
    val bathrooms: Int,
    val bedrooms: Int,
    val city: City,
    @SerializedName("city_id")
    val cityId: Int,
    val cover: Cover,
    @SerializedName("created_at")
    val createdAt: Long,
    @SerializedName("deleted_at")
    val deletedAt: Any,
    val description: String,
    val displayAddress: String,
    val hood: Hood,
    @SerializedName("hood_id")
    val hoodId: Int,
    val id: Int,
    @SerializedName("key_features")
    val keyFeatures: Any,
    val lat: Double,
    val likes: List<Like>,
    val listingTypes: List<ListingTypes>,
    val lng: Double,
    val locked: Int,
    val matterportUrl: Any,
    val media: Any,
    val mlsHome: Boolean,
    val myLike: Boolean,
    @SerializedName("office_id")
    val officeId: Int,
    val owner: Owner,
    val poa: Int,
    val popup: Any,
    val postcode: String,
    val price: Int,
    val `protected`: Int,
    val rentPoa: Int,
    val rentPrice: Any,
    val resourceType: String,
    @SerializedName("seo_desc")
    val seoDesc: String,
    @SerializedName("seo_title")
    val seoTitle: String,
    val slug: String,
    val status: String,
    val storyCount: Int,
    val title: String,
    val types: List<Type>,
    val uniqueViews: Int,
    @SerializedName("updated_at")
    val updatedAt: Long,
    @SerializedName("user_id")
    val userId: Any,
    val videoUrl: String,
    val viewsLastWeek: Int
)