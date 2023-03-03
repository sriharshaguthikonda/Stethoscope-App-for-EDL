package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private EditText nameText, ageText, phoneText;
    private Button enterbtn;
    private String name, age, phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TextView name =(TextView) findViewById(R.id.name);
        TextView age =(TextView) findViewById(R.id.mage);
        TextView phone =(TextView) findViewById(R.id.mphone);


        MaterialButton enterbtn = (MaterialButton) findViewById(R.id.enterbtn);*/
        nameText = findViewById(R.id.mname);
        ageText = findViewById(R.id.mage);
        phoneText = findViewById(R.id.mphone);
        enterbtn = findViewById(R.id.enterbtn);

        // Once user enters details

        enterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(name.getText().toString().isEmpty() || age.getText().toString().isEmpty() || phone.getText().toString().isEmpty())  {
                    //Incorrect
                    Toast.makeText(MainActivity.this, "Please enter the details", Toast.LENGTH_SHORT).show();

                }
                else
                    //correct
                    Toast.makeText(MainActivity.this, "Login success", Toast.LENGTH_SHORT).show();
                    sendData();*/
                sendData();
            }
        });
    }
    public void sendData()
    {
        name = nameText.getText().toString().trim();
        age = ageText.getText().toString().trim();
        phone = phoneText.getText().toString().trim();

        Intent i = new Intent(MainActivity.this, SecondActivity.class);

        i.putExtra(SecondActivity.NAME,name);
        i.putExtra(SecondActivity.AGE,age);
        i.putExtra(SecondActivity.PHONE,phone);


        startActivity(i);
    }
}