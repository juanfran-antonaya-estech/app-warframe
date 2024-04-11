package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class RewardX(
    @SerializedName("items") var items: List<String>,
    @SerializedName("countedItems") var countedItems: List<Any>,
    @SerializedName("credits") var credits: Int, // 0
    @SerializedName("asString") var asString: String, // Buried Debts Emblem
    @SerializedName("itemString") var itemString: String, // Buried Debts Emblem
    @SerializedName("thumbnail") var thumbnail: String,
    @SerializedName("color") var color: Int // 5198940
)