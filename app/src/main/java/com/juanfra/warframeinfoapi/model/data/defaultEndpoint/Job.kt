package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Job(
    @SerializedName("id")
    val id: String, // AssassinateBountyCap1712820534202
    @SerializedName("rewardPool")
    val rewardPool: List<String>,
    @SerializedName("type")
    val type: String, // Capture the New Grineer Commander
    @SerializedName("enemyLevels")
    val enemyLevels: List<Int>,
    @SerializedName("standingStages")
    val standingStages: List<Int>,
    @SerializedName("minMR")
    val minMR: Int, // 0
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T07:28:54.202Z
    @SerializedName("timeBound")
    val timeBound: String?, // day
    @SerializedName("isVault")
    val isVault: Boolean?, // true
    @SerializedName("locationTag")
    val locationTag: String?, // ChamberB
    @SerializedName("timeBoound")
    val timeBoound: String? // night
)