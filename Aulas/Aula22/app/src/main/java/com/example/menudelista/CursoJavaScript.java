package com.example.menudelista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CursoJavaScript extends AppCompatActivity {
    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso_java_script);

        btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarMenu();
            }
        });

    }

    private void voltarMenu() {
        Intent janelaVoltar = new Intent(this, MainActivity.class);
        startActivity(janelaVoltar);
        finish();
    }
}