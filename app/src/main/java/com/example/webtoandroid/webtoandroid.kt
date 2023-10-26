package com.example.webtoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class webtoandroid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webtoandroid)
        val url =intent.getStringExtra("link")
        val webView:WebView=findViewById(R.id.web_view)
        webView.webViewClient= WebViewClient()
        webView.settings.javaScriptEnabled=true
        webView.loadUrl(url!!)
    }
}