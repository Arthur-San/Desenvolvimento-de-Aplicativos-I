package com.example.menudelista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1º Etapa: Declarar as variáveis e a construção do nosso Array
    private ListView lista;
    private String [] itens = {"HTML5", "CSS", "SASS", "JavaScript", "NodeJs", "AngularJs", "Ruby", "React", "jQuery"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2º Etapa: Fazer o mapeamento da Lista
        lista = findViewById(R.id.lista);

        //3º Etapa: Crirar um adaptador para servir de ligação entre o Array e o elemento ListView no XML
        //O adaptador vem do atributo ArrayAdapter
        //android.R.layout.simple_list_item_1: Mapeamento que Define o tipo da lista, ou seja, uma lista simples no layout atual - item 1;
        //android.R.id.text1, itens: Mapeamento que Define os tipos de valores da lista
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1, android.R.id.text1, itens);


        //4º Etapa: Adicionar o adapter para a lista criada no Array
        lista.setAdapter(adapter);

        //5º Etapa: Print da tela em Toast indicado qual o item que foi clicado
        //eventos: setOnItemClickListener e onItemClick
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(MainActivity.this, itens[i], Toast.LENGTH_SHORT).show();

            }
        });

    }
}