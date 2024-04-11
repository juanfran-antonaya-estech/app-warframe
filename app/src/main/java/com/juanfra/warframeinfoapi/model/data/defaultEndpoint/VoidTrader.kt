package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class VoidTrader(
    @SerializedName("id")
    val id: String, // 5d1e07a0a38e4a4fdd7cefca
    @SerializedName("activation")
    val activation: String, // 2024-04-19T13:00:00.000Z
    @SerializedName("startString")
    val startString: String, // 8d 6h 15m 59s
    @SerializedName("expiry")
    val expiry: String, // 2024-04-21T13:00:00.000Z
    @SerializedName("active")
    val active: Boolean, // false
    @SerializedName("character")
    val character: String, // Baro Ki'Teer
    @SerializedName("location")
    val location: String, // Larunda Relay (Mercury)
    @SerializedName("inventory")
    val inventory: List<Any>,
    @SerializedName("psId")
    val psId: String, // 5d1e07a0a38e4a4fdd7cefca0
    @SerializedName("endString")
    val endString: String, // 10d 6h 15m 59s
    @SerializedName("initialStart")
    val initialStart: String, // 1970-01-01T00:00:00.000Z
    @SerializedName("schedule")
    val schedule: List<Any>
)