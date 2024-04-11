package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class NextAlt(
    @SerializedName("expiry")
    val expiry: String, // 1970-01-01T00:00:00.000Z
    @SerializedName("activation")
    val activation: String // 1970-01-01T00:00:00.000Z
)