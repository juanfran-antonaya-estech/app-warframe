package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Job(
    @SerializedName("id") var id: String, // ReclamationBountyCap1712829533076
    @SerializedName("rewardPool") var rewardPool: List<String>,
    @SerializedName("type") var type: String, // Capture the Grineer Agent
    @SerializedName("enemyLevels") var enemyLevels: List<Int>,
    @SerializedName("standingStages") var standingStages: List<Int>,
    @SerializedName("minMR") var minMR: Int, // 0
    @SerializedName("expiry") var expiry: String, // 2024-04-11T09:58:53.076Z
    @SerializedName("timeBound") var timeBound: String?, // day
    @SerializedName("isVault") var isVault: Boolean?, // true
    @SerializedName("locationTag") var locationTag: String?, // ChamberB
    @SerializedName("timeBoound") var timeBoound: String? // night
)