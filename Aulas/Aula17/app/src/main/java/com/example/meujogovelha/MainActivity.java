package com.example.meujogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Declaração dos Atributos que serão manipulados
    Button btnComo, btnJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mapeamento dos Objetos que serão manipulados
        btnComo = findViewById(R.id.btnComo);
        btnJogar = findViewById(R.id.btnJogar);


        //Configuração do OUVIDOR (Listener) para o evento OnClick
        //Com o método para abrir a Activity ComoJogar e Jogo
        //Com os métodos
        btnComo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirComo();
            }
        });

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirGame();
            }
        });

    }

    //Criação dos métodos para abertura das Activities usando Intent e startActivity
    private void abrirComo(){
        Intent janela = new Intent(this, ComoJogar.class);
        startActivity(janela);
    }

    private void abrirGame(){
        Intent janelag = new Intent(this, Jogo.class);
        startActivity(janelag);
    }

}