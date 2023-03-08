package com.example.taller3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.taller3.fibonacci.Fibonacci;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    Fibonacci fibo = new Fibonacci();

    private Button calculateBtn;
    private TextInputEditText inputText;
    private TextView resultFibonacci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculateBtn = findViewById(R.id.calculateBtn);
        inputText = findViewById(R.id.inputTakeText);
        resultFibonacci = findViewById(R.id.resFibo);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(inputText.getText().toString());
                resultFibonacci.setText(String.valueOf(fibo.calculateFibonacci(num)));
                inputText.setText("");
            }
        });
    }
}