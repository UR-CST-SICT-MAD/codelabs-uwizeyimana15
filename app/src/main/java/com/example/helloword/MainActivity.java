package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity","Activity created");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity","Activity paused");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity","Activity resumed");
    }
}
