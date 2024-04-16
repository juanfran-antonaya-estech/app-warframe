package com.juanfra.warframeinfoapi.model.data.defaultEndpoint


import com.google.gson.annotations.SerializedName

data class DefaultEndpoint(
    @SerializedName("timestamp") var timestamp: String, // 2024-04-11T07:34:23.000Z
    @SerializedName("news") var news: List<Noticia>,
    @SerializedName("events") var events: List<Evento>,
    @SerializedName("alerts") var alerts: List<Alerta>,
    @SerializedName("sortie") var sortie: Sortie,
    @SerializedName("syndicateMissions") var syndicateMissions: List<SyndicateMission>,
    @SerializedName("fissures") var fissures: List<Fissure>,
    @SerializedName("globalUpgrades") var globalUpgrades: List<Any>,
    @SerializedName("flashSales") var flashSales: List<FlashSale>,
    @SerializedName("invasions") var invasions: List<Invasion>,
    @SerializedName("darkSectors") var darkSectors: List<Any>,
    @SerializedName("voidTraders") var voidTraders: List<VoidTrader>,
    @SerializedName("voidTrader") var voidTrader: VoidTrader,
    @SerializedName("dailyDeals") var dailyDeals: List<DailyDeal>,
    @SerializedName("simaris") var simaris: Simaris,
    @SerializedName("conclaveChallenges") var conclaveChallenges: List<ConclaveChallenge>,
    @SerializedName("persistentEnemies") var persistentEnemies: List<Any>,
    @SerializedName("earthCycle") var earthCycle: EarthCycle,
    @SerializedName("cetusCycle") var cetusCycle: CetusCycle,
    @SerializedName("cambionCycle") var cambionCycle: CambionCycle,
    @SerializedName("zarimanCycle") var zarimanCycle: ZarimanCycle,
    @SerializedName("weeklyChallenges") var weeklyChallenges: List<Any>,
    @SerializedName("constructionProgress") var constructionProgress: ConstructionProgress,
    @SerializedName("vallisCycle") var vallisCycle: VallisCycle,
    @SerializedName("nightwave") var nightwave: Nightwave,
    @SerializedName("kuva") var kuva: List<Any>,
    @SerializedName("arbitration") var arbitration: Arbitration,
    @SerializedName("sentientOutposts") var sentientOutposts: SentientOutposts,
    @SerializedName("steelPath") var steelPath: SteelPath,
    @SerializedName("vaultTrader") var vaultTrader: VaultTrader,
    @SerializedName("archonHunt") var archonHunt: ArchonHunt,
    @SerializedName("duviriCycle") var duviriCycle: DuviriCycle
)