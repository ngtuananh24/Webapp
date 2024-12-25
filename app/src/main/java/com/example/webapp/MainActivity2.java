package com.example.webapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        webView = findViewById(R.id.webview);
        // Cấu hình WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Kích hoạt JavaScript
        webSettings.setMediaPlaybackRequiresUserGesture(false); // Cho phép tự động phát video và âm thanh

        webView.setWebChromeClient(new WebChromeClient());  // Tùy chỉnh WebChromeClient
        webView.setWebViewClient(new WebViewClient()); // Tùy chỉnh WebViewClient

        // Tải file HTML từ thư mục assets
        webView.loadUrl("file:///android_asset/index.html");
    }
}