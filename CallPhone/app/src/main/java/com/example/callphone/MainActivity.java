package com.example.callphone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
  ImageButton Dial;
  static int PERMISSION_CODE = 100;
  @SuppressLint("MissingInFlatesId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Dial = findViewById(R.id.button);

        Dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(Intent.ACTION_CALL , Uri.parse("tel:+919503250265"));
                Intent i = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:+919503250265"));



                startActivity(i);
            }
        });
    }
}