package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class ArchonHunt(
    @SerializedName("id")
    val id: String, // 66132ffdffefe34e8819cd21
    @SerializedName("activation")
    val activation: String, // 2024-04-08T00:00:00.000Z
    @SerializedName("startString")
    val startString: String, // -3d 6h 44m 0s
    @SerializedName("expiry")
    val expiry: String, // 2024-04-15T00:00:00.000Z
    @SerializedName("active")
    val active: Boolean, // true
    @SerializedName("rewardPool")
    val rewardPool: String, // Archon Sortie Rewards
    @SerializedName("variants")
    val variants: List<Any>,
    @SerializedName("missions")
    val missions: List<MissionXX>,
    @SerializedName("boss")
    val boss: String, // Archon Amar
    @SerializedName("faction")
    val faction: String, // Narmer
    @SerializedName("factionKey")
    val factionKey: String, // Narmer
    @SerializedName("expired")
    val expired: Boolean, // false
    @SerializedName("eta")
    val eta: String // 3d 17h 15m 59s
)