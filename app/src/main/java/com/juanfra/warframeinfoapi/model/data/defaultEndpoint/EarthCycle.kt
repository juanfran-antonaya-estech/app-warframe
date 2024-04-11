package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class EarthCycle(
    @SerializedName("id") var id: String, // earthCycle1712822400000
    @SerializedName("expiry") var expiry: String, // 2024-04-11T08:00:00.108Z
    @SerializedName("activation") var activation: String, // 2024-04-11T04:00:00.108Z
    @SerializedName("isDay") var isDay: Boolean, // false
    @SerializedName("state") var state: String, // night
    @SerializedName("timeLeft") var timeLeft: String // 23m 50s
)