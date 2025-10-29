package com.example.iddledice.BO

class FaceUpgrade(
    name: String,
    description: String,
    currentLevel: Int,
    maxLevel: Int,
    baseCost: Int,
    costMult: Int
) : Upgrade(
    name, description, currentLevel, maxLevel, baseCost, costMult

) {
}