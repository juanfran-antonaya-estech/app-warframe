package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Sortie(
    @SerializedName("id") var id: String, // 6616b3fe47078bb5703284c7
    @SerializedName("activation") var activation: String, // 2024-04-10T16:00:00.000Z
    @SerializedName("startString") var startString: String, // -15h 36m 10s
    @SerializedName("expiry") var expiry: String, // 2024-04-11T16:00:00.000Z
    @SerializedName("active") var active: Boolean, // true
    @SerializedName("rewardPool") var rewardPool: String, // Sortie Rewards
    @SerializedName("variants") var variants: List<Variant>,
    @SerializedName("missions") var missions: List<Any>,
    @SerializedName("boss") var boss: String, // General Sargas Ruk
    @SerializedName("faction") var faction: String, // Grineer
    @SerializedName("factionKey") var factionKey: String, // Grineer
    @SerializedName("expired") var expired: Boolean, // false
    @SerializedName("eta") var eta: String // 8h 23m 49s
)