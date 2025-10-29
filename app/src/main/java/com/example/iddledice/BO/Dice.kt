package com.example.iddledice.BO

open class Dice (
    val id: Int,
    val name: String,
    val description: String,
    val faces: MutableList<Face> = mutableListOf(),
    val cooldown: Double = 0.0) {

}