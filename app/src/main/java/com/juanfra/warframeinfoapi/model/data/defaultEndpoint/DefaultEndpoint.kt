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
) {
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
    ) {
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
    }

    data class Event(
        @SerializedName("id")
        val id: String, // 5c7cb0d00000000000000000
        @SerializedName("activation")
        val activation: String, // 2024-04-08T16:00:00.000Z
        @SerializedName("startString")
        val startString: String, // -2d 14h 44m 0s
        @SerializedName("expiry")
        val expiry: String, // 2024-04-22T16:00:00.000Z
        @SerializedName("active")
        val active: Boolean, // true
        @SerializedName("maximumScore")
        val maximumScore: Int, // 100
        @SerializedName("currentScore")
        val currentScore: Int, // 12
        @SerializedName("smallInterval")
        val smallInterval: Any?, // null
        @SerializedName("largeInterval")
        val largeInterval: Any?, // null
        @SerializedName("description")
        val description: String, // Thermia Fractures
        @SerializedName("tooltip")
        val tooltip: String?, // Seal fractures across the Orb Vallis
        @SerializedName("node")
        val node: String, // Orb Vallis (Venus)
        @SerializedName("concurrentNodes")
        val concurrentNodes: List<Any>,
        @SerializedName("scoreLocTag")
        val scoreLocTag: String?, // Heat Fissures Event Score
        @SerializedName("rewards")
        val rewards: List<Reward>,
        @SerializedName("expired")
        val expired: Boolean, // false
        @SerializedName("health")
        val health: Int?, // 12
        @SerializedName("interimSteps")
        val interimSteps: List<InterimStep>,
        @SerializedName("progressSteps")
        val progressSteps: List<Any>,
        @SerializedName("isPersonal")
        val isPersonal: Boolean, // true
        @SerializedName("isCommunity")
        val isCommunity: Boolean?, // true
        @SerializedName("regionDrops")
        val regionDrops: List<Any>,
        @SerializedName("archwingDrops")
        val archwingDrops: List<Any>,
        @SerializedName("asString")
        val asString: String, // Thermia FracturesHeat Fissures Event Score : 100Rewards:Opticor VandalBattle on Orb Vallis (Venus)12% Remaining
        @SerializedName("metadata")
        val metadata: Metadata?,
        @SerializedName("completionBonuses")
        val completionBonuses: List<Any>,
        @SerializedName("scoreVar")
        val scoreVar: String?, // FissuresClosed
        @SerializedName("altExpiry")
        val altExpiry: String, // 1970-01-01T00:00:00.000Z
        @SerializedName("altActivation")
        val altActivation: String, // 1970-01-01T00:00:00.000Z
        @SerializedName("nextAlt")
        val nextAlt: NextAlt
    ) {
        data class Reward(
            @SerializedName("items")
            val items: List<String>,
            @SerializedName("countedItems")
            val countedItems: List<Any>,
            @SerializedName("credits")
            val credits: Int, // 0
            @SerializedName("asString")
            val asString: String, // Opticor Vandal
            @SerializedName("itemString")
            val itemString: String, // Opticor Vandal
            @SerializedName("thumbnail")
            val thumbnail: String, // https://cdn.warframestat.us/img/dera-vandal.png
            @SerializedName("color")
            val color: Int // 6052435
        )

        data class InterimStep(
            @SerializedName("goal")
            val goal: Int, // 5
            @SerializedName("reward")
            val reward: Reward,
            @SerializedName("message")
            val message: Message?
        ) {
            data class Reward(
                @SerializedName("items")
                val items: List<String>,
                @SerializedName("countedItems")
                val countedItems: List<Any>,
                @SerializedName("credits")
                val credits: Int, // 0
                @SerializedName("asString")
                val asString: String, // Buried Debts Emblem
                @SerializedName("itemString")
                val itemString: String, // Buried Debts Emblem
                @SerializedName("thumbnail")
                val thumbnail: String,
                @SerializedName("color")
                val color: Int // 5198940
            )

            class Message
        }

        class Metadata

        data class NextAlt(
            @SerializedName("expiry")
            val expiry: String, // 1970-01-01T00:00:00.000Z
            @SerializedName("activation")
            val activation: String // 1970-01-01T00:00:00.000Z
        )
    }

    data class Alert(
        @SerializedName("id")
        val id: String, // 660dbfcfd33f1ab8230df48c
        @SerializedName("activation")
        val activation: String, // 2024-04-08T15:00:00.000Z
        @SerializedName("startString")
        val startString: String, // -2d 15h 44m 0s
        @SerializedName("expiry")
        val expiry: String, // 2024-04-15T15:00:00.000Z
        @SerializedName("active")
        val active: Boolean, // true
        @SerializedName("mission")
        val mission: Mission,
        @SerializedName("eta")
        val eta: String, // 4d 8h 15m 59s
        @SerializedName("rewardTypes")
        val rewardTypes: List<String>,
        @SerializedName("tag")
        val tag: String? // SolarEclipse
    ) {
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
            val reward: Reward,
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
        ) {
            data class Reward(
                @SerializedName("items")
                val items: List<String>,
                @SerializedName("countedItems")
                val countedItems: List<Any>,
                @SerializedName("credits")
                val credits: Int, // 25000
                @SerializedName("asString")
                val asString: String, // Nora Night Bobble Head + Cherry Tree Glyph + 25000cr
                @SerializedName("itemString")
                val itemString: String, // Nora Night Bobble Head + Cherry Tree Glyph
                @SerializedName("thumbnail")
                val thumbnail: String,
                @SerializedName("color")
                val color: Int // 5198940
            )
        }
    }

    data class Sortie(
        @SerializedName("id")
        val id: String, // 6616b3fe47078bb5703284c7
        @SerializedName("activation")
        val activation: String, // 2024-04-10T16:00:00.000Z
        @SerializedName("startString")
        val startString: String, // -14h 44m 0s
        @SerializedName("expiry")
        val expiry: String, // 2024-04-11T16:00:00.000Z
        @SerializedName("active")
        val active: Boolean, // true
        @SerializedName("rewardPool")
        val rewardPool: String, // Sortie Rewards
        @SerializedName("variants")
        val variants: List<Variant>,
        @SerializedName("missions")
        val missions: List<Any>,
        @SerializedName("boss")
        val boss: String, // General Sargas Ruk
        @SerializedName("faction")
        val faction: String, // Grineer
        @SerializedName("factionKey")
        val factionKey: String, // Grineer
        @SerializedName("expired")
        val expired: Boolean, // false
        @SerializedName("eta")
        val eta: String // 9h 15m 59s
    ) {
        data class Variant(
            @SerializedName("missionType")
            val missionType: String, // Rescue
            @SerializedName("missionTypeKey")
            val missionTypeKey: String, // Rescue
            @SerializedName("modifier")
            val modifier: String, // Weapon Restriction: Sniper Only
            @SerializedName("modifierDescription")
            val modifierDescription: String, // Only snipers may be used in this mission, any other weapon type is not allowed, and will be removed automatically if equipped.
            @SerializedName("node")
            val node: String, // Umbriel (Uranus)
            @SerializedName("nodeKey")
            val nodeKey: String // Umbriel (Uranus)
        )
    }

    data class SyndicateMission(
        @SerializedName("id")
        val id: String, // 1712820534202CetusSyndicate
        @SerializedName("activation")
        val activation: String, // 2024-04-11T04:58:55.328Z
        @SerializedName("startString")
        val startString: String, // -1h 45m 5s
        @SerializedName("expiry")
        val expiry: String, // 2024-04-11T07:28:54.202Z
        @SerializedName("active")
        val active: Boolean, // true
        @SerializedName("syndicate")
        val syndicate: String, // Ostrons
        @SerializedName("syndicateKey")
        val syndicateKey: String, // Ostrons
        @SerializedName("nodes")
        val nodes: List<String>,
        @SerializedName("jobs")
        val jobs: List<Job>,
        @SerializedName("eta")
        val eta: String // 44m 53s
    ) {
        data class Job(
            @SerializedName("id")
            val id: String, // AssassinateBountyCap1712820534202
            @SerializedName("rewardPool")
            val rewardPool: List<String>,
            @SerializedName("type")
            val type: String, // Capture the New Grineer Commander
            @SerializedName("enemyLevels")
            val enemyLevels: List<Int>,
            @SerializedName("standingStages")
            val standingStages: List<Int>,
            @SerializedName("minMR")
            val minMR: Int, // 0
            @SerializedName("expiry")
            val expiry: String, // 2024-04-11T07:28:54.202Z
            @SerializedName("timeBound")
            val timeBound: String?, // day
            @SerializedName("isVault")
            val isVault: Boolean?, // true
            @SerializedName("locationTag")
            val locationTag: String?, // ChamberB
            @SerializedName("timeBoound")
            val timeBoound: String? // night
        )
    }

    data class Fissure(
        @SerializedName("id")
        val id: String, // 661772c5765ef362159dcb70
        @SerializedName("activation")
        val activation: String, // 2024-04-11T05:19:01.687Z
        @SerializedName("startString")
        val startString: String, // -1h 24m 59s
        @SerializedName("expiry")
        val expiry: String, // 2024-04-11T07:18:35.412Z
        @SerializedName("active")
        val active: Boolean, // true
        @SerializedName("node")
        val node: String, // Despina (Neptune)
        @SerializedName("missionType")
        val missionType: String, // Excavation
        @SerializedName("missionKey")
        val missionKey: String, // Excavation
        @SerializedName("enemy")
        val enemy: String, // Corpus
        @SerializedName("enemyKey")
        val enemyKey: String, // Corpus
        @SerializedName("nodeKey")
        val nodeKey: String, // Despina (Neptune)
        @SerializedName("tier")
        val tier: String, // Neo
        @SerializedName("tierNum")
        val tierNum: Int, // 3
        @SerializedName("expired")
        val expired: Boolean, // false
        @SerializedName("eta")
        val eta: String, // 34m 34s
        @SerializedName("isStorm")
        val isStorm: Boolean, // false
        @SerializedName("isHard")
        val isHard: Boolean // false
    )

    data class FlashSale(
        @SerializedName("item")
        val item: String, // Chrysalith Pack
        @SerializedName("expiry")
        val expiry: String, // 2025-01-01T17:00:00.000Z
        @SerializedName("activation")
        val activation: String, // 2022-08-22T13:00:00.000Z
        @SerializedName("discount")
        val discount: Int, // 0
        @SerializedName("regularOverride")
        val regularOverride: Int?, // 0
        @SerializedName("premiumOverride")
        val premiumOverride: Int, // 1
        @SerializedName("isShownInMarket")
        val isShownInMarket: Boolean, // true
        @SerializedName("id")
        val id: String, // AOTZSupporterPackB1735750800000
        @SerializedName("expired")
        val expired: Boolean, // false
        @SerializedName("eta")
        val eta: String // 265d 10h 15m 59s
    )

    data class Invasion(
        @SerializedName("id")
        val id: String, // 66141f0dc6744e7b2c0e04ce
        @SerializedName("activation")
        val activation: String, // 2024-04-08T17:01:38.281Z
        @SerializedName("startString")
        val startString: String, // -2d 13h 42m 22s
        @SerializedName("node")
        val node: String, // Monolith (Phobos)
        @SerializedName("nodeKey")
        val nodeKey: String, // Monolith (Phobos)
        @SerializedName("desc")
        val desc: String, // Grineer Offensive
        @SerializedName("attackingFaction")
        val attackingFaction: String, // Grineer
        @SerializedName("attacker")
        val attacker: Attacker,
        @SerializedName("defender")
        val defender: Defender,
        @SerializedName("vsInfestation")
        val vsInfestation: Boolean, // false
        @SerializedName("count")
        val count: Int, // 9348
        @SerializedName("requiredRuns")
        val requiredRuns: Int, // 46000
        @SerializedName("completion")
        val completion: Double, // 60.16086956521739
        @SerializedName("completed")
        val completed: Boolean, // false
        @SerializedName("eta")
        val eta: String, // 10d 1h 56m 24s
        @SerializedName("rewardTypes")
        val rewardTypes: List<String>
    ) {
        data class Attacker(
            @SerializedName("reward")
            val reward: Reward?,
            @SerializedName("faction")
            val faction: String, // Grineer
            @SerializedName("factionKey")
            val factionKey: String // Grineer
        ) {
            data class Reward(
                @SerializedName("items")
                val items: List<Any>,
                @SerializedName("countedItems")
                val countedItems: List<CountedItem>,
                @SerializedName("credits")
                val credits: Int, // 0
                @SerializedName("asString")
                val asString: String, // Sheev Heatsink
                @SerializedName("itemString")
                val itemString: String, // Sheev Heatsink
                @SerializedName("thumbnail")
                val thumbnail: String,
                @SerializedName("color")
                val color: Int // 5198940
            ) {
                data class CountedItem(
                    @SerializedName("count")
                    val count: Int, // 1
                    @SerializedName("type")
                    val type: String, // Sheev Heatsink
                    @SerializedName("key")
                    val key: String // Sheev Heatsink
                )
            }
        }

        data class Defender(
            @SerializedName("reward")
            val reward: Reward,
            @SerializedName("faction")
            val faction: String, // Corpus
            @SerializedName("factionKey")
            val factionKey: String // Corpus
        ) {
            data class Reward(
                @SerializedName("items")
                val items: List<Any>,
                @SerializedName("countedItems")
                val countedItems: List<CountedItem>,
                @SerializedName("credits")
                val credits: Int, // 0
                @SerializedName("asString")
                val asString: String, // Snipetron Vandal Blueprint
                @SerializedName("itemString")
                val itemString: String, // Snipetron Vandal Blueprint
                @SerializedName("thumbnail")
                val thumbnail: String, // https://cdn.warframestat.us/img/dera-vandal.png
                @SerializedName("color")
                val color: Int // 6052435
            ) {
                data class CountedItem(
                    @SerializedName("count")
                    val count: Int, // 1
                    @SerializedName("type")
                    val type: String, // Snipetron Vandal Blueprint
                    @SerializedName("key")
                    val key: String // Snipetron Vandal Blueprint
                )
            }
        }
    }

    data class VoidTrader(
        @SerializedName("id")
        val id: String, // 5d1e07a0a38e4a4fdd7cefca
        @SerializedName("activation")
        val activation: String, // 2024-04-19T13:00:00.000Z
        @SerializedName("startString")
        val startString: String, // 8d 6h 15m 59s
        @SerializedName("expiry")
        val expiry: String, // 2024-04-21T13:00:00.000Z
        @SerializedName("active")
        val active: Boolean, // false
        @SerializedName("character")
        val character: String, // Baro Ki'Teer
        @SerializedName("location")
        val location: String, // Larunda Relay (Mercury)
        @SerializedName("inventory")
        val inventory: List<Any>,
        @SerializedName("psId")
        val psId: String, // 5d1e07a0a38e4a4fdd7cefca0
        @SerializedName("endString")
        val endString: String, // 10d 6h 15m 59s
        @SerializedName("initialStart")
        val initialStart: String, // 1970-01-01T00:00:00.000Z
        @SerializedName("schedule")
        val schedule: List<Any>
    )

    data class DailyDeal(
        @SerializedName("item")
        val item: String, // Heat Dagger
        @SerializedName("uniqueName")
        val uniqueName: String, // /Lotus/StoreItems/Weapons/Tenno/Melee/Dagger/Dagger
        @SerializedName("expiry")
        val expiry: String, // 2024-04-12T07:00:00.000Z
        @SerializedName("activation")
        val activation: String, // 2024-04-11T05:00:00.000Z
        @SerializedName("originalPrice")
        val originalPrice: Int, // 75
        @SerializedName("salePrice")
        val salePrice: Int, // 52
        @SerializedName("total")
        val total: Int, // 350
        @SerializedName("sold")
        val sold: Int, // 3
        @SerializedName("id")
        val id: String, // Dagger1712905200000
        @SerializedName("eta")
        val eta: String, // 1d 15m 59s
        @SerializedName("discount")
        val discount: Int // 30
    )

    data class Simaris(
        @SerializedName("target")
        val target: String, // Guardsman
        @SerializedName("isTargetActive")
        val isTargetActive: Boolean, // false
        @SerializedName("asString")
        val asString: String // Simaris's previous objective was Guardsman
    )

    data class ConclaveChallenge(
        @SerializedName("id")
        val id: String, // 661068a9d843605d047732d5
        @SerializedName("expiry")
        val expiry: String, // 2024-04-12T21:10:01.323Z
        @SerializedName("activation")
        val activation: String, // 2024-04-05T21:10:01.323Z
        @SerializedName("amount")
        val amount: Int, // 6
        @SerializedName("mode")
        val mode: String, // Any Mode
        @SerializedName("category")
        val category: String, // week
        @SerializedName("eta")
        val eta: String, // 1d 14h 26m 0s
        @SerializedName("expired")
        val expired: Boolean, // false
        @SerializedName("daily")
        val daily: Boolean, // false
        @SerializedName("rootChallenge")
        val rootChallenge: Boolean, // false
        @SerializedName("endString")
        val endString: String, // 1d 14h 26m 0s
        @SerializedName("description")
        val description: String, // Win 6 matches of any Game Type
        @SerializedName("title")
        val title: String, // Match Won
        @SerializedName("standing")
        val standing: Int, // 0
        @SerializedName("asString")
        val asString: String // Win 6 matches of any Game Type on Any Mode 6 times in a week
    )

    data class EarthCycle(
        @SerializedName("id")
        val id: String, // earthCycle1712822400000
        @SerializedName("expiry")
        val expiry: String, // 2024-04-11T08:00:00.791Z
        @SerializedName("activation")
        val activation: String, // 2024-04-11T04:00:00.791Z
        @SerializedName("isDay")
        val isDay: Boolean, // false
        @SerializedName("state")
        val state: String, // night
        @SerializedName("timeLeft")
        val timeLeft: String // 1h 16m 0s
    )

    data class CetusCycle(
        @SerializedName("id")
        val id: String, // cetusCycle1712820480000
        @SerializedName("expiry")
        val expiry: String, // 2024-04-11T07:28:00.000Z
        @SerializedName("activation")
        val activation: String, // 2024-04-11T06:38:00.000Z
        @SerializedName("isDay")
        val isDay: Boolean, // false
        @SerializedName("state")
        val state: String, // night
        @SerializedName("timeLeft")
        val timeLeft: String, // 43m 59s
        @SerializedName("isCetus")
        val isCetus: Boolean, // true
        @SerializedName("shortString")
        val shortString: String // 43m to Day
    )

    data class CambionCycle(
        @SerializedName("id")
        val id: String, // cambionCycle1712820480000
        @SerializedName("activation")
        val activation: String, // 2024-04-11T06:38:00.000Z
        @SerializedName("expiry")
        val expiry: String, // 2024-04-11T07:28:00.000Z
        @SerializedName("timeLeft")
        val timeLeft: String, // 43m 59s
        @SerializedName("state")
        val state: String, // vome
        @SerializedName("active")
        val active: String // vome
    )

    data class ZarimanCycle(
        @SerializedName("id")
        val id: String, // zarimanCycle1712820540000
        @SerializedName("expiry")
        val expiry: String, // 2024-04-11T07:29:00.000Z
        @SerializedName("activation")
        val activation: String, // 2024-04-11T04:59:00.000Z
        @SerializedName("isCorpus")
        val isCorpus: Boolean, // true
        @SerializedName("state")
        val state: String, // corpus
        @SerializedName("timeLeft")
        val timeLeft: String, // 44m 48s
        @SerializedName("shortString")
        val shortString: String // 44m to grineer
    )

    data class ConstructionProgress(
        @SerializedName("id")
        val id: String, // 171281784079214.954528401134553
        @SerializedName("fomorianProgress")
        val fomorianProgress: String, // 14.95
        @SerializedName("razorbackProgress")
        val razorbackProgress: String, // 39.39
        @SerializedName("unknownProgress")
        val unknownProgress: String // 0.00
    )

    data class VallisCycle(
        @SerializedName("id")
        val id: String, // vallisCycle1712817180000
        @SerializedName("expiry")
        val expiry: String, // 2024-04-11T06:53:48.000Z
        @SerializedName("isWarm")
        val isWarm: Boolean, // false
        @SerializedName("state")
        val state: String, // cold
        @SerializedName("activation")
        val activation: String, // 2024-04-11T06:33:00.000Z
        @SerializedName("timeLeft")
        val timeLeft: String, // 9m 47s
        @SerializedName("shortString")
        val shortString: String // 9m to Warm
    )

    data class Nightwave(
        @SerializedName("id")
        val id: String, // nightwave1719187200000
        @SerializedName("activation")
        val activation: String, // 2023-11-29T19:00:00.000Z
        @SerializedName("startString")
        val startString: String, // -133d 11h 44m 0s
        @SerializedName("expiry")
        val expiry: String, // 2024-06-24T00:00:00.000Z
        @SerializedName("active")
        val active: Boolean, // true
        @SerializedName("season")
        val season: Int, // 11
        @SerializedName("tag")
        val tag: String, // Radio Legion Intermission9 Syndicate
        @SerializedName("phase")
        val phase: Int, // 0
        @SerializedName("params")
        val params: Params,
        @SerializedName("possibleChallenges")
        val possibleChallenges: List<Any>,
        @SerializedName("activeChallenges")
        val activeChallenges: List<ActiveChallenge>,
        @SerializedName("rewardTypes")
        val rewardTypes: List<String>
    ) {
        class Params

        data class ActiveChallenge(
            @SerializedName("id")
            val id: String, // 1712880000000seasondailyliquidation
            @SerializedName("activation")
            val activation: String, // 2024-04-09T00:00:00.000Z
            @SerializedName("startString")
            val startString: String, // -2d 6h 44m 0s
            @SerializedName("expiry")
            val expiry: String, // 2024-04-12T00:00:00.000Z
            @SerializedName("active")
            val active: Boolean, // true
            @SerializedName("isDaily")
            val isDaily: Boolean, // true
            @SerializedName("isElite")
            val isElite: Boolean, // false
            @SerializedName("desc")
            val desc: String, // Sell any item in your Inventory for Credits
            @SerializedName("title")
            val title: String, // Liquidation
            @SerializedName("reputation")
            val reputation: Int, // 1000
            @SerializedName("isPermanent")
            val isPermanent: Boolean // false
        )
    }

    data class Arbitration(
        @SerializedName("activation")
        val activation: String, // 2024-04-11T06:05:00.000Z
        @SerializedName("expiry")
        val expiry: String, // 2024-04-11T07:04:00.000Z
        @SerializedName("enemy")
        val enemy: String, // Infested
        @SerializedName("type")
        val type: String, // Survival
        @SerializedName("archwing")
        val archwing: Boolean, // false
        @SerializedName("sharkwing")
        val sharkwing: Boolean, // false
        @SerializedName("node")
        val node: String, // Apollodorus (Mercury)
        @SerializedName("nodeKey")
        val nodeKey: String, // Apollodorus (Mercury)
        @SerializedName("typeKey")
        val typeKey: String, // Survival
        @SerializedName("id")
        val id: String, // 5e3da1e4fede6a1b065f81a2ce47abb4225823775eecde10deeed34f8cfe07e8
        @SerializedName("expired")
        val expired: Boolean // true
    )

    data class SentientOutposts(
        @SerializedName("mission")
        val mission: Mission,
        @SerializedName("activation")
        val activation: String, // 2021-08-06T13:38:05.000Z
        @SerializedName("expiry")
        val expiry: String, // 2021-08-06T14:08:05.000Z
        @SerializedName("active")
        val active: Boolean, // true
        @SerializedName("id")
        val id: String // CrewBattleNode168:true
    ) {
        data class Mission(
            @SerializedName("node")
            val node: String, // CrewBattleNode168
            @SerializedName("faction")
            val faction: String, // CrewBattleNode168
            @SerializedName("type")
            val type: String // CrewBattleNode168
        )
    }

    data class SteelPath(
        @SerializedName("currentReward")
        val currentReward: CurrentReward,
        @SerializedName("activation")
        val activation: String, // 2024-04-08T00:00:00.000Z
        @SerializedName("expiry")
        val expiry: String, // 2024-04-14T23:59:59.000Z
        @SerializedName("remaining")
        val remaining: String, // 3d 17h 15m 58s
        @SerializedName("rotation")
        val rotation: List<Rotation>,
        @SerializedName("evergreens")
        val evergreens: List<Evergreen>,
        @SerializedName("incursions")
        val incursions: Incursions
    ) {
        data class CurrentReward(
            @SerializedName("name")
            val name: String, // 50,000 Kuva
            @SerializedName("cost")
            val cost: Int // 55
        )

        data class Rotation(
            @SerializedName("name")
            val name: String, // Umbra Forma Blueprint
            @SerializedName("cost")
            val cost: Int // 150
        )

        data class Evergreen(
            @SerializedName("name")
            val name: String, // Veiled Riven Cipher
            @SerializedName("cost")
            val cost: Int // 20
        )

        data class Incursions(
            @SerializedName("id")
            val id: String, // spi:1712793600000
            @SerializedName("activation")
            val activation: String, // 2024-04-11T00:00:00.000Z
            @SerializedName("expiry")
            val expiry: String // 2024-04-11T23:59:59.000Z
        )
    }

    data class VaultTrader(
        @SerializedName("id")
        val id: String, // 631f8c4ac36af423770eaa97
        @SerializedName("activation")
        val activation: String, // 2024-03-14T18:00:00.000Z
        @SerializedName("startString")
        val startString: String, // -27d 12h 44m 0s
        @SerializedName("expiry")
        val expiry: String, // 2024-04-11T18:00:00.000Z
        @SerializedName("active")
        val active: Boolean, // true
        @SerializedName("character")
        val character: String,
        @SerializedName("location")
        val location: String, // Maroo's Bazaar (Mars)
        @SerializedName("inventory")
        val inventory: List<Inventory>,
        @SerializedName("psId")
        val psId: String, // 631f8c4ac36af423770eaa9722
        @SerializedName("endString")
        val endString: String, // 11h 15m 59s
        @SerializedName("initialStart")
        val initialStart: String, // 2022-09-09T15:42:24.266Z
        @SerializedName("schedule")
        val schedule: List<Schedule>
    ) {
        data class Inventory(
            @SerializedName("uniqueName")
            val uniqueName: String, // /Lotus/Types/StoreItems/Packages/MegaPrimeVault/MPVTitaniaPrimeSinglePack
            @SerializedName("item")
            val item: String, // M P V Titania Prime Single Pack
            @SerializedName("ducats")
            val ducats: Int?, // 6
            @SerializedName("credits")
            val credits: Int? // 1
        )

        data class Schedule(
            @SerializedName("expiry")
            val expiry: String, // 2022-11-03T18:00:00.000Z
            @SerializedName("item")
            val item: String? // M P V Equinox Wukong Prime Dual Pack
        )
    }

    data class ArchonHunt(
        @SerializedName("id")
        val id: String, // 66132ffdffefe34e8819cd21
        @SerializedName("activation")
        val activation: String, // 2024-04-08T00:00:00.000Z
        @SerializedName("startString")
        val startString: String, // -3d 6h 44m 0s
        @SerializedName("expiry")
        val expiry: String, // 2024-04-15T00:00:00.000Z
        @SerializedName("active")
        val active: Boolean, // true
        @SerializedName("rewardPool")
        val rewardPool: String, // Archon Sortie Rewards
        @SerializedName("variants")
        val variants: List<Any>,
        @SerializedName("missions")
        val missions: List<Mission>,
        @SerializedName("boss")
        val boss: String, // Archon Amar
        @SerializedName("faction")
        val faction: String, // Narmer
        @SerializedName("factionKey")
        val factionKey: String, // Narmer
        @SerializedName("expired")
        val expired: Boolean, // false
        @SerializedName("eta")
        val eta: String // 3d 17h 15m 59s
    ) {
        data class Mission(
            @SerializedName("node")
            val node: String, // Ares (Mars)
            @SerializedName("nodeKey")
            val nodeKey: String, // Ares (Mars)
            @SerializedName("type")
            val type: String, // Extermination
            @SerializedName("typeKey")
            val typeKey: String, // Extermination
            @SerializedName("nightmare")
            val nightmare: Boolean, // false
            @SerializedName("archwingRequired")
            val archwingRequired: Boolean, // false
            @SerializedName("isSharkwing")
            val isSharkwing: Boolean, // false
            @SerializedName("advancedSpawners")
            val advancedSpawners: List<Any>,
            @SerializedName("requiredItems")
            val requiredItems: List<Any>,
            @SerializedName("levelAuras")
            val levelAuras: List<Any>
        )
    }

    data class DuviriCycle(
        @SerializedName("id")
        val id: String, // duviriCyclefear1712822400000
        @SerializedName("activation")
        val activation: String, // 2024-04-11T06:00:00.000Z
        @SerializedName("expiry")
        val expiry: String, // 2024-04-11T08:00:00.000Z
        @SerializedName("state")
        val state: String, // fear
        @SerializedName("choices")
        val choices: List<Choice>
    ) {
        data class Choice(
            @SerializedName("category")
            val category: String, // normal
            @SerializedName("categoryKey")
            val categoryKey: String, // EXC_NORMAL
            @SerializedName("choices")
            val choices: List<String>
        )
    }
}