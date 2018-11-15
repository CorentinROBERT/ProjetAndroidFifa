package com.example.corentinrobert.fifaproperso

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_edf.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

var items = Array<MyObject>(23,{MyObject()})

class Edf : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edf)
        seedItems()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AndEDFAdapter(items)
    }
    fun seedItems(){
        val nameArray = resources.getStringArray(R.array.equipedefrance)
        val clubArray = resources.getStringArray(R.array.equipedefranceclub)
        val posteArray = resources.getStringArray(R.array.equipedefranceposte)

        for(k in 0..items.size-1){
            items[k] = MyObject(R.drawable.ic_france,nameArray[k],"Club : "+clubArray[k],"Poste : "+posteArray[k])

        }
    }
}