package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class SyndicateMission(
    @SerializedName("id")
    val id: String, // 1712820534202CetusSyndicate
    @SerializedName("activation")
    val activation: String, // 2024-04-11T04:58:55.328Z
    @SerializedName("startString")
    val startString: String, // -1h 45m 5s
    @SerializedName("expiry")
    val expiry: String, // 2024-04-11T07:28:54.202Z
    @SerializedName("active")
    val active: Boolean, // true
    @SerializedName("syndicate")
    val syndicate: String, // Ostrons
    @SerializedName("syndicateKey")
    val syndicateKey: String, // Ostrons
    @SerializedName("nodes")
    val nodes: List<String>,
    @SerializedName("jobs")
    val jobs: List<Job>,
    @SerializedName("eta")
    val eta: String // 44m 53s
)