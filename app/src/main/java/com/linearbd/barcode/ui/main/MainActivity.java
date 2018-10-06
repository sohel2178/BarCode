package com.linearbd.barcode.ui.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.linearbd.barcode.R;
import com.linearbd.barcode.ui.scanner.scanner.ScannerActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE=5000;

    Button btnStart;
    TextView tvData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.start);
        tvData = findViewById(R.id.data);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScannerActivity.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==REQUEST_CODE && resultCode==RESULT_OK){
            String val = data.getStringExtra("DATA");
            tvData.setText(val);
        }
    }
}
