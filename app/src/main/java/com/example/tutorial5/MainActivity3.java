package com.example.tutorial5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView f,l,e,p,g,b,c,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        f = findViewById(R.id.fname);
        l = findViewById(R.id.lname);
        e = findViewById(R.id.email);
        p = findViewById(R.id.pass);
        g = findViewById(R.id.gender);
        b = findViewById(R.id.branch);
        c = findViewById(R.id.city);
        s = findViewById(R.id.status);

        String s1 = getIntent().getStringExtra("fname");
        f.setText("First Name : " + s1);
        String s2 = getIntent().getStringExtra("lname");
        l.setText("Last Name : " + s2);
        String s3 = getIntent().getStringExtra("email");
        e.setText("Username : " + s3);
        String s4 = getIntent().getStringExtra("pass");
        p.setText("Password : " + s4);
        String s5 = getIntent().getStringExtra("gender");
        g.setText("Gender : " + s5);
        String s6 = getIntent().getStringExtra("branch");
        b.setText("Branch : " + s6);
        String s7 = getIntent().getStringExtra("city");
        c.setText("City : " + s7);
        String s8 = getIntent().getStringExtra("status");
        s.setText("Status : " + s8);

    }
}