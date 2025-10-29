package com.example.iddledice.BO

class Player(
    id: Int,
    name: String,
    var expLvl: Int,
    var point: Int)
    : Entity(id, name) {

}