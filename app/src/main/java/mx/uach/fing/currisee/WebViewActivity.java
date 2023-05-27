package mx.uach.fing.currisee;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true); // Habilita los controles de zoom
        webSettings.setDisplayZoomControls(false); // Oculta los botones de zoom
        webSettings.setLoadWithOverviewMode(true); // Escala la página para adaptarse a la pantalla
        webSettings.setUseWideViewPort(true); // Habilita el soporte para vista amplia

        webView.setWebViewClient(new WebViewClient());

        String url = "https://DiegoMTZGlz.github.io"; // URL de mi Curriculum
        webView.loadUrl(url);
    }
}