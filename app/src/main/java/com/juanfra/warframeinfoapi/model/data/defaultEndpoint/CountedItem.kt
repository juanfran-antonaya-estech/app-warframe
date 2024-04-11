package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class CountedItem(
    @SerializedName("count")
    val count: Int, // 1
    @SerializedName("type")
    val type: String, // Sheev Heatsink
    @SerializedName("key")
    val key: String // Sheev Heatsink
)