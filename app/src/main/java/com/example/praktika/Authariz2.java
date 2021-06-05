package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Authariz2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authariz2);
    }    public void goToAthoriz1From2 (View v)
    {
        Intent intent = new Intent(Authariz2.this, Authariz1.class);
        startActivity(intent);
    }
}