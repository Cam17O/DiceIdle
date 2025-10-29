package com.example.iddledice.BO

open class Entity (
    val id: Int,
    val name: String,
    val dices: MutableList<Dice> = mutableListOf(),
    val upgrade: MutableList<GlobalUpgrade> = mutableListOf()
)