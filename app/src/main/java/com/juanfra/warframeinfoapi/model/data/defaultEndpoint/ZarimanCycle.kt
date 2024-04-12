package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class ZarimanCycle(
    @SerializedName("id") var id: String, // zarimanCycle1712829540000
    @SerializedName("expiry") var expiry: String, // 2024-04-11T09:59:00.000Z
    @SerializedName("activation") var activation: String, // 2024-04-11T07:29:00.000Z
    @SerializedName("isCorpus") var isCorpus: Boolean, // false
    @SerializedName("state") var state: String, // grineer
    @SerializedName("timeLeft") var timeLeft: String, // 2h 22m 37s
    @SerializedName("shortString") var shortString: String // 2h 22m to corpus
)