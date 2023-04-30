package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Activity1 extends AppCompatActivity {
    private EditText ipAddressEditText;
    private Button btn_enter;
    public static String ipAddress;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        ipAddressEditText=(EditText) findViewById(R.id.ip_address_value);
        btn_enter=(Button) findViewById(R.id.btnConnection);
        ipAddress=btn_enter.getText().toString();

        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this, Activity2.class);
                startActivity(intent);
            }

        });

    }

}
