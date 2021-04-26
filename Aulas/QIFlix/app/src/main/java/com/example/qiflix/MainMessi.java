package com.example.qiflix;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainMessi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_messi);
        getSupportActionBar().hide();

        VideoView vvmessi = findViewById(R.id.vvMessi);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.minimessi;
        Uri uri = Uri.parse(videoPath);
        vvmessi.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vvmessi.setMediaController(mediaController);
        mediaController.setAnchorView(vvmessi);

        vvmessi.start();
    }
}