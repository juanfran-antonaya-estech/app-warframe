package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class MissionX(
    @SerializedName("node")
    val node: String, // CrewBattleNode168
    @SerializedName("faction")
    val faction: String, // CrewBattleNode168
    @SerializedName("type")
    val type: String // CrewBattleNode168
)