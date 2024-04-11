package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class DailyDeal(
    @SerializedName("item")
    val item: String, // Heat Dagger
    @SerializedName("uniqueName")
    val uniqueName: String, // /Lotus/StoreItems/Weapons/Tenno/Melee/Dagger/Dagger
    @SerializedName("expiry")
    val expiry: String, // 2024-04-12T07:00:00.000Z
    @SerializedName("activation")
    val activation: String, // 2024-04-11T05:00:00.000Z
    @SerializedName("originalPrice")
    val originalPrice: Int, // 75
    @SerializedName("salePrice")
    val salePrice: Int, // 52
    @SerializedName("total")
    val total: Int, // 350
    @SerializedName("sold")
    val sold: Int, // 3
    @SerializedName("id")
    val id: String, // Dagger1712905200000
    @SerializedName("eta")
    val eta: String, // 1d 15m 59s
    @SerializedName("discount")
    val discount: Int // 30
)