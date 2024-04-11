package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Reward(
    @SerializedName("items")
    val items: List<String>,
    @SerializedName("countedItems")
    val countedItems: List<Any>,
    @SerializedName("credits")
    val credits: Int, // 0
    @SerializedName("asString")
    val asString: String, // Opticor Vandal
    @SerializedName("itemString")
    val itemString: String, // Opticor Vandal
    @SerializedName("thumbnail")
    val thumbnail: String, // https://cdn.warframestat.us/img/dera-vandal.png
    @SerializedName("color")
    val color: Int // 6052435
)