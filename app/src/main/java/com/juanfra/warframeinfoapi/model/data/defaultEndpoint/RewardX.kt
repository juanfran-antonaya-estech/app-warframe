package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class RewardX(
    @SerializedName("items")
    val items: List<String>,
    @SerializedName("countedItems")
    val countedItems: List<Any>,
    @SerializedName("credits")
    val credits: Int, // 0
    @SerializedName("asString")
    val asString: String, // Buried Debts Emblem
    @SerializedName("itemString")
    val itemString: String, // Buried Debts Emblem
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("color")
    val color: Int // 5198940
)