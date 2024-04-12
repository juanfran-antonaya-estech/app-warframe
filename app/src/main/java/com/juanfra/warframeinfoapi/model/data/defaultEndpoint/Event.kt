package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("id") var id: String, // 5c7cb0d00000000000000000
    @SerializedName("activation") var activation: String, // 2024-04-08T16:00:00.000Z
    @SerializedName("startString") var startString: String, // -2d 15h 36m 10s
    @SerializedName("expiry") var expiry: String, // 2024-04-22T16:00:00.000Z
    @SerializedName("active") var active: Boolean, // true
    @SerializedName("maximumScore") var maximumScore: Int, // 100
    @SerializedName("currentScore") var currentScore: Int, // 12
    @SerializedName("smallInterval") var smallInterval: Any?, // null
    @SerializedName("largeInterval") var largeInterval: Any?, // null
    @SerializedName("description") var description: String, // Thermia Fractures
    @SerializedName("tooltip") var tooltip: String?, // Seal fractures across the Orb Vallis
    @SerializedName("node") var node: String, // Valles del Orbe (Venus)
    @SerializedName("concurrentNodes") var concurrentNodes: List<Any>,
    @SerializedName("scoreLocTag") var scoreLocTag: String?, // Heat Fissures Event Score
    @SerializedName("rewards") var rewards: List<Reward>,
    @SerializedName("expired") var expired: Boolean, // false
    @SerializedName("health") var health: Int?, // 12
    @SerializedName("interimSteps") var interimSteps: List<InterimStep>,
    @SerializedName("progressSteps") var progressSteps: List<Any>,
    @SerializedName("isPersonal") var isPersonal: Boolean, // true
    @SerializedName("isCommunity") var isCommunity: Boolean?, // true
    @SerializedName("regionDrops") var regionDrops: List<Any>,
    @SerializedName("archwingDrops") var archwingDrops: List<Any>,
    @SerializedName("asString") var asString: String, // Thermia FracturesHeat Fissures Event Score : 100Rewards:Opticor VandalBattle on Valles del Orbe (Venus)12% Remaining
    @SerializedName("metadata") var metadata: Metadata?,
    @SerializedName("completionBonuses") var completionBonuses: List<Any>,
    @SerializedName("scoreVar") var scoreVar: String?, // FissuresClosed
    @SerializedName("altExpiry") var altExpiry: String, // 1970-01-01T00:00:00.000Z
    @SerializedName("altActivation") var altActivation: String, // 1970-01-01T00:00:00.000Z
    @SerializedName("nextAlt") var nextAlt: NextAlt
)