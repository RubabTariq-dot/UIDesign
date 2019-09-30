package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Forgot_Password extends AppCompatActivity {


    TextView t1;
    TextView t2;
    TextView t3;

    EditText e1;

    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_forgot__password);
        super.onCreate(savedInstanceState);


         b1=findViewById(R.id.resetPass);
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(Forgot_Password.this,R.string.passReset,Toast.LENGTH_LONG).show();

             }
         });
    }
}
