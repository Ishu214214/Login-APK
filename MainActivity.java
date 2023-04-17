package com.example.eg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText usernames;
    EditText passwords;
    Button login;
    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernames=findViewById(R.id.username);
        passwords=findViewById(R.id.password);
        login=findViewById(R.id.button);
      msg=findViewById(R.id.msgs);


    }

    public void login(View view){

        String uname=usernames.getText().toString();
        String pass =passwords.getText().toString();
        if(uname.equals("ishu") && pass.equals("ishu")){
            msg.setText(("login fail"));
        Intent obj=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(obj);
        }
        else{
            msg.setText(("login fail"));
        }
    }




}