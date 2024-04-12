package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class ActiveChallenge(
    @SerializedName("id") var id: String, // 1712880000000seasondailyliquidation
    @SerializedName("activation") var activation: String, // 2024-04-09T00:00:00.000Z
    @SerializedName("startString") var startString: String, // -2d 7h 36m 10s
    @SerializedName("expiry") var expiry: String, // 2024-04-12T00:00:00.000Z
    @SerializedName("active") var active: Boolean, // true
    @SerializedName("isDaily") var isDaily: Boolean, // true
    @SerializedName("isElite") var isElite: Boolean, // false
    @SerializedName("desc") var desc: String, // Sell any item in your Inventory for Credits
    @SerializedName("title") var title: String, // Liquidation
    @SerializedName("reputation") var reputation: Int, // 1000
    @SerializedName("isPermanent") var isPermanent: Boolean // false
)