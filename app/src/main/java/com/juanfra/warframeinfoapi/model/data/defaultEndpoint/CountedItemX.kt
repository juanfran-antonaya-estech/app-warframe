package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class CountedItemX(
    @SerializedName("count")
    val count: Int, // 1
    @SerializedName("type")
    val type: String, // Snipetron Vandal Blueprint
    @SerializedName("key")
    val key: String // Snipetron Vandal Blueprint
)