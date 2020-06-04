package com.example.lifecyclecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("NISH","onCreate was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("NISH","onRestart was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("NISH","onPause was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("NISH","onResume was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("NISH","onDestroy was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("NISH","onStop was called");
    }
}
