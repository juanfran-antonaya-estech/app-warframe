package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class Mission(
    @SerializedName("description") var description: String?, // Solar Eclipse Mode
    @SerializedName("node") var node: String, // E Prime (Tierra)
    @SerializedName("nodeKey") var nodeKey: String, // E Prime (Earth)
    @SerializedName("type") var type: String, // Defensa
    @SerializedName("typeKey") var typeKey: String, // Defense
    @SerializedName("faction") var faction: String, // Grineer
    @SerializedName("factionKey") var factionKey: String, // Grineer
    @SerializedName("reward") var reward: RewardXX,
    @SerializedName("minEnemyLevel") var minEnemyLevel: Int, // 25
    @SerializedName("maxEnemyLevel") var maxEnemyLevel: Int, // 35
    @SerializedName("maxWaveNum") var maxWaveNum: Int, // 10
    @SerializedName("nightmare") var nightmare: Boolean, // false
    @SerializedName("archwingRequired") var archwingRequired: Boolean, // false
    @SerializedName("isSharkwing") var isSharkwing: Boolean, // false
    @SerializedName("levelOverride") var levelOverride: String, // Grineer Forest Defense
    @SerializedName("enemySpec") var enemySpec: String, // Grineer Defense Forest
    @SerializedName("advancedSpawners") var advancedSpawners: List<Any>,
    @SerializedName("requiredItems") var requiredItems: List<Any>,
    @SerializedName("levelAuras") var levelAuras: List<Any>
)