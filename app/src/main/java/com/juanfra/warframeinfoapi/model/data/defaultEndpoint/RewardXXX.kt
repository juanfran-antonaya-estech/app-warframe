package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class RewardXXX(
    @SerializedName("items") var items: List<Any>,
    @SerializedName("countedItems") var countedItems: List<CountedItem>,
    @SerializedName("credits") var credits: Int, // 0
    @SerializedName("asString") var asString: String, // Sheev Heatsink
    @SerializedName("itemString") var itemString: String, // Sheev Heatsink
    @SerializedName("thumbnail") var thumbnail: String,
    @SerializedName("color") var color: Int // 5198940
)