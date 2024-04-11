package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class CetusCycle(
    @SerializedName("id")
    val id: String, // cetusCycle1712820480000
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T07:28:00.000Z
    @SerializedName("activation")
    val activation: String, // 2024-04-11T06:38:00.000Z
    @SerializedName("isDay")
    val isDay: Boolean, // false
    @SerializedName("state")
    val state: String, // night
    @SerializedName("timeLeft")
    val timeLeft: String, // 43m 59s
    @SerializedName("isCetus")
    val isCetus: Boolean, // true
    @SerializedName("shortString")
    val shortString: String // 43m to Day
)