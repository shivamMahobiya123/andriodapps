package com.example.allone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.Toast;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_splashscreen);
        Handler hd=new Handler();
        hd.postDelayed(new Runnable() {
            @Override
            public void run() {

               Intent i= new Intent(splashscreen.this,MainActivity.class);
               startActivity(i);
               finish();
            }
        },3000);

        Toast.makeText(getApplicationContext(),"Loading..",Toast.LENGTH_SHORT).show();

    }
}