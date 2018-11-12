package com.example.corentinrobert.fifaproperso

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import kotlinx.android.synthetic.main.activity_fut_app.*
import kotlinx.android.synthetic.main.activity_fut_head.*

class FutApp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fut_app)

        if (18 < Build.VERSION.SDK_INT ){
            //18 = JellyBean MR2, KITKAT=19
            webViewFutApp.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        }
        webViewFutApp.loadUrl("https://www.easports.com/fifa/ultimate-team/web-app/")
    }
}
