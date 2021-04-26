package com.example.qiflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private TextView txtEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEntrar = findViewById(R.id.txtEntrar);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.txtEntrar:
                Intent janela = new Intent(this, ActivityLogin.class);
                startActivity(janela);
                break;
        }
    }
}