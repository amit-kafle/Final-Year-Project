package com.amitkafle.phonebulance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
EditText phonee,passwordet;
Button signin;
TextView signup;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        phonee = findViewById(R.id.phone);
        passwordet = findViewById(R.id.password);
        signin = findViewById(R.id.signin);
        signup=findViewById(R.id.signupa);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,SignupActivity.class));
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });
    }
    public void userLogin(View view){

        String phoneee=phonee.getText().toString();
        String passsword=passwordet.getText().toString();
        String type= "Login";
        BackgroundTask backgroundTask= new BackgroundTask(this);
        backgroundTask.execute(type,phoneee,passsword);
    }

    public void openRegisterActivity(View view) {
    startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
