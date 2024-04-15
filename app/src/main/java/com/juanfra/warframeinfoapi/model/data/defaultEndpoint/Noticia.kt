package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Noticia(
    @SerializedName("id") var id: String, // 62d31b87106360aa5703954d
    @SerializedName("message") var message: String, // Join the official Warframe Discord server
    @SerializedName("link") var link: String, // https://discord.com/invite/playwarframe
    @SerializedName("imageLink") var imageLink: String, // https://cdn.warframestat.us/genesis/img/news-placeholder.png
    @SerializedName("priority") var priority: Boolean, // false
    @SerializedName("date") var date: String, // 2022-07-16T20:10:00.000Z
    @SerializedName("eta") var eta: String, // 634d 11h 26m 10s ago
    @SerializedName("update") var update: Boolean, // false
    @SerializedName("primeAccess") var primeAccess: Boolean, // false
    @SerializedName("stream") var stream: Boolean, // false
    @SerializedName("translations") var translations: Translations,
    @SerializedName("asString") var asString: String, // [634d 11h 26m 10s ago] [Join the official Warframe Discord server](https://discord.com/invite/playwarframe)
    @SerializedName("startDate") var startDate: String?, // 2024-03-21T23:00:00.000Z
    @SerializedName("endDate") var endDate: String? // 2024-04-15T14:59:00.000Z
)