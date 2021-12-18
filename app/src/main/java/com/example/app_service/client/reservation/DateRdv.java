package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.app_service.R;

import java.util.Date;

public class DateRdv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_rdv);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue4:
                Intent cHoraireRdv_intent = new Intent(DateRdv.this, HoraireRdv.class);
                startActivity(cHoraireRdv_intent);
                break;
        }
    }
}