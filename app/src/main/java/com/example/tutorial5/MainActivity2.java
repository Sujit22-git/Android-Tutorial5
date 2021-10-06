package com.example.tutorial5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText fname,lname,email,pass;
    RadioGroup gender;
    RadioButton genderbtn;
    Switch branch;
    TextView stxt,sttxt;
    Spinner city;
    CheckBox status;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fname = findViewById(R.id.txtfname);
        lname = findViewById(R.id.txtlname);
        email = findViewById(R.id.txtemail);
        pass = findViewById(R.id.txtpassword);
        gender = findViewById(R.id.radioGender);
        branch = findViewById(R.id.switchBranch);
        stxt = findViewById(R.id.txtswitch);
        city = findViewById(R.id.spinnerCity);
        status = findViewById(R.id.status);
        sttxt = findViewById(R.id.txtchechbox);
        save = findViewById(R.id.btnsave);

        branch.setChecked(false);
        branch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean save) {
                if (save) {
                    stxt.setText("switchOn");
                } else {
                    stxt.setText("switchOff");
                }
            }
        });
        if (branch.isChecked()) {
            stxt.setText("switchOn");
        } else {
            stxt.setText("switchOff");
        }

        status.setChecked(false);
        status.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean save) {
                if (save) {
                    sttxt.setText("Checked");
                } else {
                    sttxt.setText("UnCheked");
                }
            }
        });
        if (status.isChecked()) {
            sttxt.setText("Checked");
        } else {
            sttxt.setText("UnCheked");
        }

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String f = fname.getText().toString();
                String l = lname.getText().toString();
                String e = email.getText().toString();
                String p = pass.getText().toString();

                int selectedId = gender.getCheckedRadioButtonId();
                genderbtn = (RadioButton)findViewById(selectedId);
                String g = genderbtn.getText().toString();

                String s = stxt.getText().toString();

                String c = city.getSelectedItem().toString();

                String st = sttxt.getText().toString();

                Intent i = new Intent(getApplicationContext(),MainActivity3.class);
                i.putExtra("fname",f);
                i.putExtra("lname",l);
                i.putExtra("email",e);
                i.putExtra("pass",p);
                i.putExtra("gender",g);
                i.putExtra("branch",s);
                i.putExtra("city",c);
                i.putExtra("status",st);
                startActivity(i);

            }
        });
    }
}