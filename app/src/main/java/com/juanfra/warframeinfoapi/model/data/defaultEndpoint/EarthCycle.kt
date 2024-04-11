package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class EarthCycle(
    @SerializedName("id")
    val id: String, // earthCycle1712822400000
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T08:00:00.791Z
    @SerializedName("activation")
    val activation: String, // 2024-04-11T04:00:00.791Z
    @SerializedName("isDay")
    val isDay: Boolean, // false
    @SerializedName("state")
    val state: String, // night
    @SerializedName("timeLeft")
    val timeLeft: String // 1h 16m 0s
)