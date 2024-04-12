package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class CountedItemX(
    @SerializedName("count") var count: Int, // 1
    @SerializedName("type") var type: String, // Snipetron Vandal Blueprint
    @SerializedName("key") var key: String // Snipetron Vandal Blueprint
)