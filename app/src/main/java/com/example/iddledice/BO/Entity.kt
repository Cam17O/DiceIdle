package com.example.iddledice.bo

import com.example.iddledice.BO.Dice
import com.example.iddledice.BO.GlobalUpgrade

open class Entity (
    val id: Int,
    val name: String,
    val dices: MutableList<Dice> = mutableListOf(),
    val upgrade: MutableList<GlobalUpgrade> = mutableListOf()
)