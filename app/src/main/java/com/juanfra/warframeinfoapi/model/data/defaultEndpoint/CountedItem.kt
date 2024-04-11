package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class CountedItem(
    @SerializedName("count") var count: Int, // 1
    @SerializedName("type") var type: String, // Sheev Heatsink
    @SerializedName("key") var key: String // Sheev Heatsink
)