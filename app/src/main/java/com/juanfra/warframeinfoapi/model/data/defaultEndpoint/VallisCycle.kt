package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class VallisCycle(
    @SerializedName("id") var id: String, // vallisCycle1712820420000
    @SerializedName("expiry") var expiry: String, // 2024-04-11T07:47:08.000Z
    @SerializedName("isWarm") var isWarm: Boolean, // false
    @SerializedName("state") var state: String, // cold
    @SerializedName("activation") var activation: String, // 2024-04-11T07:27:00.000Z
    @SerializedName("timeLeft") var timeLeft: String, // 10m 57s
    @SerializedName("shortString") var shortString: String // 10m to Warm
)