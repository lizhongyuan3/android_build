package com.lmm.myapplication;

import android.content.Context;
import android.webkit.WebViewClient;

public class WebViewClientDiy extends WebViewClient {
    Context context;
    public WebViewClientDiy(Context context){
        this.context =context;
    }
}
