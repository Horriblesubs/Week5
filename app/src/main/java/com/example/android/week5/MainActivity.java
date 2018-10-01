package com.example.android.week5;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("aaa", "test onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("aaab", "test onStart()");
    }

    public void show(View v){
        //Toast.makeText(this, "4ITB is the most bestest...",Toast.LENGTH_LONG).show();
        Snackbar.make(v,"ok", Snackbar.LENGTH_LONG).show();
    }
}
