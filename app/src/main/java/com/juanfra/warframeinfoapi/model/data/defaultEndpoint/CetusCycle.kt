package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class CetusCycle(
    @SerializedName("id") var id: String, // cetusCycle1712826480000
    @SerializedName("expiry") var expiry: String, // 2024-04-11T09:08:00.000Z
    @SerializedName("activation") var activation: String, // 2024-04-11T07:28:00.000Z
    @SerializedName("isDay") var isDay: Boolean, // true
    @SerializedName("state") var state: String, // day
    @SerializedName("timeLeft") var timeLeft: String, // 1h 31m 50s
    @SerializedName("isCetus") var isCetus: Boolean, // true
    @SerializedName("shortString") var shortString: String // 1h 31m to Night
)