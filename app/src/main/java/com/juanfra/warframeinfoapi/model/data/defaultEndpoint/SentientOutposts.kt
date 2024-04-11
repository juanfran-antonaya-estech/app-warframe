package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class SentientOutposts(
    @SerializedName("mission")
    val mission: MissionX,
    @SerializedName("activation")
    val activation: String, // 2021-08-06T13:38:05.000Z
    @SerializedName("expiry")
    val expiry: String, // 2021-08-06T14:08:05.000Z
    @SerializedName("active")
    val active: Boolean, // true
    @SerializedName("id")
    val id: String // CrewBattleNode168:true
)