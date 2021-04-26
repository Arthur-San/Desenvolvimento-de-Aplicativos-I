package com.example.qiflix;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainPoze extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_poze);

        getSupportActionBar().hide();

        VideoView vvpoze = findViewById(R.id.vvpoze);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.poze;
        Uri uri = Uri.parse(videoPath);
        vvpoze.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vvpoze.setMediaController(mediaController);
        mediaController.setAnchorView(vvpoze);

        vvpoze.start();

    }
}