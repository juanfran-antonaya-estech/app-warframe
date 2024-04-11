package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Invasion(
    @SerializedName("id") var id: String, // 66141f0dc6744e7b2c0e04ce
    @SerializedName("activation") var activation: String, // 2024-04-08T17:01:38.281Z
    @SerializedName("startString") var startString: String, // -2d 14h 34m 31s
    @SerializedName("node") var node: String, // Monolito (Fobos)
    @SerializedName("nodeKey") var nodeKey: String, // Monolith (Phobos)
    @SerializedName("desc") var desc: String, // Ofensiva grineer
    @SerializedName("attackingFaction") var attackingFaction: String, // Grineer
    @SerializedName("attacker") var attacker: Attacker,
    @SerializedName("defender") var defender: Defender,
    @SerializedName("vsInfestation") var vsInfestation: Boolean, // false
    @SerializedName("count") var count: Int, // 9883
    @SerializedName("requiredRuns") var requiredRuns: Int, // 46000
    @SerializedName("completion") var completion: Double, // 60.74239130434782
    @SerializedName("completed") var completed: Boolean, // false
    @SerializedName("eta") var eta: String, // 9d 12h 40m 46s
    @SerializedName("rewardTypes") var rewardTypes: List<String>
)