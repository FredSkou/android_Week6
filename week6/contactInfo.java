package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contactInfo extends AppCompatActivity {

    Button toFrontPageButton;
    Button toAboutUsButton;

    public void toFrontpage(View view){
        toFrontPageButton = (Button) findViewById(R.id.contactInfotoFrontPageButton);
        Intent toFrontPage = new Intent(this,MainActivity.class);
        startActivity(toFrontPage);
    }
    public void toAboutUs(View view){
        toAboutUsButton = (Button) findViewById(R.id.contactInfotoAboutUsButton);
        Intent toAboutUs = new Intent(this,aboutUs.class);
        startActivity(toAboutUs);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);
    }
}
