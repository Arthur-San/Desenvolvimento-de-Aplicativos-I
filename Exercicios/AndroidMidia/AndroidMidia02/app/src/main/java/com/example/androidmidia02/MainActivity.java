package com.example.androidmidia02;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView meuvideo = (VideoView)findViewById(R.id.videoView);

        String uri = "android.resource://" + getPackageName() + "/" + R.raw.video;

        if (meuvideo != null){
            meuvideo.setVideoURI(Uri.parse(uri));
            meuvideo.start();

            meuvideo.setMediaController(new MediaController(this));
        }

    }
}