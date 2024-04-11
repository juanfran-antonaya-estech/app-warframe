package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class VoidTrader(
    @SerializedName("id") var id: String, // 5d1e07a0a38e4a4fdd7cefca
    @SerializedName("activation") var activation: String, // 2024-04-19T13:00:00.000Z
    @SerializedName("startString") var startString: String, // 8d 5h 23m 49s
    @SerializedName("expiry") var expiry: String, // 2024-04-21T13:00:00.000Z
    @SerializedName("active") var active: Boolean, // false
    @SerializedName("character") var character: String, // Baro Ki'Teer
    @SerializedName("location") var location: String, // Repetidor Larunda (Mercurio)
    @SerializedName("inventory") var inventory: List<Any>,
    @SerializedName("psId") var psId: String, // 5d1e07a0a38e4a4fdd7cefca0
    @SerializedName("endString") var endString: String, // 10d 5h 23m 49s
    @SerializedName("initialStart") var initialStart: String, // 1970-01-01T00:00:00.000Z
    @SerializedName("schedule") var schedule: List<Any>
)