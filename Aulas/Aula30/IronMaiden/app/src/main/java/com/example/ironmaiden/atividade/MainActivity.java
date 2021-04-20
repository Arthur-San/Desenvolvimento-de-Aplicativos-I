package com.example.ironmaiden.atividade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ironmaiden.R;
import com.example.ironmaiden.fragmento.AlbumFragment;
import com.example.ironmaiden.fragmento.MusicFragment;

import static com.example.ironmaiden.R.*;
import static com.example.ironmaiden.R.raw.musica;

public class MainActivity extends AppCompatActivity {

    private Button btnAlbum, btnMusica, btnPause;
    private AlbumFragment albumFragment;
    private MusicFragment musicFragment;
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        btnAlbum = findViewById(id.btnAlbum);
        btnMusica = findViewById(id.btnMusica);
        btnPause = findViewById(R.id.btnPause);
        mp = MediaPlayer.create(this, R.raw.musica);


        btnAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                albumFragment = new AlbumFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(id.frame_conteudo, albumFragment);
                transaction.commit();
                mp.stop();
            }
        });

        btnMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicFragment = new MusicFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(id.frame_conteudo, musicFragment);
                transaction.commit();
                mp.start();

            }
        });




    }
}