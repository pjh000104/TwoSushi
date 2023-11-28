package com.example.twosushi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        Button bt2people = findViewById(R.id.bt2people);
        bt2people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivityHome.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button bt3people = findViewById(R.id.bt3people);
        bt3people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivityHome.this,MainActivity3people.class);
                startActivity(intent);
            }
        });
    }
}