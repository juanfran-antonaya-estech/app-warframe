package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Attacker(
    @SerializedName("reward")
    val reward: RewardXXX?,
    @SerializedName("faction")
    val faction: String, // Grineer
    @SerializedName("factionKey")
    val factionKey: String // Grineer
)