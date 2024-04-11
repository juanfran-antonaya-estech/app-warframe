package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class VallisCycle(
    @SerializedName("id")
    val id: String, // vallisCycle1712817180000
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T06:53:48.000Z
    @SerializedName("isWarm")
    val isWarm: Boolean, // false
    @SerializedName("state")
    val state: String, // cold
    @SerializedName("activation")
    val activation: String, // 2024-04-11T06:33:00.000Z
    @SerializedName("timeLeft")
    val timeLeft: String, // 9m 47s
    @SerializedName("shortString")
    val shortString: String // 9m to Warm
)