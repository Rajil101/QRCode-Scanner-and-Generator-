package com.example.qrcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button generateQRBtn,scanQRBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        generateQRBtn = findViewById(R.id.idBtnGenratorQR);
        scanQRBtn = findViewById(R.id.idBtnScanQR);

        generateQRBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(HomeActivity.this,GenerateQRCodeActivity.class);
                startActivity(i);
            }
        });
        scanQRBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(HomeActivity.this,ScanQRCodeActivity.class);
                startActivity(i);
            }
        });
    }
}