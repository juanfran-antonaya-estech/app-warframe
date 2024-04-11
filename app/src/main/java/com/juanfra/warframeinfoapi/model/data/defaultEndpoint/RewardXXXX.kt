package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class RewardXXXX(
    @SerializedName("items")
    val items: List<Any>,
    @SerializedName("countedItems")
    val countedItems: List<CountedItemX>,
    @SerializedName("credits")
    val credits: Int, // 0
    @SerializedName("asString")
    val asString: String, // Snipetron Vandal Blueprint
    @SerializedName("itemString")
    val itemString: String, // Snipetron Vandal Blueprint
    @SerializedName("thumbnail")
    val thumbnail: String, // https://cdn.warframestat.us/img/dera-vandal.png
    @SerializedName("color")
    val color: Int // 6052435
)