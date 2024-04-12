package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Arbitration(
    @SerializedName("activation") var activation: String, // 2024-04-11T07:05:00.000Z
    @SerializedName("expiry") var expiry: String, // 2024-04-11T08:04:00.000Z
    @SerializedName("enemy") var enemy: String, // Infested
    @SerializedName("type") var type: String, // Interception
    @SerializedName("archwing") var archwing: Boolean, // false
    @SerializedName("sharkwing") var sharkwing: Boolean, // false
    @SerializedName("node") var node: String, // Xini (Eris)
    @SerializedName("nodeKey") var nodeKey: String, // Xini (Eris)
    @SerializedName("typeKey") var typeKey: String, // Interception
    @SerializedName("id") var id: String, // 7be213055412c9071bcb791238f022a1102ba6b4dab7a954f17f0368a79884a7
    @SerializedName("expired") var expired: Boolean // true
)