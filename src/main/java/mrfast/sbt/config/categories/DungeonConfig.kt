package mrfast.sbt.config.categories

import mrfast.sbt.config.Config
import mrfast.sbt.config.ConfigProperty
import mrfast.sbt.config.ConfigType
import java.awt.Color


object DungeonConfig : Config() {
    @ConfigProperty(
        type = ConfigType.TOGGLE,
        name = "Party Finder Join Info",
        description = "Shows stats of players when they join your party such as, armor, weapons, equipment, cata, secrets, and more",
        category = "§1§rDungeons",
        subcategory = "Miscellaneous",
        isParent = true
    )
    var partyfinderJoinInfo = true

    @ConfigProperty(
        type = ConfigType.TOGGLE,
        name = "Show Player Equipment",
        description = "",
        category = "§1§rDungeons",
        subcategory = "Miscellaneous",
        parentName = "Party Finder Join Info"
    )
    var partyfinderJoinInfo_showEquipment = false

    @ConfigProperty(
        type = ConfigType.TOGGLE,
        name = "Show Player Hotbar",
        description = "§cReplaces \"Hype ✘   Term ✘   Clay ✘\" line!",
        category = "§1§rDungeons",
        subcategory = "Miscellaneous",
        parentName = "Party Finder Join Info"
    )
    var partyfinderJoinInfo_showHotbar = false


    @ConfigProperty(
        type = ConfigType.TOGGLE,
        name = "Floor 2 Scarf Spawn Timers",
        description = "Renders timers showing when the §dPriest§r, §cWarrior§f, §aArcher§r, §bMage§r, §6Scarf§r will spawn.",
        category = "§1§rDungeons",
        subcategory = "Spawn Timers"
    )
    var floor2SpawnTimer = true

    @ConfigProperty(
        type = ConfigType.TOGGLE,
        name = "Fire Freeze Timer",
        description = "Timer showing when to perfectly freeze boss. \n§cWorks on F2, F3, M2, M3",
        category = "§1§rDungeons",
        subcategory = "Spawn Timers"
    )
    var fireFreezeTimer = true

    @ConfigProperty(
        type = ConfigType.TOGGLE,
        name = "Highlight Starred Mobs",
        description = "Makes all starred mobs in dungeons glow!",
        category = "§1§rDungeons",
        subcategory = "Highlights",
        isParent = true
    )
    var glowingStarredMobs = false

    @ConfigProperty(
        type = ConfigType.COLOR,
        name = "Color",
        description = "",
        category = "§1§rDungeons",
        subcategory = "Highlights",
        parentName = "Highlight Starred Mobs"
    )
    var glowingStarredMobsColor = Color(0xFFAA00)

    @ConfigProperty(
        type = ConfigType.TOGGLE,
        name = "Highlight Correct Livid",
        description = "Make the correct livid glowing inside the Floor 5 Boss Fight!",
        category = "§1§rDungeons",
        subcategory = "Highlights",
        isParent = true
    )
    var highlightCorrectLivid = false

    @ConfigProperty(
        type = ConfigType.COLOR,
        name = "Color",
        description = "",
        category = "§1§rDungeons",
        subcategory = "Highlights",
        parentName = "Highlight Correct Livid"
    )
    var highlightCorrectLividColor = Color(0x00FFFF)

//
//    @ConfigProperty(
//            type = ConfigType.TOGGLE,
//            name = "Dungeon Map",
//            description = "Render a moveable dungeon map on screen",
//            category = "§1§rDungeons",
//            subcategory = "Dungeon Map",
//            isParent = true
//    )
//    var dungeonMap = false
//
//    @ConfigProperty(
//            type = ConfigType.TOGGLE,
//            name = "Render Player Names",
//            description = "Draws names above the players",
//            category = "§1§rDungeons",
//            subcategory = "Dungeon Map",
//            parentName = "Dungeon Map"
//    )
//    var dungeonMapPlayerNames = true
//
//    @ConfigProperty(
//            type = ConfigType.TOGGLE,
//            name = "Blood Door Highlight",
//            description = "Marks the player's name red if they opened the blood door",
//            category = "§1§rDungeons",
//            subcategory = "Dungeon Map",
//            parentName = "Dungeon Map"
//    )
//    var dungeonMapBloodGuy = true
//
//    @ConfigProperty(
//            type = ConfigType.TOGGLE,
//            name = "Render Player Heads",
//            description = "Adds an outline to the player heads on the dungeon map",
//            category = "§1§rDungeons",
//            subcategory = "Dungeon Map",
//            parentName = "Dungeon Map"
//    )
//    var dungeonMapHeads = true
}