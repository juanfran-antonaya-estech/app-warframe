package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class InterimStep(
    @SerializedName("goal")
    val goal: Int, // 5
    @SerializedName("reward")
    val reward: RewardX,
    @SerializedName("message")
    val message: Message?
)