package com.example.mygif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity3 extends AppCompatActivity {
    private WebView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imagem = findViewById(R.id.imagem);

        //configuração do webview
        WebSettings gif = imagem.getSettings();
        gif.setJavaScriptEnabled(true);

        String caminho = "file:android_asset/hulk.gif";
        imagem.loadUrl(caminho);

    }
}