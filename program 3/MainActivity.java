package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a = Double.parseDouble(num1.getText().toString());
                double b = Double.parseDouble(num2.getText().toString());

                double result = a + b;

                Toast.makeText(MainActivity.this,
                        "Result = " + result,
                        Toast.LENGTH_SHORT).show();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a = Double.parseDouble(num1.getText().toString());
                double b = Double.parseDouble(num2.getText().toString());

                double result = a - b;

                Toast.makeText(MainActivity.this,
                        "Result = " + result,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a = Double.parseDouble(num1.getText().toString());
                double b = Double.parseDouble(num2.getText().toString());

                double result = a * b;

                Toast.makeText(MainActivity.this,
                        "Result = " + result,
                        Toast.LENGTH_SHORT).show();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a = Double.parseDouble(num1.getText().toString());
                double b = Double.parseDouble(num2.getText().toString());

                if (b == 0) {
                    Toast.makeText(MainActivity.this,
                            "Cannot divide by zero",
                            Toast.LENGTH_SHORT).show();
                } else {
                    double result = a / b;

                    Toast.makeText(MainActivity.this,
                            "Result = " + result,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}