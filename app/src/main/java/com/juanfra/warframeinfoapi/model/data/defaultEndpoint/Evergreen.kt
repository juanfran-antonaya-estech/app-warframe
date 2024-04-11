package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Evergreen(
    @SerializedName("name")
    val name: String, // Veiled Riven Cipher
    @SerializedName("cost")
    val cost: Int // 20
)