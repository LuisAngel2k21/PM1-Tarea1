package com.example.pm1_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1, txtnum2;
    Button btnmostrar,btnsecond,btnsecond2,btnsecond3,btnsecond4;
    TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = (EditText) findViewById(R.id.txtnum1);
        txtnum2 = (EditText) findViewById(R.id.txtnum2);
        t1 = (TextView) findViewById(R.id.txtvsuma);
        t2 = (TextView) findViewById(R.id.txtvresta);
        t3 = (TextView) findViewById(R.id.txtvmult);
        t4 = (TextView) findViewById(R.id.txtvdiv);
        btnsecond = (Button) findViewById(R.id.btnsecond);
        btnsecond2 = (Button) findViewById(R.id.btnsecond2);
        btnsecond3 = (Button) findViewById(R.id.btnsecond3);
        btnsecond4 = (Button) findViewById(R.id.btnsecond4);



        btnsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String valor1= txtnum1.getText().toString();
               String valor2=txtnum2.getText().toString();

               int total = Integer.parseInt(valor1) + Integer.parseInt(valor2);

               String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);


            }
        });


        btnsecond2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1= txtnum1.getText().toString();
                String valor2=txtnum2.getText().toString();

                int total = Integer.parseInt(valor1) - Integer.parseInt(valor2);

                String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);
            }
        });



        btnsecond3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1= txtnum1.getText().toString();
                String valor2=txtnum2.getText().toString();

                int total = Integer.parseInt(valor1) * Integer.parseInt(valor2);

                String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);
            }
        });



        btnsecond4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1= txtnum1.getText().toString();
                String valor2=txtnum2.getText().toString();

                int total = Integer.parseInt(valor1) / Integer.parseInt(valor2);

                String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);
            }
        });

    }
}