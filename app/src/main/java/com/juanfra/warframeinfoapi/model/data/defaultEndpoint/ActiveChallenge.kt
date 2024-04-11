package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class ActiveChallenge(
    @SerializedName("id")
    val id: String, // 1712880000000seasondailyliquidation
    @SerializedName("activation")
    val activation: String, // 2024-04-09T00:00:00.000Z
    @SerializedName("startString")
    val startString: String, // -2d 6h 44m 0s
    @SerializedName("expiry")
    val expiry: String, // 2024-04-12T00:00:00.000Z
    @SerializedName("active")
    val active: Boolean, // true
    @SerializedName("isDaily")
    val isDaily: Boolean, // true
    @SerializedName("isElite")
    val isElite: Boolean, // false
    @SerializedName("desc")
    val desc: String, // Sell any item in your Inventory for Credits
    @SerializedName("title")
    val title: String, // Liquidation
    @SerializedName("reputation")
    val reputation: Int, // 1000
    @SerializedName("isPermanent")
    val isPermanent: Boolean // false
)