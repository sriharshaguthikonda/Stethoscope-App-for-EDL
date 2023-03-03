package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String NAME = "NAME";
    public static final String AGE = "AGE";
    public static final String PHONE = "PHONE";

    private TextView nameText, ageText, phoneText;
    private String name, age, phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nameText = findViewById(R.id.mName);
        ageText = findViewById(R.id.mAge);
        phoneText = findViewById(R.id.mPhone);

        Intent i = getIntent();
        name = i.getStringExtra(NAME);
        age = i.getStringExtra(AGE);
        phone = i.getStringExtra(PHONE);

        nameText.setText("Hi "+name);
        ageText.setText("Your age:  "+age);
        phoneText.setText("Your contact:  "+phone);
    }
}