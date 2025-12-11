package com.example.converter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public TextView tv4;
    public EditText et1;
    public Button button1;

    @Override

    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv4 = findViewById(R.id.tv4);
        et1 = findViewById(R.id.et1);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                String x = et1.getText().toString();
                int kg = Integer.parseInt(x);
                double pound = 2.205 * kg;
                tv4.setText("In Pound = " + pound);

            }
        });



    }
}