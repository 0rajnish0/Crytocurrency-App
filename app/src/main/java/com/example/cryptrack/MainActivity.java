package com.example.cryptrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {
    private WebView View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView View = (WebView) findViewById(R.id.webview);
        View.getSettings().setJavaScriptEnabled(true);

        View.loadUrl("file:///android_asset/index.html");
    }
}