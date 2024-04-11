package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Defender(
    @SerializedName("reward") var reward: RewardXXXX,
    @SerializedName("faction") var faction: String, // Corpus
    @SerializedName("factionKey") var factionKey: String // Corpus
)