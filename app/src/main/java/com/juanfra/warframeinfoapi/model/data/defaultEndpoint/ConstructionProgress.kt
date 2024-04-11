package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class ConstructionProgress(
    @SerializedName("id")
    val id: String, // 171281784079214.954528401134553
    @SerializedName("fomorianProgress")
    val fomorianProgress: String, // 14.95
    @SerializedName("razorbackProgress")
    val razorbackProgress: String, // 39.39
    @SerializedName("unknownProgress")
    val unknownProgress: String // 0.00
)