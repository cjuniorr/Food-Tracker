package com.example.erick.foodtracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Handler;


public class SplashActivity extends AppCompatActivity implements Runnable {

    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        Handler handler = new Handler();
        handler.postDelayed(this, 4000);
    }


    @Override
    public void run() {
        startActivity(new Intent(this,LoginActivity.class));
        finish();
    }
}