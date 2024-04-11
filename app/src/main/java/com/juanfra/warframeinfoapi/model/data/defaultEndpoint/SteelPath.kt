package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class SteelPath(
    @SerializedName("currentReward")
    val currentReward: CurrentReward,
    @SerializedName("activation")
    val activation: String, // 2024-04-08T00:00:00.000Z
    @SerializedName("expiry")
    val expiry: String, // 2024-04-14T23:59:59.000Z
    @SerializedName("remaining")
    val remaining: String, // 3d 17h 15m 58s
    @SerializedName("rotation")
    val rotation: List<Rotation>,
    @SerializedName("evergreens")
    val evergreens: List<Evergreen>,
    @SerializedName("incursions")
    val incursions: Incursions
)