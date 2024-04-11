package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class VaultTrader(
    @SerializedName("id") var id: String, // 631f8c4ac36af423770eaa97
    @SerializedName("activation") var activation: String, // 2024-03-14T18:00:00.000Z
    @SerializedName("startString") var startString: String, // -27d 13h 36m 10s
    @SerializedName("expiry") var expiry: String, // 2024-04-11T18:00:00.000Z
    @SerializedName("active") var active: Boolean, // true
    @SerializedName("character") var character: String,
    @SerializedName("location") var location: String, // Maroo's Bazaar (Mars)
    @SerializedName("inventory") var inventory: List<Inventory>,
    @SerializedName("psId") var psId: String, // 631f8c4ac36af423770eaa9722
    @SerializedName("endString") var endString: String, // 10h 23m 49s
    @SerializedName("initialStart") var initialStart: String, // 2022-09-09T15:42:24.266Z
    @SerializedName("schedule") var schedule: List<Schedule>
)