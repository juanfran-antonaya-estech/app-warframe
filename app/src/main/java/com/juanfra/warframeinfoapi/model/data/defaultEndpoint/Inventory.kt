package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Inventory(
    @SerializedName("uniqueName") var uniqueName: String, // /Lotus/Types/StoreItems/Packages/MegaPrimeVault/MPVTitaniaPrimeSinglePack
    @SerializedName("item") var item: String, // M P V Titania Prime Single Pack
    @SerializedName("ducats") var ducats: Int?, // 6
    @SerializedName("credits") var credits: Int? // 1
)