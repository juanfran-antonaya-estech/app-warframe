package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Translations(
    @SerializedName("en") var en: String?, // Join the official Warframe Discord server
    @SerializedName("fr") var fr: String?, // Join the official Warframe Discord server
    @SerializedName("it") var `it`: String?, // Join the official Warframe Discord server
    @SerializedName("de") var de: String?, // Join the official Warframe Discord server
    @SerializedName("es") var es: String, // Join the official Warframe Discord server
    @SerializedName("pt") var pt: String?, // Join the official Warframe Discord server
    @SerializedName("ru") var ru: String?, // Присоединяйтесь к официальному Discord серверу Warframe
    @SerializedName("pl") var pl: String?, // Join the official Warframe Discord server
    @SerializedName("uk") var uk: String?, // Join the official Warframe Discord server
    @SerializedName("tr") var tr: String?, // Join the official Warframe Discord server
    @SerializedName("ja") var ja: String?, // Join the official Warframe Discord server
    @SerializedName("zh") var zh: String?, // Join the official Warframe Discord server
    @SerializedName("ko") var ko: String?, // Join the official Warframe Discord server
    @SerializedName("tc") var tc: String? // Join the official Warframe Discord server
)