package com.example.erick.foodtracker;

import android.app.Application;

import com.firebase.client.Firebase;

public class CustomApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
