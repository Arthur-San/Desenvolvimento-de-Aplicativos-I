package com.example.qiflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qiflix.subMenu.MainOutros;


public class MainMenu extends AppCompatActivity {
    private ImageView ivPlay1, ivPlay2, ivPlay3, ivPlay4, ivPlay5;
    private TextView tvPoze, tvMessi, tvNegoNei, tvShrek, tvOutros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        getSupportActionBar().hide();

        tvPoze = findViewById(R.id.tvPoze);
        tvMessi = findViewById(R.id.tvMessi);
        tvNegoNei = findViewById(R.id.tvNegoNei);
        tvShrek = findViewById(R.id.tvShrek);
        tvOutros = findViewById(R.id.tvOutros);

        ivPlay1 = findViewById(R.id.ivPlay1);
        ivPlay2 = findViewById(R.id.ivPlay2);
        ivPlay3 = findViewById(R.id.ivPlay3);
        ivPlay4 = findViewById(R.id.ivPlay4);
        ivPlay5 = findViewById(R.id.ivPlay5);


        // Start Poze
        tvPoze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainPoze.class));
            }
        });

        ivPlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainPoze.class));

            }
        });

        // Start Messi
        tvMessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainMessi.class));
            }
        });

        ivPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainMessi.class));

            }
        });

        // Start Nego Nei
        tvNegoNei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainNegoNey.class));
            }
        });

        ivPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainNegoNey.class));

            }
        });

        // Start Shrek
        tvShrek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainShrek.class));
            }
        });

        ivPlay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainShrek.class));
            }
        });

        // Start Outros
        tvOutros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainOutros.class));
            }
        });

        ivPlay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MainOutros.class));
            }
        });

    }
}