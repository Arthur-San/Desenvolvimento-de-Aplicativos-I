package com.example.mycalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText edtValor1, edtValor2;
    Button btnSoma, btnSub, btnMulti, btnDiv;
    TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Mapeamento dos objetos na classe R
        edtValor1 = findViewById(R.id.edtValor1);
        edtValor2 = findViewById(R.id.edtValor2);
        btnSoma = findViewById(R.id.btnSoma);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
        txtResultado = findViewById(R.id.txtResultado);

        //Configurações da lógica do app, dos Listener + eventos
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //declaração das variáveis que armazenaram os valores para a operação
                //da calculadora
                int v1 = Integer.parseInt(edtValor1.getText().toString() );
                int v2 = Integer.parseInt(edtValor2.getText().toString() );
                int resultado = v1 + v2;
                //aqui jogamos o resultado da operação feita com as variáveis v1 e v2
                txtResultado.setText(resultado + "");


            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //declaração das variáveis que armazenaram os valores para a operação
                //da calculadora
                int v1 = Integer.parseInt(edtValor1.getText().toString() );
                int v2 = Integer.parseInt(edtValor2.getText().toString() );
                int resultado = v1 - v2;
                //aqui jogamos o resultado da operação feita com as variáveis v1 e v2
                txtResultado.setText(resultado + "");


            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //declaração das variáveis que armazenaram os valores para a operação
                //da calculadora
                int v1 = Integer.parseInt(edtValor1.getText().toString() );
                int v2 = Integer.parseInt(edtValor2.getText().toString() );
                int resultado = v1 * v2;
                //aqui jogamos o resultado da operação feita com as variáveis v1 e v2
                txtResultado.setText(resultado + "");


            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                    declaração das variáveis que armazenaram os valores para a operação
                    da calculadora
                    parseInt serve para transformar um String (edtText) para um valor Integer
                */

                int v1 = Integer.parseInt(edtValor1.getText().toString() );
                int v2 = Integer.parseInt(edtValor2.getText().toString() );

                int resultado;

                try {
                    resultado = v1 / v2;
                }catch (Exception e){
                    resultado = 0;
                }

                //aqui jogamos o resultado da operação feita com as variáveis v1 e v2
                txtResultado.setText(resultado + "");


            }
        });



    }
}