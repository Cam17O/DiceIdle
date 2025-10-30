// GameEngine.kt
package com.example.iddledice.gameengine

import android.util.Log
import com.example.iddledice.BO.Boss
import com.example.iddledice.BO.Player
import com.example.iddledice.bo.Enemy

class GameEngine {

    private var playGame = true
    private var duelCount = 1

    fun play(player: Player) {
        Log.i("Game", "Start game")

        while (playGame) {

            if (duelCount % 5 == 0){
                val enemy = createBoss(duelCount)
            }else {
                val enemy = createEnemy(duelCount)
            }

            Log.i("Game", "Duel $duelCount against ${enemy.name}")

            if (duelCount % 5 == 0) {
                duelBoss(player, enemy)
            } else {
                duel(player, enemy)
            }
        }
    }

    private fun createEnemy(duelCount: Int) {
        TODO("Not yet implemented")
    }

    private fun createBoss(duelCount: Int) {
        TODO("Not yet implemented")
    }

    private fun duel(player: Player, enemy: Enemy) {
        TODO("Not yet implemented")
    }

    private fun duelBoss(player: Player, boss: Boss) {
        TODO("Not yet implemented")
    }
}