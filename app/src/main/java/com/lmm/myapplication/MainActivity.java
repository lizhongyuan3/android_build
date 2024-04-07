package com.lmm.myapplication;

import android.app.Activity;

import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;

public class MainActivity extends Activity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClientDiy(this));
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);


        webView.loadUrl("http://vr.nkucxcy.com/system");



        setContentView(webView);
    }

}