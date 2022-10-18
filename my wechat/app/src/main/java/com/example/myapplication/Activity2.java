package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent4 = getIntent();
        Random r = new Random();
        int i = r.nextInt(200);
        intent4.putExtra("result", String.valueOf(i));
        setResult(2, intent4);
        finish();//结束MainActivity
    }
}