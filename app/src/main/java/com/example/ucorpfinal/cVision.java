package com.example.ucorpfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class cVision extends AppCompatActivity {
    Firebase ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_vision);
        getSupportActionBar().setTitle("Company Vision");

        final TextView myText =(TextView) findViewById(R.id.cVision);
        Firebase.setAndroidContext(getApplicationContext());

        ref=new Firebase("https://ucorp-b02a4.firebaseio.com/vision");

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String myChildText = dataSnapshot.getValue(String.class);
                myText.setText(myChildText);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                myText.setText("Veri Çekilemedi !");
            }
        });
    }
}
