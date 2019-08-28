package com.example.intentdata29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.Timer;

public class Screen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        // 1 : Gui dang string
        Intent intent = getIntent();
        if (intent != null){
            String value = intent.getStringExtra(Appconstant.KEY_STRING);
            Log.d("BBB",value);

        }
    }
}
