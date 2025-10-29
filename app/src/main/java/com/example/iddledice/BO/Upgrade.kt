package com.example.iddledice.BO

open class Upgrade(
    val name: String,
    val description: String,
    val currentLevel: Int,
    val maxLevel: Int,
    val baseCost: Int,
    val costMult: Int
) {

}