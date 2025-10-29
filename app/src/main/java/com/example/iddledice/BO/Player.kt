package com.example.iddledice.BO

class Player(
    id: Int,
    name: String,
    var expLvl: Int,
    var point: Int
) : Entity(id, name) {

    fun launchDice(): Int {
        var total = 0

        for (dice in dices) {
            val roll = dice.roll()
            total += roll
        }

        return total
    }
}