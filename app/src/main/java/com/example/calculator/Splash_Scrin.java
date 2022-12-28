package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Scrin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_scrin);

        Handler handler;

        handler=new Handler();
        handler.postDelayed(() -> {
            Intent intent=new Intent(Splash_Scrin.this,MainActivity.class);
            startActivity(intent);
            finish();
        },2000);
    }
}