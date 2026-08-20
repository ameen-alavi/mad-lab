package com.example.program4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, password;
    RadioGroup gender;
    CheckBox terms;
    Button submit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        gender = findViewById(R.id.gender);
        terms = findViewById(R.id.terms);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n = name.getText().toString();
                String p = password.getText().toString();

                if (n.isEmpty()) {
                    name.setError("Enter Name");
                }
                else if (p.isEmpty()) {
                    password.setError("Enter Password");
                }
                else if (gender.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(MainActivity.this,
                            "Select Gender",
                            Toast.LENGTH_SHORT).show();
                }
                else if (!terms.isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Accept the terms and conditions",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,
                            "Registration Successful",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}