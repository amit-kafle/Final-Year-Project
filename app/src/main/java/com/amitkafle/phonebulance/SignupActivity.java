package com.amitkafle.phonebulance;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignupActivity extends Activity {
    EditText fname, lname, password, contact,email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        fname=(EditText) findViewById(R.id.fname);
        lname=(EditText) findViewById(R.id.lname);
        password= (EditText)findViewById(R.id.passwordEt);
        email=(EditText) findViewById(R.id.email);
        contact=(EditText) findViewById(R.id.contact);

    }
  public void userReg(View view)
  {
      String str_fname=fname.getText().toString();
      String str_lname=lname.getText().toString();
      String str_password=password.getText().toString();
      String str_email=email.getText().toString();
      String str_contact=contact.getText().toString();
      String type ="register";
      BackgroundTask backgroundTask = new BackgroundTask(this);
      backgroundTask.execute(type,str_fname,str_lname,str_password,str_contact,str_email);
      finish();
  }
}
