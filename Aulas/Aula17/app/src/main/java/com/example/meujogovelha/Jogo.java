package com.example.meujogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Jogo extends AppCompatActivity {
    Button btnFora, btnReiniciar;

    private Button[] arrayButton = new Button[10];
    private String vez = "X", jogador = "jogador 1";
    private int jogadas = 0;
    private String[] matriz = new String[10];
    private TextView txtJogador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        btnFora = findViewById(R.id.btnFora);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        txtJogador = findViewById(R.id.txtJogador);

        //Continuar daqui e lembrar que houve mudança no nome do txtj

        btnFora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sair();
            }
        });

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reiniciar();
            }
        });
    }

    private void sair(){
        finish();
    }

    private void reiniciar(){
        Intent reiniciar = new Intent(this, MainActivity.class);
        startActivity(reiniciar);
    }

}