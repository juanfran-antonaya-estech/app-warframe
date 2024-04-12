package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class DailyDeal(
    @SerializedName("item") var item: String, // Heat Dagger
    @SerializedName("uniqueName") var uniqueName: String, // /Lotus/StoreItems/Weapons/Tenno/Melee/Dagger/Dagger
    @SerializedName("expiry") var expiry: String, // 2024-04-12T07:00:00.000Z
    @SerializedName("activation") var activation: String, // 2024-04-11T05:00:00.000Z
    @SerializedName("originalPrice") var originalPrice: Int, // 75
    @SerializedName("salePrice") var salePrice: Int, // 52
    @SerializedName("total") var total: Int, // 350
    @SerializedName("sold") var sold: Int, // 5
    @SerializedName("id") var id: String, // Dagger1712905200000
    @SerializedName("eta") var eta: String, // 23h 23m 49s
    @SerializedName("discount") var discount: Int // 30
)