package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Fissure(
    @SerializedName("id")
    val id: String, // 661772c5765ef362159dcb70
    @SerializedName("activation")
    val activation: String, // 2024-04-11T05:19:01.687Z
    @SerializedName("startString")
    val startString: String, // -1h 24m 59s
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T07:18:35.412Z
    @SerializedName("active")
    val active: Boolean, // true
    @SerializedName("node")
    val node: String, // Despina (Neptune)
    @SerializedName("missionType")
    val missionType: String, // Excavation
    @SerializedName("missionKey")
    val missionKey: String, // Excavation
    @SerializedName("enemy")
    val enemy: String, // Corpus
    @SerializedName("enemyKey")
    val enemyKey: String, // Corpus
    @SerializedName("nodeKey")
    val nodeKey: String, // Despina (Neptune)
    @SerializedName("tier")
    val tier: String, // Neo
    @SerializedName("tierNum")
    val tierNum: Int, // 3
    @SerializedName("expired")
    val expired: Boolean, // false
    @SerializedName("eta")
    val eta: String, // 34m 34s
    @SerializedName("isStorm")
    val isStorm: Boolean, // false
    @SerializedName("isHard")
    val isHard: Boolean // false
)