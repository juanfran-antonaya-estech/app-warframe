package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Incursions(
    @SerializedName("id")
    val id: String, // spi:1712793600000
    @SerializedName("activation")
    val activation: String, // 2024-04-11T00:00:00.000Z
    @SerializedName("expiry")
    val expiry: String // 2024-04-11T23:59:59.000Z
)