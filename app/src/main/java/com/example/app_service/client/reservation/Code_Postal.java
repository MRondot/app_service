package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.app_service.R;

public class Code_Postal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_postal);


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue:
                Intent cEntreprise_intent = new Intent(Code_Postal.this, ChoixEntreprise.class);
                startActivity(cEntreprise_intent);
                break;

        }
    }
}