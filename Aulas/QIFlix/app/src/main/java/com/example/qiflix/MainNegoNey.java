package com.example.qiflix;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainNegoNey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nego_ney);

        getSupportActionBar().hide();

        VideoView vvnegoney = findViewById(R.id.vvnegoney);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.negoney;
        Uri uri = Uri.parse(videoPath);
        vvnegoney.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vvnegoney.setMediaController(mediaController);
        mediaController.setAnchorView(vvnegoney);

        vvnegoney.start();

    }

}