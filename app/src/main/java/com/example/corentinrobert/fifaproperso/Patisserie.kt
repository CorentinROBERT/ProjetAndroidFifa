package com.example.corentinrobert.fifaproperso

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_patisserie.*
import kotlinx.android.synthetic.main.item_my_object.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

var items = Array<MyObject>(10,{MyObject()})

class Patisserie : AppCompatActivity(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patisserie)
        seedItems()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AndVersionAdapter(items)
    }
    fun seedItems() {

        val nameArray = resources.getStringArray(R.array.name)
        val descriptionArray = resources.getStringArray(R.array.version)
        val images: IntArray = intArrayOf(
                R.drawable.ic_honeycomb,
                R.drawable.ic_gingerbread,
                R.drawable.ic_ice_cream,
                R.drawable.ic_beans,
                R.drawable.ic_chocolate_bar,
                R.drawable.ic_lollipop,
                R.drawable.ic_marshmallows,
                R.drawable.ic_nougat,
                R.drawable.ic_cookie,
                R.drawable.ic_pie
        )
        for (k in 0..items.size-1) {
            items[k] = MyObject(nameArray[k], descriptionArray[k], images[k])
        }
    }

}
