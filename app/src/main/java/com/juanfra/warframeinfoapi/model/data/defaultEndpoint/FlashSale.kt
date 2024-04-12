package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class FlashSale(
    @SerializedName("item") var item: String, // Chrysalith Pack
    @SerializedName("expiry") var expiry: String, // 2025-01-01T17:00:00.000Z
    @SerializedName("activation") var activation: String, // 2022-08-22T13:00:00.000Z
    @SerializedName("discount") var discount: Int, // 0
    @SerializedName("regularOverride") var regularOverride: Int?, // 0
    @SerializedName("premiumOverride") var premiumOverride: Int, // 1
    @SerializedName("isShownInMarket") var isShownInMarket: Boolean, // true
    @SerializedName("id") var id: String, // AOTZSupporterPackB1735750800000
    @SerializedName("expired") var expired: Boolean, // false
    @SerializedName("eta") var eta: String // 265d 9h 23m 49s
)