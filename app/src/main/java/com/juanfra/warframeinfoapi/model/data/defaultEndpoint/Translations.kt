package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Translations(
    @SerializedName("en")
    val en: String, // Join the official Warframe Discord server
    @SerializedName("fr")
    val fr: String?, // Join the official Warframe Discord server
    @SerializedName("it")
    val `it`: String?, // Join the official Warframe Discord server
    @SerializedName("de")
    val de: String?, // Join the official Warframe Discord server
    @SerializedName("es")
    val es: String?, // Join the official Warframe Discord server
    @SerializedName("pt")
    val pt: String?, // Join the official Warframe Discord server
    @SerializedName("ru")
    val ru: String?, // Присоединяйтесь к официальному Discord серверу Warframe
    @SerializedName("pl")
    val pl: String?, // Join the official Warframe Discord server
    @SerializedName("uk")
    val uk: String?, // Join the official Warframe Discord server
    @SerializedName("tr")
    val tr: String?, // Join the official Warframe Discord server
    @SerializedName("ja")
    val ja: String?, // Join the official Warframe Discord server
    @SerializedName("zh")
    val zh: String?, // Join the official Warframe Discord server
    @SerializedName("ko")
    val ko: String?, // Join the official Warframe Discord server
    @SerializedName("tc")
    val tc: String? // Join the official Warframe Discord server
)