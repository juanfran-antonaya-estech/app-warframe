package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class FlashSale(
    @SerializedName("item")
    val item: String, // Chrysalith Pack
    @SerializedName("expiry")
    val expiry: String, // 2025-01-01T17:00:00.000Z
    @SerializedName("activation")
    val activation: String, // 2022-08-22T13:00:00.000Z
    @SerializedName("discount")
    val discount: Int, // 0
    @SerializedName("regularOverride")
    val regularOverride: Int?, // 0
    @SerializedName("premiumOverride")
    val premiumOverride: Int, // 1
    @SerializedName("isShownInMarket")
    val isShownInMarket: Boolean, // true
    @SerializedName("id")
    val id: String, // AOTZSupporterPackB1735750800000
    @SerializedName("expired")
    val expired: Boolean, // false
    @SerializedName("eta")
    val eta: String // 265d 10h 15m 59s
)