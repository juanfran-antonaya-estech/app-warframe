package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class MissionXX(
    @SerializedName("node")
    val node: String, // Ares (Mars)
    @SerializedName("nodeKey")
    val nodeKey: String, // Ares (Mars)
    @SerializedName("type")
    val type: String, // Extermination
    @SerializedName("typeKey")
    val typeKey: String, // Extermination
    @SerializedName("nightmare")
    val nightmare: Boolean, // false
    @SerializedName("archwingRequired")
    val archwingRequired: Boolean, // false
    @SerializedName("isSharkwing")
    val isSharkwing: Boolean, // false
    @SerializedName("advancedSpawners")
    val advancedSpawners: List<Any>,
    @SerializedName("requiredItems")
    val requiredItems: List<Any>,
    @SerializedName("levelAuras")
    val levelAuras: List<Any>
)