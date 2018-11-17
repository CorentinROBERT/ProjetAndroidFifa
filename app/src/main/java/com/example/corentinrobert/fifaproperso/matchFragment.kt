package com.example.corentinrobert.fifaproperso

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_match.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info


class matchFragment : Fragment(),AnkoLogger {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_match, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lblScoreB.text = CustomView.B.toString()
        lblScoreH.text = CustomView.H.toString()
    }
}
