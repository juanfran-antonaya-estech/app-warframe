package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Inventory(
    @SerializedName("uniqueName")
    val uniqueName: String, // /Lotus/Types/StoreItems/Packages/MegaPrimeVault/MPVTitaniaPrimeSinglePack
    @SerializedName("item")
    val item: String, // M P V Titania Prime Single Pack
    @SerializedName("ducats")
    val ducats: Int?, // 6
    @SerializedName("credits")
    val credits: Int? // 1
)