package com.example.ironmaiden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.ironmaiden.R;
import com.example.ironmaiden.atividade.MainActivity;

public class SplashScreen extends AppCompatActivity {
private MediaPlayer maiden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        maiden = MediaPlayer.create(this, R.raw.delilah);
        maiden.start();

        //ocultar a barra de ação do android e configurar a activity p tela cheia
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                finish();
                maiden.stop();
            }
        }, 3000);


    }
}