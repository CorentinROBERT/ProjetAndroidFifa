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

    }
}
