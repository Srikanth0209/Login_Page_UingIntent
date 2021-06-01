package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text1 = (TextView) findViewById(R.id.textView6);
        Bundle bundle = getIntent().getExtras();
        String d = bundle.getString("urname");
        text1.setText(d);
    }
}