package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Nightwave(
    @SerializedName("id")
    val id: String, // nightwave1719187200000
    @SerializedName("activation")
    val activation: String, // 2023-11-29T19:00:00.000Z
    @SerializedName("startString")
    val startString: String, // -133d 11h 44m 0s
    @SerializedName("expiry")
    val expiry: String, // 2024-06-24T00:00:00.000Z
    @SerializedName("active")
    val active: Boolean, // true
    @SerializedName("season")
    val season: Int, // 11
    @SerializedName("tag")
    val tag: String, // Radio Legion Intermission9 Syndicate
    @SerializedName("phase")
    val phase: Int, // 0
    @SerializedName("params")
    val params: Params,
    @SerializedName("possibleChallenges")
    val possibleChallenges: List<Any>,
    @SerializedName("activeChallenges")
    val activeChallenges: List<ActiveChallenge>,
    @SerializedName("rewardTypes")
    val rewardTypes: List<String>
)