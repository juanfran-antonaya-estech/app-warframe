package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class MissionX(
    @SerializedName("node") var node: String, // CrewBattleNode168
    @SerializedName("faction") var faction: String, // CrewBattleNode168
    @SerializedName("type") var type: String // CrewBattleNode168
)