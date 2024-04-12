package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class CurrentReward(
    @SerializedName("name") var name: String, // 50,000 Kuva
    @SerializedName("cost") var cost: Int // 55
)