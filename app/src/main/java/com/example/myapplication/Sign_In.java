package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sign_In extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;

    Button b1;
    Button b2;

    EditText e1;
    EditText e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_sign__in);

        t1=(TextView)findViewById(R.id.welcomeBack);
        t2=(TextView)findViewById(R.id.email_);
        t3=(TextView)findViewById(R.id.password_);
        t4=(TextView)findViewById(R.id.f_pass);

        b1=(Button)findViewById(R.id.forgotPass_);
        b2=(Button)findViewById(R.id.signIn_);

        e1=(EditText)findViewById(R.id.scroll);
        e2=(EditText)findViewById(R.id.passwordIn_);

        super.onCreate(savedInstanceState);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToPass=new Intent(Sign_In.this,Forgot_Password.class);
                startActivity(goToPass);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomeScreen=new Intent(Sign_In.this,HomeScreen.class);
                startActivity(goToHomeScreen);
            }
        });

    }
}
