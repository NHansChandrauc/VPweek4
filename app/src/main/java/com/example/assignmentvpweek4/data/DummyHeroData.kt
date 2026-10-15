package com.example.assignmentvpweek4.data

import com.example.assignmentvpweek4.R

object DummyHeroData {
    val heroes = listOf(
        Hero(
            "1", "Alistair", "High Templar", "MYTHIC",
            50, 1650, 1800, 650, 800,
            5600, 380, 540, "22%", 105,
            "Wrath of the Heavens", "Calls down a celestial hammer, stunning all enemies for 3 seconds.",
            R.drawable.paladin
        ),
        Hero(
            "2", "Theresa", "Divine Oracle", "MYTHIC",
            49, 1100, 1200, 2100, 2400,
            5480, 210, 320, "15%", 112,
            "Celestial Healing", "Restores team health and increases defense.",
            R.drawable.cleric
        ),
        Hero(
            "3", "Vespera", "Shadowblade", "MYTHIC",
            48, 890, 950, 410, 600,
            5350, 620, 210, "45%", 140,
            "Shadow Strike", "Teleports behind the highest ATK enemy.",
            R.drawable.rogue
        ),
        Hero(
            "4", "Elaria", "Archmage", "MYTHIC",
            45, 450, 600, 1800, 2000,
            5120, 580, 180, "30%", 98,
            "Arcane Burst", "Unleashes an explosive area magic attack.",
            R.drawable.archmage, inSquad = true
        )
    )
}