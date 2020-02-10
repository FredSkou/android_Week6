package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class aboutUs extends AppCompatActivity {

    Button frontpageButton;
    Button contactButton;

    public void frontPage(View view){

        frontpageButton = (Button) findViewById(R.id.aboutUsFrontpageButton);
        Intent toFrontPage = new Intent(this,MainActivity.class);
        startActivity(toFrontPage);

    }
    public void contactPage(View view){
        contactButton = (Button) findViewById(R.id.aboutUstoContactInfoButton);
        Intent toContactPage = new Intent(this,contactInfo.class);
        startActivity(toContactPage);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }
}
