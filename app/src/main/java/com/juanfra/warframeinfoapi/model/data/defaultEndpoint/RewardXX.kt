package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class RewardXX(
    @SerializedName("items")
    val items: List<String>,
    @SerializedName("countedItems")
    val countedItems: List<Any>,
    @SerializedName("credits")
    val credits: Int, // 25000
    @SerializedName("asString")
    val asString: String, // Nora Night Bobble Head + Cherry Tree Glyph + 25000cr
    @SerializedName("itemString")
    val itemString: String, // Nora Night Bobble Head + Cherry Tree Glyph
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("color")
    val color: Int // 5198940
)