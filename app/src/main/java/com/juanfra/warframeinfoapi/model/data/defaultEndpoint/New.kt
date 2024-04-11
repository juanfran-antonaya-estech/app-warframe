package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class New(
    @SerializedName("id")
    val id: String, // 62d31b87106360aa5703954d
    @SerializedName("message")
    val message: String, // Join the official Warframe Discord server
    @SerializedName("link")
    val link: String, // https://discord.com/invite/playwarframe
    @SerializedName("imageLink")
    val imageLink: String, // https://cdn.warframestat.us/genesis/img/news-placeholder.png
    @SerializedName("priority")
    val priority: Boolean, // false
    @SerializedName("date")
    val date: String, // 2022-07-16T20:10:00.000Z
    @SerializedName("eta")
    val eta: String, // 634d 10h 34m 0s ago
    @SerializedName("update")
    val update: Boolean, // false
    @SerializedName("primeAccess")
    val primeAccess: Boolean, // false
    @SerializedName("stream")
    val stream: Boolean, // false
    @SerializedName("translations")
    val translations: Translations,
    @SerializedName("asString")
    val asString: String, // [634d 10h 34m 0s ago] [Join the official Warframe Discord server](https://discord.com/invite/playwarframe)
    @SerializedName("startDate")
    val startDate: String?, // 2024-03-21T23:00:00.000Z
    @SerializedName("endDate")
    val endDate: String? // 2024-04-15T15:00:00.000Z
)