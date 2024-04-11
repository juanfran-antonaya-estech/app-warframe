package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class InterimStep(
    @SerializedName("goal") var goal: Int, // 5
    @SerializedName("reward") var reward: RewardX,
    @SerializedName("message") var message: Message?
)