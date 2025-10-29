package com.example.iddledice.BO

import kotlin.random.Random

open class Dice(
    val id: Int,
    val name: String,
    val description: String,
    val faces: MutableList<Face> = mutableListOf(),
    val cooldown: Double = 0.0
) {

    fun roll(): Int {
        if (faces.isEmpty()) return 0
        val randomIndex = Random.nextInt(faces.size)
        val faceValue = faces[randomIndex].value

        return faceValue
    }

}