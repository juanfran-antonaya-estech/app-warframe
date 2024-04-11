package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Simaris(
    @SerializedName("target")
    val target: String, // Guardsman
    @SerializedName("isTargetActive")
    val isTargetActive: Boolean, // false
    @SerializedName("asString")
    val asString: String // Simaris's previous objective was Guardsman
)