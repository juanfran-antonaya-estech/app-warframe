package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class DuviriCycle(
    @SerializedName("id") var id: String, // duviriCyclefear1712822400000
    @SerializedName("activation") var activation: String, // 2024-04-11T06:00:00.000Z
    @SerializedName("expiry") var expiry: String, // 2024-04-11T08:00:00.000Z
    @SerializedName("state") var state: String, // fear
    @SerializedName("choices") var choices: List<Choice>
)