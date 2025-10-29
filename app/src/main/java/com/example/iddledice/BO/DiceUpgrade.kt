package com.example.iddledice.BO

class DiceUpgrade(
    name: String,
    description: String,
    currentLevel: Int,
    maxLevel: Int,
    baseCost: Int,
    costMult: Int
) : Upgrade(name, description, currentLevel, maxLevel, baseCost, costMult) {
}