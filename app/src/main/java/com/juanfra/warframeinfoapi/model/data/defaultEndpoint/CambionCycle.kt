package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class CambionCycle(
    @SerializedName("id") var id: String, // cambionCycle1712826480000
    @SerializedName("activation") var activation: String, // 2024-04-11T07:28:00.000Z
    @SerializedName("expiry") var expiry: String, // 2024-04-11T09:08:00.000Z
    @SerializedName("timeLeft") var timeLeft: String, // 1h 31m 50s
    @SerializedName("state") var state: String, // fass
    @SerializedName("active") var active: String // fass
)