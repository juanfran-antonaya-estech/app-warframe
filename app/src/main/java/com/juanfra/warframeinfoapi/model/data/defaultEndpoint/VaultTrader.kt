package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class VaultTrader(
    @SerializedName("id")
    val id: String, // 631f8c4ac36af423770eaa97
    @SerializedName("activation")
    val activation: String, // 2024-03-14T18:00:00.000Z
    @SerializedName("startString")
    val startString: String, // -27d 12h 44m 0s
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T18:00:00.000Z
    @SerializedName("active")
    val active: Boolean, // true
    @SerializedName("character")
    val character: String,
    @SerializedName("location")
    val location: String, // Maroo's Bazaar (Mars)
    @SerializedName("inventory")
    val inventory: List<Inventory>,
    @SerializedName("psId")
    val psId: String, // 631f8c4ac36af423770eaa9722
    @SerializedName("endString")
    val endString: String, // 11h 15m 59s
    @SerializedName("initialStart")
    val initialStart: String, // 2022-09-09T15:42:24.266Z
    @SerializedName("schedule")
    val schedule: List<Schedule>
)