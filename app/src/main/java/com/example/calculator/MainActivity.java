package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0;
    Button numzarb,nummenha,numejame,nummosavi,nemtaghsim,numbaghimandh,numC,nemnohgte;
    TextView inputText,Outputtxt;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Outputtxt =findViewById(R.id.Outputtxt);
        inputText =findViewById(R.id.inputText);

        num0 =findViewById(R.id.num0);
        num1 =findViewById(R.id.num1);
        num2 =findViewById(R.id.num2);
        num3 =findViewById(R.id.num3);
        num4 =findViewById(R.id.num4);
        num5 =findViewById(R.id.num5);
        num6 =findViewById(R.id.num6);
        num7 =findViewById(R.id.num7);
        num8 =findViewById(R.id.num8);
        num9 =findViewById(R.id.num9);

        numzarb =findViewById(R.id.numzarb);
        nummenha =findViewById(R.id.nummenha);
        numejame =findViewById(R.id.numjame);
        nummosavi =findViewById(R.id.nummosavi);
        nemtaghsim =findViewById(R.id.nemtaghsim);
        numbaghimandh =findViewById(R.id.numbaghimandh);
        numC =findViewById(R.id.numC);
        nemnohgte =findViewById(R.id.nemnohgte);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"0");
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"9");
            }
        });

        nummenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"-");
            }
        });
        numejame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"+");
            }
        });
        nemtaghsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"/");
            }
        });
        numbaghimandh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"%");
            }
        });
        nemnohgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+".");
            }
        });
        numzarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();
                inputText.setText(data+"*");
            }
        });

        nummosavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputText.getText().toString();


            }
        });

    }
}
