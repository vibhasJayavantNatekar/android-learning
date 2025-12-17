package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    public TextView T1;
    public TextView T2;
    public  TextView T3;
    public EditText E1;
    public EditText E2;
    public EditText E3;
    public Button B1;
    public Button B2;
    public Button B3;
    public Button B4;

    public void sum(View v){
        E1 = findViewById(R.id.et1);
        E2 = findViewById(R.id.et2);
        E3 = findViewById(R.id.et3);
        int n1 = Integer.parseInt(E1.getText().toString());


        int n2 = Integer.parseInt(E2.getText().toString());

        int r = n1 + n2;
        E3.setText(
                "Sum = "+ r
        );


    }
    public void sub(View v){
        E1 = findViewById(R.id.et1);
        E2 = findViewById(R.id.et2);
        E3 = findViewById(R.id.et3);
        int n1 = Integer.parseInt(E1.getText().toString());

        int n2 = Integer.parseInt(E2.getText().toString());

        int r = n1 - n2;
        E3.setText("SubTraction :" + r);
    }

    public void mul(View v){
        E1 = findViewById(R.id.et1);
        E2 = findViewById(R.id.et2);
        E3 = findViewById(R.id.et3);
        int n1 = Integer.parseInt(E1.getText().toString());

        int n2 = Integer.parseInt(E2.getText().toString());

        int r = n1 * n2;
        E3.setText("Multiplication :" + r);
    }

    public void div(View v){
        E1 = findViewById(R.id.et1);
        E2 = findViewById(R.id.et2);
        E3 = findViewById(R.id.et3);
        int n1 = Integer.parseInt(E1.getText().toString());

        int n2 = Integer.parseInt(E2.getText().toString());

        int r = n1 / n2;
        E3.setText("Division :" + r);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}