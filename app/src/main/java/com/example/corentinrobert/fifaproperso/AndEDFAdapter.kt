package com.example.corentinrobert.fifaproperso

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_my_object.view.*

class AndEDFAdapter(val items: Array<MyObject>) : RecyclerView.Adapter<AndEDFAdapter.ViewHolder>() {
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindMyObject(myObject: MyObject) {
            with(myObject) {
                itemView.imgFrance.setImageResource(logo)
                itemView.txtNom.text = "$name"
                itemView.txtClub.text = "$club"
                itemView.txtPoste.text = "$poste"
            }
        }
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindMyObject(items[position])
    }

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.item_my_object))
    }
    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachRoot: Boolean = false) : View {
        return  LayoutInflater.from(context).inflate(layoutRes,this,attachRoot)
    }
}