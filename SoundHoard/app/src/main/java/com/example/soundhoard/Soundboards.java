package com.example.soundhoard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;

public class Soundboards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundboards);

        Explode explode = new Explode();
        explode.setDuration(1000);
        getWindow().setEnterTransition(explode);
    }
}
