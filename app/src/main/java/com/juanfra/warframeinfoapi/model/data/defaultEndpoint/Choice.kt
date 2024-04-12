package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Choice(
    @SerializedName("category") var category: String, // normal
    @SerializedName("categoryKey") var categoryKey: String, // EXC_NORMAL
    @SerializedName("choices") var choices: List<String>
)