package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Variant(
    @SerializedName("missionType")
    val missionType: String, // Rescue
    @SerializedName("missionTypeKey")
    val missionTypeKey: String, // Rescue
    @SerializedName("modifier")
    val modifier: String, // Weapon Restriction: Sniper Only
    @SerializedName("modifierDescription")
    val modifierDescription: String, // Only snipers may be used in this mission, any other weapon type is not allowed, and will be removed automatically if equipped.
    @SerializedName("node")
    val node: String, // Umbriel (Uranus)
    @SerializedName("nodeKey")
    val nodeKey: String // Umbriel (Uranus)
)