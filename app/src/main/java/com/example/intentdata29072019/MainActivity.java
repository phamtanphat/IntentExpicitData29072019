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

import java.util.Observable;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString,btnIntentInteger;

    MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntentString = findViewById(R.id.buttonIntentString);
        btnIntentInteger = findViewById(R.id.buttonIntentInteger);
        mainViewModel.getButtonText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String text) {
                btnIntentInteger.setText(text + "");
            }
        });
        btnIntentString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Screen2Activity.class);
                intent.putExtra(Appconstant.KEY_STRING, "Xin chao");
                startActivity(intent);
            }
        });
        btnIntentInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Screen2Activity.class);
                intent.putExtra(Appconstant.KEY_INTEGER, 10);
                startActivity(intent);

            }
        });

    }


}
