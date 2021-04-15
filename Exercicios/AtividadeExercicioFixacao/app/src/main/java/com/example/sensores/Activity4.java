package com.example.sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {
    WebView imagem;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        imagem = findViewById(R.id.imagem);
        btnVoltar = findViewById(R.id.btnVoltar);

        WebSettings gif = imagem.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/bulbasaur.gif";
        imagem.loadUrl(caminho);
    }
}