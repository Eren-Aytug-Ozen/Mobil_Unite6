package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import uyg3.Uyg3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void uyg1(View view) {
        Intent i = new Intent(MainActivity.this, Uyg1goster.class);
        startActivity(i);
    }
    public void uyg2(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2goster.class);
        startActivity(i);
    }
    public void uyg3(View view) {
        Intent i = new Intent(MainActivity.this, Uyg3goster.class);
        startActivity(i);
    }
    public void uyg4(View view) {
        Intent i = new Intent(MainActivity.this, Uyg4goster.class);
        startActivity(i);
    }
}