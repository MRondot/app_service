package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.app_service.R;

public class ChoixReservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_reservation);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue3:
                Intent cDateRdv_intent = new Intent(ChoixReservation.this, DateRdv.class);
                startActivity(cDateRdv_intent);
                break;

        }
    }
}