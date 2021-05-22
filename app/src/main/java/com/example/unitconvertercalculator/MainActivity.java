package com.example.unitconvertercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText kgInput;
    private TextView poundOutput;
    private Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kgInput = findViewById(R.id.editTextTextPersonName4);
        poundOutput = findViewById(R.id.textView7);
        convertButton = findViewById(R.id.button2);
        convert();
    }

    private void convert() {
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Convert Button clicked", Toast.LENGTH_SHORT).show();
                Double kg = Double.parseDouble(kgInput.getText().toString());
                Double pound = kg * 2.20462;
                poundOutput.setText(pound.toString());
            }
        });
    }
}