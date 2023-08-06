package com.techstudios.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText i1;
EditText i2;
EditText i3;
Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   i1 = (EditText) findViewById(R.id.editTextText);
   i2 = (EditText) findViewById(R.id.editTextText2);
   i3 = (EditText) findViewById(R.id.editTextText3);
        btn3 = (Button) findViewById(R.id.button);
        btn1 = (Button) findViewById(R.id.button2);
        btn2 = (Button) findViewById(R.id.button4);
        btn4 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            int ans = Integer.parseInt(i1.getText().toString()) + Integer.parseInt(i2.getText().toString());
            i3.setText(ans);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int ans = Integer.parseInt(i1.getText().toString()) * Integer.parseInt(i2.getText().toString());
                i3.setText(ans);
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int ans = Integer.parseInt(i1.getText().toString()) / Integer.parseInt(i2.getText().toString());
                i3.setText(ans);
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int ans = Integer.parseInt(i1.getText().toString()) - Integer.parseInt(i2.getText().toString());
                i3.setText(ans);
            }

        });

    }
}