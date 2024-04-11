package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Mission(
    @SerializedName("description")
    val description: String?, // Solar Eclipse Mode
    @SerializedName("node")
    val node: String, // E Prime (Earth)
    @SerializedName("nodeKey")
    val nodeKey: String, // E Prime (Earth)
    @SerializedName("type")
    val type: String, // Defense
    @SerializedName("typeKey")
    val typeKey: String, // Defense
    @SerializedName("faction")
    val faction: String, // Grineer
    @SerializedName("factionKey")
    val factionKey: String, // Grineer
    @SerializedName("reward")
    val reward: RewardXX,
    @SerializedName("minEnemyLevel")
    val minEnemyLevel: Int, // 25
    @SerializedName("maxEnemyLevel")
    val maxEnemyLevel: Int, // 35
    @SerializedName("maxWaveNum")
    val maxWaveNum: Int, // 10
    @SerializedName("nightmare")
    val nightmare: Boolean, // false
    @SerializedName("archwingRequired")
    val archwingRequired: Boolean, // false
    @SerializedName("isSharkwing")
    val isSharkwing: Boolean, // false
    @SerializedName("levelOverride")
    val levelOverride: String, // Grineer Forest Defense
    @SerializedName("enemySpec")
    val enemySpec: String, // Grineer Defense Forest
    @SerializedName("advancedSpawners")
    val advancedSpawners: List<Any>,
    @SerializedName("requiredItems")
    val requiredItems: List<Any>,
    @SerializedName("levelAuras")
    val levelAuras: List<Any>
)