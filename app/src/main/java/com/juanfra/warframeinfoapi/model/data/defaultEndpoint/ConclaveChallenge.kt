package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class ConclaveChallenge(
    @SerializedName("id")
    val id: String, // 661068a9d843605d047732d5
    @SerializedName("expiry")
    val expiry: String, // 2024-04-12T21:10:01.323Z
    @SerializedName("activation")
    val activation: String, // 2024-04-05T21:10:01.323Z
    @SerializedName("amount")
    val amount: Int, // 6
    @SerializedName("mode")
    val mode: String, // Any Mode
    @SerializedName("category")
    val category: String, // week
    @SerializedName("eta")
    val eta: String, // 1d 14h 26m 0s
    @SerializedName("expired")
    val expired: Boolean, // false
    @SerializedName("daily")
    val daily: Boolean, // false
    @SerializedName("rootChallenge")
    val rootChallenge: Boolean, // false
    @SerializedName("endString")
    val endString: String, // 1d 14h 26m 0s
    @SerializedName("description")
    val description: String, // Win 6 matches of any Game Type
    @SerializedName("title")
    val title: String, // Match Won
    @SerializedName("standing")
    val standing: Int, // 0
    @SerializedName("asString")
    val asString: String // Win 6 matches of any Game Type on Any Mode 6 times in a week
)