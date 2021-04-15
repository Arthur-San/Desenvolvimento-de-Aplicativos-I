package com.example.sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    Button btnVoltarAlarm;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        btnVoltarAlarm = findViewById(R.id.btnVoltarAlarm);

        mp = MediaPlayer.create(this, R.raw.musica);
        mp.start();

        btnVoltarAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltar();
            }
        });

    }

    public void voltar(){
        Intent janelaV = new Intent(this, SensorProximidade.class);
        startActivity(janelaV);
        mp.stop();
    }

}