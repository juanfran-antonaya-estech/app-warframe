package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Simaris(
    @SerializedName("target") var target: String, // Guardsman
    @SerializedName("isTargetActive") var isTargetActive: Boolean, // false
    @SerializedName("asString") var asString: String // Simaris's previous objective was Guardsman
)