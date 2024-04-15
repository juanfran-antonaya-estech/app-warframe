package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Alerta(
    @SerializedName("id") var id: String, // 660dbfcfd33f1ab8230df48c
    @SerializedName("activation") var activation: String, // 2024-04-08T15:00:00.000Z
    @SerializedName("startString") var startString: String, // -2d 16h 36m 10s
    @SerializedName("expiry") var expiry: String, // 2024-04-15T15:00:00.000Z
    @SerializedName("active") var active: Boolean, // true
    @SerializedName("mission") var mission: Mission,
    @SerializedName("eta") var eta: String, // 4d 7h 23m 49s
    @SerializedName("rewardTypes") var rewardTypes: List<String>,
    @SerializedName("tag") var tag: String? // SolarEclipse
)