package com.example.ednaldopereira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnEntrar;
    EditText dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = findViewById(R.id.btnEntrar);
        dados = findViewById(R.id.dados);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirbtnEntrar();
            }
        });

    }

    private void abrirbtnEntrar() {
        Intent janela = new Intent(this, MainActivity2.class);
        startActivity(janela);
    }
}