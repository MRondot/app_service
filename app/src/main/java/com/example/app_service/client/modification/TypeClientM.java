package com.example.app_service.client.modification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.app_service.R;

public class TypeClientM extends AppCompatActivity {

    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_client_m);
        extras = getIntent().getExtras();


    }
}