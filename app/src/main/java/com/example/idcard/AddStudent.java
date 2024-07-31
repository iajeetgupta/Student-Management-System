package com.example.idcard;
import static androidx.constraintlayout.motion.widget.TransitionBuilder.validate;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
public class AddStudent extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add student");
        final EditText mNumberEt = findViewById(R.id.numberEt);
        final EditText mDateEt = findViewById(R.id.dateEt);
        Button mSaveBtn = findViewById(R.id.saveBtn);
        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                final EditText Number = findViewById(R.id.numberEt);
                final TextView DateofBirth = findViewById(R.id.dateEt);
                final Button LoginBtn = findViewById(R.id.saveBtn);
                LoginBtn.setOnClickListener(new View.OnClickListener() {
                    @Override

                    public void onClick(View v) {
                        validate(Number.getText().toString(),DateofBirth.getText().toString());
                    }
                    private void validate(String Number, String DateofBirth) {
                        if((Number.equals("210101120125")) && DateofBirth.equals("15/08/2004")){
                            Intent intent = new Intent(AddStudent.this, MainActivity.class);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(AddStudent.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}