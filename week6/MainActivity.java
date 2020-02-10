package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    public void aboutUs(View view){

        button =(Button) findViewById(R.id.aboutUsFrontpageButton);
        Intent intent = new Intent(this,aboutUs.class);
        startActivity(intent);



        EditText nameFrontPage = (EditText) findViewById(R.id.nameFrontPage);
        Toast.makeText(this,"Welcome "+nameFrontPage.getText().toString(),Toast.LENGTH_LONG).show();
        //Logs the action in the Log, not the most important thing in the world.
        //Mostly for test purposes.
        Log.i("info","aboutUs Button Pressed from Frontpage");
        Log.i("Values", nameFrontPage.getText().toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
