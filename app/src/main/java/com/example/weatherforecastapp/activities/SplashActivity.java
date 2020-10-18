package com.example.weatherforecastapp.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // To launch the Main Activity.
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        //finish();
    }
}
