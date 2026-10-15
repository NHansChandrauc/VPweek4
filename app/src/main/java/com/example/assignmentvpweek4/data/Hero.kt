package com.example.assignmentvpweek4.data

import androidx.annotation.DrawableRes

data class Hero(
    val id: String,
    val name: String,
    val heroClass: String,
    val rarity: String,
    val level: Int,
    val currentHp: Int,
    val maxHp: Int,
    val currentMp: Int,
    val maxMp: Int,
    val cp: Int,
    val atk: Int,
    val def: Int,
    val crit: String,
    val spd: Int,
    val skillName: String,
    val skillDescription: String,
    @DrawableRes val avatarRes: Int,
    val inSquad: Boolean = false,
    val isExpanded: Boolean = false
)