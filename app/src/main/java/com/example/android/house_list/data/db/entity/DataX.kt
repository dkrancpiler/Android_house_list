package com.example.android.house_list.data.db.entity


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "houses_table")
data class DataX(
    val address: String,
    @Embedded
    val address2: Any,
    @SerializedName("agency_id")
    val agencyId: Int,
    val area: Int,
    @SerializedName("available_from")
    @Embedded
    val availableFrom: Any,
    @SerializedName("available_to")
    val availableTo: Any,
    val bathrooms: Int,
    val bedrooms: Int,
    @Embedded(prefix = "city_")
    val city: City,
    @SerializedName("city_id")
    val cityId: Int,
    @Embedded(prefix = "cover_")
    val cover: Cover,
    @SerializedName("created_at")
    val createdAt: Long,
    @SerializedName("deleted_at")
    @Embedded
    val deletedAt: Any,
    val description: String,
    val displayAddress: String,
    @Embedded(prefix = "hood_")
    val hood: Hood,
    @SerializedName("hood_id")
    val hoodId: Int,
    @PrimaryKey
    val id: Int,
    @SerializedName("key_features")
    @Embedded
    val keyFeatures: Any,
    val lat: Double,
    @Embedded (prefix = "like_")
    val likes: List<Like>,
    @Embedded (prefix = "listingtypes_")
    val listingTypes: List<ListingTypes>,
    val lng: Double,
    val locked: Int,
    @Embedded
    val matterportUrl: Any,
    @Embedded(prefix = "media_")
    val media: Any,
    val mlsHome: Boolean,
    val myLike: Boolean,
    @SerializedName("office_id")
    val officeId: Int,
    @Embedded(prefix = "owner_")
    val owner: Owner,
    val poa: Int,
    @Embedded
    val popup: Any,
    val postcode: String,
    val price: Int,
    val `protected`: Int,
    val rentPoa: Int,
    @Embedded
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
    @Embedded(prefix = "type_")
    val types: List<Type>,
    val uniqueViews: Int,
    @SerializedName("updated_at")
    val updatedAt: Long,
    @SerializedName("user_id")
    @Embedded
    val userId: Any,
    val videoUrl: String,
    val viewsLastWeek: Int
)