package com.example.erick.foodtracker.domain.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.firebase.client.Firebase;

public class LibraryClass {
    public static String PREF = "com.example.erick.foodtracker.PREF";
    public static Firebase firebase;


    private LibraryClass(){}

    public static Firebase getFirebase(){
        if ( firebase == null ){
            firebase = new Firebase("https://tst-e.firebaseio.com/");
        }
        return ( firebase );
    }

    static public void saveSP(Context context, String key, String value ){
        SharedPreferences sp = context.getSharedPreferences(PREF, Context.MODE_PRIVATE);
        sp.edit().putString(key, value).apply();
    }

    static public String getSP(Context context, String key ){
        SharedPreferences sp = context.getSharedPreferences(PREF, Context.MODE_PRIVATE);
        String token = sp.getString(key, "");
        return( token );
    }
}