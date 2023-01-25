package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class logoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_page);


        //here we created handler object
        // it consis of two parameters
        // after finishing second parameter
        // it will execute second parameter
        // thing

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(logoPage.this,Home.class);
                startActivity(intent);
            }
        },3000);   // second in milisecond

    }
}