package com.example.idcard;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
public class SwitchAccounts extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_accounts);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Switch Account");
        View mImageView = findViewById(R.id.imageButton3);
        ImageView mImageButton3 = findViewById(R.id.imageButton3);
        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imageBotton3 = String.valueOf(mImageButton3.getVisibility());
                Intent intent = new Intent(SwitchAccounts.this,AddStudent.class);
                startActivity(intent);

            }
        });
    }
}


