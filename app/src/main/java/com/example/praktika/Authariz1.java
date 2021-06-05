package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Authariz1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authariz1);
    }
    public void goToAuthoriz2 (View v)
    {
        Intent intent = new Intent(Authariz1.this, Authariz2.class);
        startActivity(intent);
    }
    public void goToRegistration (View v)
    {
        Intent intent = new Intent(Authariz1.this, Registration.class);
        startActivity(intent);
    }
}