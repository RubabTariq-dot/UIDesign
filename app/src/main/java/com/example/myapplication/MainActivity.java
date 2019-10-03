package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ui.main.Frag_Home;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;

    Button b1;
    Button b2;

    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;

    ImageView logo;
    CheckBox viewPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);
         t1 = (TextView) findViewById(R.id.conPassword);
         t2 =  (TextView) findViewById(R.id.Email);
         t3 =  (TextView) findViewById(R.id.FullName);
         t4 =  (TextView) findViewById(R.id.Password);
         t5 =  (TextView) findViewById(R.id.oldAcc);

         b1 = (Button)findViewById(R.id.signIn);
         b2 = (Button)findViewById(R.id.signUp);

         e1 = (EditText)findViewById(R.id.conPasswordIn);
         e2 = (EditText)findViewById(R.id.passwordIn);
         e3 = (EditText)findViewById(R.id.fullNameIn);
         e4 = (EditText)findViewById(R.id.emailIn);


        super.onCreate(savedInstanceState);

        viewPass = (CheckBox) findViewById(R.id.passCheck);
        viewPass.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (!isChecked) {
                    e2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    e1.setTransformationMethod(PasswordTransformationMethod.getInstance());

                } else {
                    e2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    e1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSignIn=new Intent(MainActivity.this,SignIn.class);
                startActivity(goToSignIn);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomeScreen=new Intent(MainActivity.this, HomeScreen.class);
                startActivity(goToHomeScreen);
            }
        });
        }

    }

