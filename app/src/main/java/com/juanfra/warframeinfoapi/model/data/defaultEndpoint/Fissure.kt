package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Fissure(
    @SerializedName("id") var id: String, // 66177991f50c022f4f6a86ad
    @SerializedName("activation") var activation: String, // 2024-04-11T05:48:01.435Z
    @SerializedName("startString") var startString: String, // -1h 48m 8s
    @SerializedName("expiry") var expiry: String, // 2024-04-11T07:35:06.653Z
    @SerializedName("active") var active: Boolean, // false
    @SerializedName("node") var node: String, // Nimus (Eris)
    @SerializedName("missionType") var missionType: String, // Supervivencia
    @SerializedName("missionKey") var missionKey: String, // Survival
    @SerializedName("enemy") var enemy: String, // Infestados
    @SerializedName("enemyKey") var enemyKey: String, // Infested
    @SerializedName("nodeKey") var nodeKey: String, // Nimus (Eris)
    @SerializedName("tier") var tier: String, // Axi
    @SerializedName("tierNum") var tierNum: Int, // 4
    @SerializedName("expired") var expired: Boolean, // true
    @SerializedName("eta") var eta: String, // -1m 3s
    @SerializedName("isStorm") var isStorm: Boolean, // false
    @SerializedName("isHard") var isHard: Boolean // true
)