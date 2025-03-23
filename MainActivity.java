package com.example.swiftpay;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    private EditText phone;
    private EditText password;
    private Button login;
    private CheckBox see;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone = (EditText) findViewById(R.id.editTextPhone);
        password = (EditText) findViewById(R.id.editTextTextPassword);
        login = (Button) findViewById(R.id.button);
        see = (CheckBox) findViewById(R.id.checkBox);


        see.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    password.setTransformationMethod(null);
                } else{
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String phone_number = phone.getText().toString();
                String pass = password.getText().toString();

                if(phone.getText().toString().equals("09604395716") && password.getText().toString().equals("123456")||phone.getText().toString().equals("09911854663") && password.getText().toString().equals("123456")){
                    Toast.makeText(MainActivity.this, "Login Successful",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                } else{
                    Toast.makeText(MainActivity.this, "Login Failed",Toast.LENGTH_SHORT).show();
                }
            }

        });


    }
}