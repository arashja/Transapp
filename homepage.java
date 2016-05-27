package com.example.arash.translation01;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by arash on 5/26/2016.
 */
public class homepage  extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        String url= "http://tolksenct.bugs3.com/translatetweb.php";
        WebView view = (WebView)findViewById(R.id.fragment2);
        //  WebSettings webSettings=view.getSettings();
        view.getSettings().setUseWideViewPort(true);
        view.getSettings().setLoadWithOverviewMode(true);
        // view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }


}
