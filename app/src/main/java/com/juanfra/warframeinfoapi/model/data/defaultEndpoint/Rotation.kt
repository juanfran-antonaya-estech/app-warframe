package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Rotation(
    @SerializedName("name") var name: String, // Umbra Forma Blueprint
    @SerializedName("cost") var cost: Int // 150
)