package com.example.pm1_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText txtresultado1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        txtresultado1 = (EditText) findViewById(R.id.txtresultado);



        txtresultado1.setText(getIntent().getExtras().getString("resultado"));


    }
}