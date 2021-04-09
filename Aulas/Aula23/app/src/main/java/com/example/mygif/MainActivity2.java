package com.example.mygif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resposta = findViewById(R.id.resposta);
        String recebe = getIntent().getStringExtra("dados");
        resposta.setText(recebe);
    }
}