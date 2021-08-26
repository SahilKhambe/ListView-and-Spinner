package com.example.listviewandspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        textview = findViewById(R.id.txt_value1);
        Intent intent = getIntent();
        String DATA = intent.getStringExtra("Key");
        textview.setText(DATA);


    }
}