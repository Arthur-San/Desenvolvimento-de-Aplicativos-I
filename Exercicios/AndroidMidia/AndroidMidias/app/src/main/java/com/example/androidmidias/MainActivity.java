package com.example.androidmidias;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
//Passo 1 Declarar
private Button playBtn;
private SeekBar posicao;
MediaPlayer mp;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    //Passo 2 XML
    playBtn = findViewById(R.id.playBtn);

    //Passo 3 Mídia
    mp = MediaPlayer.create(this, R.raw.musica);
    posicao = findViewById(R.id.posicao);

    }

    //Passo 4 Método para executar o MP3
    public void playMusica (View view)
    {
        if(!mp.isPlaying())
        {
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);
        }
        else
        {
            mp.pause();
            playBtn.setBackgroundResource(R.drawable.play);
        }
    }
}