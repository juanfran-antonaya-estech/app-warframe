package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Reward(
    @SerializedName("items") var items: List<String>,
    @SerializedName("countedItems") var countedItems: List<Any>,
    @SerializedName("credits") var credits: Int, // 0
    @SerializedName("asString") var asString: String, // Opticor Vandal
    @SerializedName("itemString") var itemString: String, // Opticor Vandal
    @SerializedName("thumbnail") var thumbnail: String, // https://cdn.warframestat.us/img/dera-vandal.png
    @SerializedName("color") var color: Int // 6052435
)