package com.example.allone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mywebview = (WebView) findViewById(R.id.webview1);
        mywebview.setWebViewClient(new WebViewClient());
        mywebview.loadUrl("https://bazaareagle.com/");

        WebSettings webSettings=mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    int counter=0;
    @Override
    public void onBackPressed() {
        counter++;
        if(counter==2)
            super.onBackPressed();
    }
}