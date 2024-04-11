package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Invasion(
    @SerializedName("id")
    val id: String, // 66141f0dc6744e7b2c0e04ce
    @SerializedName("activation")
    val activation: String, // 2024-04-08T17:01:38.281Z
    @SerializedName("startString")
    val startString: String, // -2d 13h 42m 22s
    @SerializedName("node")
    val node: String, // Monolith (Phobos)
    @SerializedName("nodeKey")
    val nodeKey: String, // Monolith (Phobos)
    @SerializedName("desc")
    val desc: String, // Grineer Offensive
    @SerializedName("attackingFaction")
    val attackingFaction: String, // Grineer
    @SerializedName("attacker")
    val attacker: Attacker,
    @SerializedName("defender")
    val defender: Defender,
    @SerializedName("vsInfestation")
    val vsInfestation: Boolean, // false
    @SerializedName("count")
    val count: Int, // 9348
    @SerializedName("requiredRuns")
    val requiredRuns: Int, // 46000
    @SerializedName("completion")
    val completion: Double, // 60.16086956521739
    @SerializedName("completed")
    val completed: Boolean, // false
    @SerializedName("eta")
    val eta: String, // 10d 1h 56m 24s
    @SerializedName("rewardTypes")
    val rewardTypes: List<String>
)