package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText dados;
    private Button btnEnviar;
    private WebView imagem;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dados = findViewById(R.id.dados);
        btnEnviar = findViewById(R.id.btnEnviar);
        imagem = findViewById(R.id.imagem);
        mp = MediaPlayer.create(this, R.raw.DarkTeaser);
        mp.start();

        WebSettings gif = imagem.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/dark.gif";
        imagem.loadUrl(caminho);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent janela = new Intent(MainActivity.this, Escolha.class);
                janela.putExtra("dados", dados.getText().toString());
                startActivity(janela);
                mp.stop();
            }
        });
    }
}