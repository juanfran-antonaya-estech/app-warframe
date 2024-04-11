package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class ZarimanCycle(
    @SerializedName("id")
    val id: String, // zarimanCycle1712820540000
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T07:29:00.000Z
    @SerializedName("activation")
    val activation: String, // 2024-04-11T04:59:00.000Z
    @SerializedName("isCorpus")
    val isCorpus: Boolean, // true
    @SerializedName("state")
    val state: String, // corpus
    @SerializedName("timeLeft")
    val timeLeft: String, // 44m 48s
    @SerializedName("shortString")
    val shortString: String // 44m to grineer
)