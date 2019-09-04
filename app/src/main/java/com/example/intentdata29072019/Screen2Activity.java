package com.example.intentdata29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Timer;

public class Screen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        // 1 : Gui dang string
//        Intent intent = getIntent();
//        if (intent != null){
//            String value = intent.getStringExtra(Appconstant.KEY_STRING);
//            Log.d("BBB",value);
//
//        }
        //2 : Gui dang integer
//        Intent intent = getIntent();
//        if (intent != null){
//            Integer value = intent.getIntExtra(Appconstant.KEY_INTEGER,Integer.MIN_VALUE );
//            Log.d("BBB",value.toString());
//
//        }
        //3 : Gui dang string array
//        Intent intent = getIntent();
//        if (intent != null){
//            String[] value = intent.getStringArrayExtra(Appconstant.KEY_STRING_ARRAY);
//            Log.d("BBB",value.length + "");
//
//        }
        //4 : Gui du lieu dang string
//        Intent intent = getIntent();
//        if (intent != null){
//            Sinhvien value = (Sinhvien) intent.getSerializableExtra(Appconstant.KEY_OBJECT);
//            Log.d("BBB",value.getTen() + "");
//
//        }
        //5 : Gui du lieu dang arrayobject
        Intent intent = getIntent();
        if (intent != null){
            ArrayList<Sinhvien> value = intent.getParcelableArrayListExtra(Appconstant.KEY_ARRAY_OBJECT);
            Log.d("BBB",value.size() + "");

        }
    }
}
