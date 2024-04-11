package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class RewardXXXX(
    @SerializedName("items") var items: List<Any>,
    @SerializedName("countedItems") var countedItems: List<CountedItemX>,
    @SerializedName("credits") var credits: Int, // 0
    @SerializedName("asString") var asString: String, // Snipetron Vandal Blueprint
    @SerializedName("itemString") var itemString: String, // Snipetron Vandal Blueprint
    @SerializedName("thumbnail") var thumbnail: String, // https://cdn.warframestat.us/img/dera-vandal.png
    @SerializedName("color") var color: Int // 6052435
)