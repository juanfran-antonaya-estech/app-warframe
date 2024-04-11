package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Nightwave(
    @SerializedName("id") var id: String, // nightwave1719187200000
    @SerializedName("activation") var activation: String, // 2023-11-29T19:00:00.000Z
    @SerializedName("startString") var startString: String, // -133d 12h 36m 10s
    @SerializedName("expiry") var expiry: String, // 2024-06-24T00:00:00.000Z
    @SerializedName("active") var active: Boolean, // true
    @SerializedName("season") var season: Int, // 11
    @SerializedName("tag") var tag: String, // Radio Legion Intermission9 Syndicate
    @SerializedName("phase") var phase: Int, // 0
    @SerializedName("params") var params: Params,
    @SerializedName("possibleChallenges") var possibleChallenges: List<Any>,
    @SerializedName("activeChallenges") var activeChallenges: List<ActiveChallenge>,
    @SerializedName("rewardTypes") var rewardTypes: List<String>
)