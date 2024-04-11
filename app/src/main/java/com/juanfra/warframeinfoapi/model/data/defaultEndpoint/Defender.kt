package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Defender(
    @SerializedName("reward")
    val reward: RewardXXXX,
    @SerializedName("faction")
    val faction: String, // Corpus
    @SerializedName("factionKey")
    val factionKey: String // Corpus
)