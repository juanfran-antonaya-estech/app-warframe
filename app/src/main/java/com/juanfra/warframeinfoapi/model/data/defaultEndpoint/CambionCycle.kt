package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class CambionCycle(
    @SerializedName("id")
    val id: String, // cambionCycle1712820480000
    @SerializedName("activation")
    val activation: String, // 2024-04-11T06:38:00.000Z
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T07:28:00.000Z
    @SerializedName("timeLeft")
    val timeLeft: String, // 43m 59s
    @SerializedName("state")
    val state: String, // vome
    @SerializedName("active")
    val active: String // vome
)