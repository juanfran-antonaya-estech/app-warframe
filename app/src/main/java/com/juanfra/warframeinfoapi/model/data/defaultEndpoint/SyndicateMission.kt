package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class SyndicateMission(
    @SerializedName("id") var id: String, // 1712829533076CetusSyndicate
    @SerializedName("activation") var activation: String, // 2024-04-11T07:28:54.203Z
    @SerializedName("startString") var startString: String, // -7m 15s
    @SerializedName("expiry") var expiry: String, // 2024-04-11T09:58:53.076Z
    @SerializedName("active") var active: Boolean, // true
    @SerializedName("syndicate") var syndicate: String, // Ostronitas
    @SerializedName("syndicateKey") var syndicateKey: String, // Ostrons
    @SerializedName("nodes") var nodes: List<String>,
    @SerializedName("jobs") var jobs: List<Job>,
    @SerializedName("eta") var eta: String // 2h 22m 42s
)