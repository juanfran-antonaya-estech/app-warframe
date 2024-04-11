package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Arbitration(
    @SerializedName("activation")
    val activation: String, // 2024-04-11T06:05:00.000Z
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T07:04:00.000Z
    @SerializedName("enemy")
    val enemy: String, // Infested
    @SerializedName("type")
    val type: String, // Survival
    @SerializedName("archwing")
    val archwing: Boolean, // false
    @SerializedName("sharkwing")
    val sharkwing: Boolean, // false
    @SerializedName("node")
    val node: String, // Apollodorus (Mercury)
    @SerializedName("nodeKey")
    val nodeKey: String, // Apollodorus (Mercury)
    @SerializedName("typeKey")
    val typeKey: String, // Survival
    @SerializedName("id")
    val id: String, // 5e3da1e4fede6a1b065f81a2ce47abb4225823775eecde10deeed34f8cfe07e8
    @SerializedName("expired")
    val expired: Boolean // true
)