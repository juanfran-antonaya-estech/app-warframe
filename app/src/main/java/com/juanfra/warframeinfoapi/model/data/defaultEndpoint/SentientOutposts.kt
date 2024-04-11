package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class SentientOutposts(
    @SerializedName("mission") var mission: MissionX,
    @SerializedName("activation") var activation: String, // 2021-08-06T13:38:05.000Z
    @SerializedName("expiry") var expiry: String, // 2021-08-06T14:08:05.000Z
    @SerializedName("active") var active: Boolean, // true
    @SerializedName("id") var id: String // CrewBattleNode168:true
)