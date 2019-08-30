package com.example.intentdata29072019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Observable;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString,btnIntentInteger,btnIntentStringArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntentString = findViewById(R.id.buttonIntentString);
        btnIntentInteger = findViewById(R.id.buttonIntentInteger);
        btnIntentStringArray = findViewById(R.id.buttonIntentStringArray);

        btnIntentString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendValueIntent(Appconstant.KEY_STRING,"Xin chao");
            }
        });
        btnIntentInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               sendValueIntent(Appconstant.KEY_INTEGER,10);
            }
        });
    }
    //generic
    private <T> void sendValueIntent(String key,T value){
        Intent intent = new Intent(MainActivity.this, Screen2Activity.class);
        if (value instanceof String){
            //convert gia tri nhanh thong qua type casting
            intent.putExtra(key,(String) value);
        }
        if (value instanceof Integer){
            intent.putExtra(key,(Integer) value);
        }
        startActivity(intent);
    }



}
