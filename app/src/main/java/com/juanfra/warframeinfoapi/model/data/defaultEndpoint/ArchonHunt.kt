package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class ArchonHunt(
    @SerializedName("id") var id: String, // 66132ffdffefe34e8819cd21
    @SerializedName("activation") var activation: String, // 2024-04-08T00:00:00.000Z
    @SerializedName("startString") var startString: String, // -3d 7h 36m 10s
    @SerializedName("expiry") var expiry: String, // 2024-04-15T00:00:00.000Z
    @SerializedName("active") var active: Boolean, // true
    @SerializedName("rewardPool") var rewardPool: String, // Archon Sortie Rewards
    @SerializedName("variants") var variants: List<Any>,
    @SerializedName("missions") var missions: List<MissionXX>,
    @SerializedName("boss") var boss: String, // Archon Amar
    @SerializedName("faction") var faction: String, // Narmer
    @SerializedName("factionKey") var factionKey: String, // Narmer
    @SerializedName("expired") var expired: Boolean, // false
    @SerializedName("eta") var eta: String // 3d 16h 23m 49s
)