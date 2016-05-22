package com.example.erick.foodtracker.domain;

import android.content.Context;
import com.example.erick.foodtracker.domain.util.CryptWithMD5;
import com.example.erick.foodtracker.domain.util.LibraryClass;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.firebase.client.Firebase;

@JsonIgnoreProperties({"id", "password"})
public class User {
    public static String TOKEN = "com.example.erick.foodtracker,domain.User.TOKEN";

    private String id;
    private String name;
    private String email;
    private String password;


    public User(){}


    public String getId() { return id; }

    public void setId(String id) { this.id = id;}


    public String getName() { return name; }

    public void setName(String name) { this.name =name; }


    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }


    public String getPassword() { return  password; }

    public void setPassword(String password) { this.password = password; }

    public void generateCryptPassword() { password = CryptWithMD5.cryptWithMD5(password); }



    public void saveTokenSP(Context context, String token ){
        LibraryClass.saveSP( context, TOKEN, token );
    }

    public String getTokenSP(Context context ){
        String token = LibraryClass.getSP( context, TOKEN);
        return ( token );
    }


    public void saveDB(){
        Firebase firebase = LibraryClass.getFirebase();
        firebase = firebase.child("users").child( getId() );

        firebase.setValue(this);
    }
}
