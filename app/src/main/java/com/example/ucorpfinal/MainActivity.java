package com.example.ucorpfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    Button btnHistory, btnVision,btnSupport, btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHistory = (Button)findViewById(R.id.cHistory);
        btnHistory.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cHistory.class);
                startActivity(intent);
            }
        });

        btnVision = (Button)findViewById(R.id.cVision);
        btnVision.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cVision.class);
                startActivity(intent);
            }
        });

        btnSupport = (Button)findViewById(R.id.cSupport);
        btnSupport.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cSupport.class);
                startActivity(intent);
            }
        });

        btnMap = (Button)findViewById(R.id.cContact);
        btnMap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cMap.class);
                startActivity(intent);
            }
        });

    }
}
