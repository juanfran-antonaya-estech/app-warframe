package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Variant(
    @SerializedName("missionType") var missionType: String, // Rescate
    @SerializedName("missionTypeKey") var missionTypeKey: String, // Rescue
    @SerializedName("modifier") var modifier: String, // Restricción de arma: solo francotirador
    @SerializedName("modifierDescription") var modifierDescription: String, // Only snipers may be used in this mission, any other weapon type is not allowed, and will be removed automatically if equipped.
    @SerializedName("node") var node: String, // Umbriel (Urano)
    @SerializedName("nodeKey") var nodeKey: String // Umbriel (Uranus)
)