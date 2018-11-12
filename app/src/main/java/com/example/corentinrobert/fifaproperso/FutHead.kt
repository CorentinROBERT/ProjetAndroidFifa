package com.example.corentinrobert.fifaproperso

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import kotlinx.android.synthetic.main.activity_fut_head.*

class FutHead : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fut_head)
        if (18 < Build.VERSION.SDK_INT ){
            //18 = JellyBean MR2, KITKAT=19
            webViewFutHead.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        }
        webViewFutHead.loadUrl("https://www.futhead.com")
    }
}
