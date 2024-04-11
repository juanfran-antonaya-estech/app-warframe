package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class RewardXXX(
    @SerializedName("items")
    val items: List<Any>,
    @SerializedName("countedItems")
    val countedItems: List<CountedItem>,
    @SerializedName("credits")
    val credits: Int, // 0
    @SerializedName("asString")
    val asString: String, // Sheev Heatsink
    @SerializedName("itemString")
    val itemString: String, // Sheev Heatsink
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("color")
    val color: Int // 5198940
)