package com.example.qiflix;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainShrek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shrek);

        getSupportActionBar().hide();

        VideoView vvShrek = findViewById(R.id.vvShrek);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.shrek;
        Uri uri = Uri.parse(videoPath);
        vvShrek.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vvShrek.setMediaController(mediaController);
        mediaController.setAnchorView(vvShrek);

        vvShrek.start();
    }
}