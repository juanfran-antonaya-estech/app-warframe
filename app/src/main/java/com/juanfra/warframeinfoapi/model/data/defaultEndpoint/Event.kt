package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("id")
    val id: String, // 5c7cb0d00000000000000000
    @SerializedName("activation")
    val activation: String, // 2024-04-08T16:00:00.000Z
    @SerializedName("startString")
    val startString: String, // -2d 14h 44m 0s
    @SerializedName("expiry")
    val expiry: String, // 2024-04-22T16:00:00.000Z
    @SerializedName("active")
    val active: Boolean, // true
    @SerializedName("maximumScore")
    val maximumScore: Int, // 100
    @SerializedName("currentScore")
    val currentScore: Int, // 12
    @SerializedName("smallInterval")
    val smallInterval: Any?, // null
    @SerializedName("largeInterval")
    val largeInterval: Any?, // null
    @SerializedName("description")
    val description: String, // Thermia Fractures
    @SerializedName("tooltip")
    val tooltip: String?, // Seal fractures across the Orb Vallis
    @SerializedName("node")
    val node: String, // Orb Vallis (Venus)
    @SerializedName("concurrentNodes")
    val concurrentNodes: List<Any>,
    @SerializedName("scoreLocTag")
    val scoreLocTag: String?, // Heat Fissures Event Score
    @SerializedName("rewards")
    val rewards: List<Reward>,
    @SerializedName("expired")
    val expired: Boolean, // false
    @SerializedName("health")
    val health: Int?, // 12
    @SerializedName("interimSteps")
    val interimSteps: List<InterimStep>,
    @SerializedName("progressSteps")
    val progressSteps: List<Any>,
    @SerializedName("isPersonal")
    val isPersonal: Boolean, // true
    @SerializedName("isCommunity")
    val isCommunity: Boolean?, // true
    @SerializedName("regionDrops")
    val regionDrops: List<Any>,
    @SerializedName("archwingDrops")
    val archwingDrops: List<Any>,
    @SerializedName("asString")
    val asString: String, // Thermia FracturesHeat Fissures Event Score : 100Rewards:Opticor VandalBattle on Orb Vallis (Venus)12% Remaining
    @SerializedName("metadata")
    val metadata: Metadata?,
    @SerializedName("completionBonuses")
    val completionBonuses: List<Any>,
    @SerializedName("scoreVar")
    val scoreVar: String?, // FissuresClosed
    @SerializedName("altExpiry")
    val altExpiry: String, // 1970-01-01T00:00:00.000Z
    @SerializedName("altActivation")
    val altActivation: String, // 1970-01-01T00:00:00.000Z
    @SerializedName("nextAlt")
    val nextAlt: NextAlt
)