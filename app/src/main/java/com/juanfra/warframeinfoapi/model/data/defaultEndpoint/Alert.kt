package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Alert(
    @SerializedName("id")
    val id: String, // 660dbfcfd33f1ab8230df48c
    @SerializedName("activation")
    val activation: String, // 2024-04-08T15:00:00.000Z
    @SerializedName("startString")
    val startString: String, // -2d 15h 44m 0s
    @SerializedName("expiry")
    val expiry: String, // 2024-04-15T15:00:00.000Z
    @SerializedName("active")
    val active: Boolean, // true
    @SerializedName("mission")
    val mission: Mission,
    @SerializedName("eta")
    val eta: String, // 4d 8h 15m 59s
    @SerializedName("rewardTypes")
    val rewardTypes: List<String>,
    @SerializedName("tag")
    val tag: String? // SolarEclipse
)