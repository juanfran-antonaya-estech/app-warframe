package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Rotation(
    @SerializedName("name")
    val name: String, // Umbra Forma Blueprint
    @SerializedName("cost")
    val cost: Int // 150
)