package com.example.primeraentrega;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resetNumber(findViewById(R.id.textNumber)); // esta bien hacer esto? No iniciaba como solo lectura el campo si no.
    }

    public void incrementarNumber(View view) {
        TextView numberView = findViewById(R.id.textNumber);
        number = number + 1;
        numberView.setText(String.valueOf(number));
        System.out.println(number);
    }


    public void resetNumber(View view) {
        TextView numberView = findViewById(R.id.textNumber);
        number = 0;
        numberView.setText(String.valueOf(number));
        System.out.println("Reset: " +number);
    }

}

