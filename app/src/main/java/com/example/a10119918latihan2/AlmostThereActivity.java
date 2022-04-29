package com.example.a10119918latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 *
 * Tanggal Pengerjaan       : 29 April 2022
 * NIM                      : 10119918
 * Nama                     : Andreas Suryadi
 * Kelas                    : IF-10K
 *
 */

public class AlmostThereActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.almost_there);

        Button btnVerify= (Button) findViewById(R.id.btnverify);
        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AlmostThereActivity.this, VerifyActivity.class);
                startActivity(intent);
            }
        });
    }
}