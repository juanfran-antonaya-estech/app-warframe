package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Attacker(
    @SerializedName("reward") var reward: RewardXXX?,
    @SerializedName("faction") var faction: String, // Grineer
    @SerializedName("factionKey") var factionKey: String // Grineer
)