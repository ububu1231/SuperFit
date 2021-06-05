package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    private Timer mTimer;
    private MyTimerTask mMyTimerTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        mTimer = new Timer();
        mMyTimerTask = new MyTimerTask();
        mTimer.schedule(mMyTimerTask, 3000);
    }
    class MyTimerTask extends  TimerTask {
        @Override
        public void run() {
            mTimer.cancel();
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(getApplicationContext(),"Три секунды прошло", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Splash.this, Registration.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }
}