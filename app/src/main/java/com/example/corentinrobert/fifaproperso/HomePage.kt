package com.example.corentinrobert.fifaproperso


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home_page.*
import kotlinx.android.synthetic.main.nav_header_main.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

/**
 * A simple [Fragment] subclass.
 *
 */
class HomePage : Fragment(),AnkoLogger{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var i = 1

        val carte_fut_titre = resources.getStringArray(R.array.titre_carte_fut)
        val carte_fut_description = resources.getStringArray(R.array.description_carte_fut)

        val images: IntArray = intArrayOf(
                R.drawable.ic_debruyne,
                R.drawable.ic_degea,
                R.drawable.ic_hazard,
                R.drawable.ic_kroos
        )

        imgView.setImageResource(images[i-1])
        txtView_titre.setText(carte_fut_titre.get(i-1))
        txtView_description.setText(carte_fut_description.get(i-1))

        btn_precedent.setOnClickListener(){
            i--
            if(i<1)
                i=carte_fut_titre.size
            imgView.setImageResource(images[i-1])
            txtView_titre.setText(carte_fut_titre.get(i-1))
            txtView_description.setText(carte_fut_description.get(i-1))
        }
        btn_suivant.setOnClickListener(){
            i++
            if(i>carte_fut_titre.size)
                i=1
            imgView.setImageResource(images[i-1])
            txtView_titre.setText(carte_fut_titre.get(i-1))
            txtView_description.setText(carte_fut_description.get(i-1))
        }
    }
}
