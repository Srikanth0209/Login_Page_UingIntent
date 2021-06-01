package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText urname,urpass;
    Button clk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        urname = (EditText) findViewById(R.id.editTextTextPersonName3);
        urpass = (EditText) findViewById(R.id.editTextTextPassword);
        clk = (Button) findViewById(R.id.button);
    }
    public  void nextpage (View V){
        String stname = urname.getText().toString();
        String pass = urpass.getText().toString();
        if (stname.equals("318126511149") && pass.equals("anits123*")){
            Intent in = new Intent(MainActivity.this,MainActivity2.class);
            Bundle bundle=new Bundle();
            bundle.putString("urname",stname);
            in.putExtras(bundle);
            startActivity(in);
        }
        else if (!stname.equals("318126511149") || !pass.equals("anits123*")){
            Toast.makeText(getBaseContext(),"Enter Valid Username or Password",Toast.LENGTH_SHORT).show();
        }
    }
}