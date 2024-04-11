package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class DefaultEndpoint(
    @SerializedName("timestamp")
    val timestamp: String, // 2024-04-11T06:42:20.000Z
    @SerializedName("news")
    val news: List<New>,
    @SerializedName("events")
    val events: List<Event>,
    @SerializedName("alerts")
    val alerts: List<Alert>,
    @SerializedName("sortie")
    val sortie: Sortie,
    @SerializedName("syndicateMissions")
    val syndicateMissions: List<SyndicateMission>,
    @SerializedName("fissures")
    val fissures: List<Fissure>,
    @SerializedName("globalUpgrades")
    val globalUpgrades: List<Any>,
    @SerializedName("flashSales")
    val flashSales: List<FlashSale>,
    @SerializedName("invasions")
    val invasions: List<Invasion>,
    @SerializedName("darkSectors")
    val darkSectors: List<Any>,
    @SerializedName("voidTraders")
    val voidTraders: List<VoidTrader>,
    @SerializedName("voidTrader")
    val voidTrader: VoidTrader,
    @SerializedName("dailyDeals")
    val dailyDeals: List<DailyDeal>,
    @SerializedName("simaris")
    val simaris: Simaris,
    @SerializedName("conclaveChallenges")
    val conclaveChallenges: List<ConclaveChallenge>,
    @SerializedName("persistentEnemies")
    val persistentEnemies: List<Any>,
    @SerializedName("earthCycle")
    val earthCycle: EarthCycle,
    @SerializedName("cetusCycle")
    val cetusCycle: CetusCycle,
    @SerializedName("cambionCycle")
    val cambionCycle: CambionCycle,
    @SerializedName("zarimanCycle")
    val zarimanCycle: ZarimanCycle,
    @SerializedName("weeklyChallenges")
    val weeklyChallenges: List<Any>,
    @SerializedName("constructionProgress")
    val constructionProgress: ConstructionProgress,
    @SerializedName("vallisCycle")
    val vallisCycle: VallisCycle,
    @SerializedName("nightwave")
    val nightwave: Nightwave,
    @SerializedName("kuva")
    val kuva: List<Any>,
    @SerializedName("arbitration")
    val arbitration: Arbitration,
    @SerializedName("sentientOutposts")
    val sentientOutposts: SentientOutposts,
    @SerializedName("steelPath")
    val steelPath: SteelPath,
    @SerializedName("vaultTrader")
    val vaultTrader: VaultTrader,
    @SerializedName("archonHunt")
    val archonHunt: ArchonHunt,
    @SerializedName("duviriCycle")
    val duviriCycle: DuviriCycle
)