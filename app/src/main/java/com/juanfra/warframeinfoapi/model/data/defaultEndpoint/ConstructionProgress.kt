package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class ConstructionProgress(
    @SerializedName("id") var id: String, // 171282097011614.978212944208684
    @SerializedName("fomorianProgress") var fomorianProgress: String, // 14.98
    @SerializedName("razorbackProgress") var razorbackProgress: String, // 39.41
    @SerializedName("unknownProgress") var unknownProgress: String // 0.00
)