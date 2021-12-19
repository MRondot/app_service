package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.app_service.R;

public class ChoixEntreprise extends AppCompatActivity {

    String Etest="Entreprise Test";
    Bundle bun = new Bundle();
    Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_entreprise);
        extras = getIntent().getExtras();

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue2:

                bun.putString("Entreprise", Etest);
                bun.putString("codeP",extras.getString("codeP"));
                Intent cReservation_intent = new Intent(ChoixEntreprise.this, ChoixReservation.class);
                cReservation_intent.putExtras(bun);
                startActivity(cReservation_intent);
                break;

        }
    }
}