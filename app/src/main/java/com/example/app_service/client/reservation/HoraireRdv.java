package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.app_service.R;

public class HoraireRdv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horaire_rdv);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue5:
                Intent cDateRdv_intent = new Intent(HoraireRdv.this, DateRdv.class);
                startActivity(cDateRdv_intent);
                break;

        }
    }
}