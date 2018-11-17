package com.example.corentinrobert.fifaproperso

data class MagicBaloon(val maxX: Float, val maxY: Float,var delta: Int = 10, var cx: Float = 50F, var cy: Float = 50F, val rad: Float = 40F){
    var dx = delta
    var dy = delta
    fun move() {
        when {
            cx < 0F -> dx = delta
            cx > maxX -> dx =-delta
            cy < 0F -> dy = delta
            cy > maxY -> dy =- delta
        }
        cx += dx
        cy += dy
    }
}