package com.example.mygames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView btnJogoV, btnQuebra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogoV = findViewById(R.id.btnJogoV);
        btnQuebra = findViewById(R.id.btnQuebra);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnJogoV:
                Intent janelaV = new Intent(this, JogoVelha.class);
                startActivity(janelaV);
                break;

            case R.id.btnQuebra:
                Intent janelaQ = new Intent(this, Puzzle.class);
                startActivity(janelaQ);
                break;
        }
    }
}