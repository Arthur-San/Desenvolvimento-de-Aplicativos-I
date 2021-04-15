package com.example.meuslinks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFacebook, btnYoutube;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFacebook = findViewById(R.id.btnFacebook);
        btnYoutube = findViewById(R.id.btnYoutube);

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirFacebook();
            }
        });

        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirYoutube();
            }
        });

    }



    public void abrirFacebook()
    {
        Intent janelaFacebook = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(janelaFacebook);
    }

    public void abrirYoutube()
    {
        Intent janelaYoutube = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
        startActivity(janelaYoutube);
    }

}