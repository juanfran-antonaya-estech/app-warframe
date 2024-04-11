package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Sortie(
    @SerializedName("id")
    val id: String, // 6616b3fe47078bb5703284c7
    @SerializedName("activation")
    val activation: String, // 2024-04-10T16:00:00.000Z
    @SerializedName("startString")
    val startString: String, // -14h 44m 0s
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T16:00:00.000Z
    @SerializedName("active")
    val active: Boolean, // true
    @SerializedName("rewardPool")
    val rewardPool: String, // Sortie Rewards
    @SerializedName("variants")
    val variants: List<Variant>,
    @SerializedName("missions")
    val missions: List<Any>,
    @SerializedName("boss")
    val boss: String, // General Sargas Ruk
    @SerializedName("faction")
    val faction: String, // Grineer
    @SerializedName("factionKey")
    val factionKey: String, // Grineer
    @SerializedName("expired")
    val expired: Boolean, // false
    @SerializedName("eta")
    val eta: String // 9h 15m 59s
)