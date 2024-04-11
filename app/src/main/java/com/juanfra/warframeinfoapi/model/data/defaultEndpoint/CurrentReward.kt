package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class CurrentReward(
    @SerializedName("name")
    val name: String, // 50,000 Kuva
    @SerializedName("cost")
    val cost: Int // 55
)