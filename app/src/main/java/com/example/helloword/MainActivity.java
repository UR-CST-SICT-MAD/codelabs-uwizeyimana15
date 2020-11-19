package com.example.helloword;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  Button cancel,allow;
    private TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity","Activity created");
        cancel = findViewById(R.id.button);
        allow = findViewById(R.id.button2);
        display = findViewById(R.id.textView1);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("Operation Cancel");
            }
        });
        allow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("message","Operation Allowed");
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String backMessage = data.getStringExtra("back");
        display.setText(backMessage);
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
