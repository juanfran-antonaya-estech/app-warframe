package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Schedule(
    @SerializedName("expiry") var expiry: String, // 2022-11-03T18:00:00.000Z
    @SerializedName("item") var item: String? // M P V Equinox Wukong Prime Dual Pack
)