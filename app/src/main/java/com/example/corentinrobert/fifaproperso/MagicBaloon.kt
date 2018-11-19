package com.example.corentinrobert.fifaproperso

import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.corentinrobert.fifaproperso.CustomView.Companion.H
import org.jetbrains.anko.*


data class MagicBaloon(val maxX: Float, val maxY: Float,var delta: Int = 10, var cx: Float = 50F, var cy: Float = 50F, val rad: Float = 40F){
    var dx = delta
    var dy = delta
    var comptH = 0
    var comptB = 0
    fun move() {
        when {
            cx < 0F -> dx = delta
            cx > maxX -> dx =-delta
            cy < 0F -> dy = delta
            cy > maxY -> dy =- delta
        }
        cx += dx
        cy += dy
        if((cy > 1280F) && (cx >=385 && cx <=700)){
            comptH +=1
        }
        if(cy < 0.0F && (cx >=385 && cx <=700)){
            comptB +=1
        }

    }
}