package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class Question_2 extends AppCompatActivity {
    CheckBox checkBox4, checkBox5;
    Button button4;
    ArrayList<String> result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_2);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       checkBox4 = findViewById(R.id.checkBox4);
       checkBox5 = findViewById(R.id.checkBox5);
       button4 = findViewById(R.id.button4);
       result = new ArrayList<>();
       checkBox4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(checkBox4.isChecked())
                   result.add("Oui");
               else
                   result.remove("Oui");
           }
       });
       checkBox5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (checkBox5.isChecked())
                   result.add("Non");
               else
                   result.remove("Non");
           }
       });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Question_2.this, Question_3.class);
                startActivity(intent);
            }
        });

    }
}