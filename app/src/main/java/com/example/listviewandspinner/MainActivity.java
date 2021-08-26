package com.example.listviewandspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String course[] = {"Java", "Android", "IOS", "HTML", "CSS", "Kotlin", "Java", "Android", "IOS", "HTML", "CSS", "Kotlin", "Java", "Android", "IOS", "HTML", "CSS", "Kotlin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, course);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, course[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, UserActivity.class);
                intent.putExtra("KEY", course[position]);
                startActivity(intent);

            }
        });


    }


}