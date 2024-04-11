package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class DuviriCycle(
    @SerializedName("id")
    val id: String, // duviriCyclefear1712822400000
    @SerializedName("activation")
    val activation: String, // 2024-04-11T06:00:00.000Z
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T08:00:00.000Z
    @SerializedName("state")
    val state: String, // fear
    @SerializedName("choices")
    val choices: List<Choice>
)