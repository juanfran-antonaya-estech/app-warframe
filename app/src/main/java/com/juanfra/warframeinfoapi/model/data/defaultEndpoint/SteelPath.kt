package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class SteelPath(
    @SerializedName("currentReward") var currentReward: CurrentReward,
    @SerializedName("activation") var activation: String, // 2024-04-08T00:00:00.000Z
    @SerializedName("expiry") var expiry: String, // 2024-04-14T23:59:59.000Z
    @SerializedName("remaining") var remaining: String, // 3d 16h 23m 48s
    @SerializedName("rotation") var rotation: List<Rotation>,
    @SerializedName("evergreens") var evergreens: List<Evergreen>,
    @SerializedName("incursions") var incursions: Incursions
)