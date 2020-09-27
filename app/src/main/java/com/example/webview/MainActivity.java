package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSayt;
    private WebView webSayt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSayt = (Button)findViewById(R.id.btnSayt);
        webSayt = (WebView)findViewById(R.id.webSayt);
        webSayt.getSettings().setJavaScriptEnabled(true);

        btnSayt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webSayt.loadUrl("https://uzhackersw.uz");
            }
        });
    }
}