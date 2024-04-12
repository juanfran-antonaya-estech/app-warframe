package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class ConclaveChallenge(
    @SerializedName("id") var id: String, // 661068a9d843605d047732d5
    @SerializedName("expiry") var expiry: String, // 2024-04-12T21:10:01.323Z
    @SerializedName("activation") var activation: String, // 2024-04-05T21:10:01.323Z
    @SerializedName("amount") var amount: Int, // 6
    @SerializedName("mode") var mode: String, // Cualquier modo
    @SerializedName("category") var category: String, // week
    @SerializedName("eta") var eta: String, // 1d 13h 33m 51s
    @SerializedName("expired") var expired: Boolean, // false
    @SerializedName("daily") var daily: Boolean, // false
    @SerializedName("rootChallenge") var rootChallenge: Boolean, // false
    @SerializedName("endString") var endString: String, // 1d 13h 33m 51s
    @SerializedName("description") var description: String, // Win 6 matches of any Game Type
    @SerializedName("title") var title: String, // Match Won
    @SerializedName("standing") var standing: Int, // 0
    @SerializedName("asString") var asString: String // Win 6 matches of any Game Type on Cualquier modo 6 times in a week
)