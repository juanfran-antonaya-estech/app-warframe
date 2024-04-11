package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class RewardXX(
    @SerializedName("items") var items: List<String>,
    @SerializedName("countedItems") var countedItems: List<Any>,
    @SerializedName("credits") var credits: Int, // 25000
    @SerializedName("asString") var asString: String, // Nora Night Bobble Head + Cherry Tree Glyph + 25000cr
    @SerializedName("itemString") var itemString: String, // Nora Night Bobble Head + Cherry Tree Glyph
    @SerializedName("thumbnail") var thumbnail: String,
    @SerializedName("color") var color: Int // 5198940
)