package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Choice(
    @SerializedName("category")
    val category: String, // normal
    @SerializedName("categoryKey")
    val categoryKey: String, // EXC_NORMAL
    @SerializedName("choices")
    val choices: List<String>
)