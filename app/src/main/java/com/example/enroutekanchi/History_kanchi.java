package com.example.enroutekanchi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class History_kanchi extends AppCompatActivity {
   // private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_kanchi);


//        wv=findViewById(R.id.webv);
//        wv.setWebViewClient(new WebViewClient());
//        wv.getSettings().setJavaScriptEnabled(true);
//        wv.getSettings().setDomStorageEnabled(true);
//        wv.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
//        wv.loadUrl("https://en.wikipedia.org/wiki/Kanchipuram");
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);
    }

}
