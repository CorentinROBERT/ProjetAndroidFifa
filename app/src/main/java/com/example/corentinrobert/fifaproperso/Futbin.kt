package com.example.corentinrobert.fifaproperso

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import kotlinx.android.synthetic.main.activity_futbin.*

class Futbin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futbin)
        if (18 < Build.VERSION.SDK_INT ){
            //18 = JellyBean MR2, KITKAT=19
            webViewFutBin.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        }
        webViewFutBin.loadUrl("http://www.futbin.com")
    }
}
