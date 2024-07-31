package com.example.idcard;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Home");
        Intent intent = getIntent();
        String number = intent.getStringExtra("NUMBER");
        String date = intent.getStringExtra("DATE");
        final ImageButton mImageButton = findViewById(R.id.imageButton10);
        ImageButton mImageButton10 = findViewById(R.id.imageButton10);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imageButton10 = String.valueOf(mImageButton10.getVisibility());
                Intent intent = new Intent(MainActivity.this,SwitchAccounts.class);
                startActivity(intent);

            }
        });
    }
}