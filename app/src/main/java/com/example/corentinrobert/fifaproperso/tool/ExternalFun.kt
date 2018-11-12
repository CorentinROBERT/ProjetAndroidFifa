package com.example.corentinrobert.fifaproperso.tool

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.corentinrobert.fifaproperso.R

fun AppCompatActivity.replace(frag: Fragment) {
    supportFragmentManager.beginTransaction().replace(R.id.content,frag).commit()
}