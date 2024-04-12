package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class MissionXX(
    @SerializedName("node") var node: String, // Ares (Marte)
    @SerializedName("nodeKey") var nodeKey: String, // Ares (Mars)
    @SerializedName("type") var type: String, // Exterminio
    @SerializedName("typeKey") var typeKey: String, // Extermination
    @SerializedName("nightmare") var nightmare: Boolean, // false
    @SerializedName("archwingRequired") var archwingRequired: Boolean, // false
    @SerializedName("isSharkwing") var isSharkwing: Boolean, // false
    @SerializedName("advancedSpawners") var advancedSpawners: List<Any>,
    @SerializedName("requiredItems") var requiredItems: List<Any>,
    @SerializedName("levelAuras") var levelAuras: List<Any>
)