package com.example.qiflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActivityLogin extends AppCompatActivity {
    private ImageView imgVoltar;
    private Button btnEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imgVoltar = findViewById(R.id.imgVoltar);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityLogin.this, MainMenu.class));
            }
        });
        imgVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityLogin.this, MainActivity.class));
            }
        });
    }
    /*
    private void onClick(View view){
        switch (view.getId()){
            case R.id.imgVoltar:
                Intent janelaV = new Intent(this, MainActivity.class);
                startActivity(janelaV);
                break;
        }
    }
*/


}