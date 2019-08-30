package com.example.intentdata29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString,btnIntentInteger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntentString = findViewById(R.id.buttonIntentString);
        btnIntentInteger = findViewById(R.id.buttonIntentInteger);

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
