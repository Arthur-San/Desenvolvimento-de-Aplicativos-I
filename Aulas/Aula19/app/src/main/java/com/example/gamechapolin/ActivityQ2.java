package com.example.gamechapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityQ2 extends AppCompatActivity {
    Button btnOpcao1Q2, btnOpcao2Q2;
    TextView txtPontosQ2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        btnOpcao1Q2 = findViewById(R.id.btnOpcao1Q2);
        btnOpcao2Q2 = findViewById(R.id.btnOpcao2Q2);
        txtPontosQ2 = findViewById(R.id.txtPontosQ2);
        //txtPontosQ2.setText("Pontos Atuais: " + MainActivity.acertos ++);

        btnOpcao1Q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirQ3();
            }
        });

        btnOpcao2Q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirQ3();
            }
        });

    }

    private void AbrirQ3(){
        Intent janelaQ3 = new Intent(this, ActivityQ3.class);
        startActivity(janelaQ3);
        finish();
    }

    //desativar botão para retornar tudo
    //com sobreescrito para anular uma possível volta sem reiniciar o jogo
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Você não pode voltar!", Toast.LENGTH_LONG).show();
    }


}