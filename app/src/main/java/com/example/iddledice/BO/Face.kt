package com.example.iddledice.BO

class Face(
    val id: Int,
    val value: Int,
    val faceUpgrade: MutableList<FaceUpgrade> = mutableListOf()
) {

}