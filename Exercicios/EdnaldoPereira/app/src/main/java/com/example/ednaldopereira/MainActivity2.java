package com.example.ednaldopereira;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView resultado, resposta;
    Button btnSociais, btnClipes, btnShows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultado = findViewById(R.id.resultado);
        btnSociais = findViewById(R.id.btnSociais);
        btnClipes = findViewById(R.id.btnClipes);
        btnShows = findViewById(R.id.btnShows);

        String resultado = getIntent().getStringExtra("dados");
        resposta.setText(resultado);

    }
}