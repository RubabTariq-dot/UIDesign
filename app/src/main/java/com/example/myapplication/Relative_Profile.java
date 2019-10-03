package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Relative_Profile extends AppCompatActivity {

    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative__profile);
        b2 = (Button)findViewById(R.id.logout2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent goToMain = new Intent(Relative_Profile.this, MainActivity.class);
                startActivity(goToMain);
            }
        });
    }
}
