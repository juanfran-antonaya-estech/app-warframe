package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Evergreen(
    @SerializedName("name") var name: String, // Veiled Riven Cipher
    @SerializedName("cost") var cost: Int // 20
)