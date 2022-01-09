package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.app_service.R;
import com.example.app_service.client.Accueil;

//Confirmation du rendez-vous, renvoie à l'accueil.
//Layout:activity_validation
public class Validation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            //Renvoi Accueil
            case R.id.imageButtonContinue:
                    Intent cAccueil_intent = new Intent(Validation.this, Accueil.class);
                    startActivity(cAccueil_intent );
                break;

        }
    }
 }