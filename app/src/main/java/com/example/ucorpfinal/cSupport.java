package com.example.ucorpfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class cSupport extends AppCompatActivity {
    private Firebase Ref;
    private EditText username, feedback,mail,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_support);
        getSupportActionBar().setTitle("Support Form");
        username=(EditText)findViewById(R.id.username);
        feedback=(EditText)findViewById(R.id.feedback);
        mail=(EditText)findViewById(R.id.email);
        number=(EditText)findViewById(R.id.number);

        Firebase.setAndroidContext(this);
        Ref=new Firebase("https://ucorp-b02a4.firebaseio.com/");
    }

    public void feedbacksent (View view){

        String usernameinput=username.getText().toString();
        String feedbackinput=feedback.getText().toString();
        String mailinput=mail.getText().toString();
        String numberinput=number.getText().toString();

        Firebase Reusername=Ref.child("Username").push();
        Reusername.setValue(usernameinput);

        Firebase Refeedback=Ref.child("Feedback").push();
        Refeedback.setValue(feedbackinput);

        Firebase Remail=Ref.child("Mail").push();
        Remail.setValue(mailinput);

        Firebase Renumber=Ref.child("Number").push();
        Renumber.setValue(numberinput);

        username.setText("");
        feedback.setText("");
        mail.setText("");
        number.setText("");

        username.requestFocus();

        Toast.makeText(getApplicationContext(),"We Saved Your Message Thank You !",Toast.LENGTH_LONG).show();
    }
}