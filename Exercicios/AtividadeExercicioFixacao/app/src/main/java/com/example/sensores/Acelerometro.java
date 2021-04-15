package com.example.sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Acelerometro extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    private boolean isColor = false;
    private TextView respostab;
    private long ultimaAtualizacao;
    Button btnVoltarAcele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acelerometro);

        respostab = findViewById(R.id.respostab);
        respostab.setBackgroundColor(Color.rgb(246,220,220));
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        ultimaAtualizacao = System.currentTimeMillis();
        btnVoltarAcele = findViewById(R.id.btnVoltarAcele);

        btnVoltarAcele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltar();
            }
        });

    }


    private void abrirVoltar(){
        Intent janelavoltar = new Intent(this, MainActivity.class);
        startActivity(janelavoltar);

    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER){
            getAccelerometer(event);
        }
    }

    private void getAccelerometer(SensorEvent event){
        float[] values = event.values;
        //movimento
        float x = values[0];
        float y = values[1];
        float z = values[2];

        float accelationSquareRoot = (x * x + y * y + z *z)/(SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);
        long tempoAtual = System.currentTimeMillis();

        //Toast.makeText(getApplicationContext(), String.valueOf(accelationSquareRoot) + " " + SensorManager.GRAVITY_EARTH, Toast.LENGTH_SHORT).show();

        if(accelationSquareRoot >=2){
            if(tempoAtual - ultimaAtualizacao < 200){
                return;
            }
            ultimaAtualizacao = tempoAtual;
            if (isColor){
                respostab.setBackgroundColor(Color.parseColor("#6A5ACD"));
            }else{
                respostab.setBackgroundColor(Color.parseColor("#87CEFA"));
            }
            isColor = !isColor;
        }
    }

    @Override
    protected void onResume() {
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
        super.onResume();
    }

    @Override
    protected void onPause() {
        sensorManager.unregisterListener(this);
        super.onPause();
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}