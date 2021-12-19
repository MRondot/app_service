package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.app_service.R;

import java.util.ArrayList;

public class ChoixReservation extends AppCompatActivity {

    Bundle bun = new Bundle();
    Bundle extras;
    CheckBox homme;
    CheckBox femme;
    CheckBox enfant;
    CheckBox coupe;
    CheckBox coloration;
    CheckBox shampoing;
    ArrayList<String> prestation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_reservation);
        extras = getIntent().getExtras();

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue3:

                homme = findViewById(R.id.CB_homme);
                femme = findViewById(R.id.CB_femme);
                enfant = findViewById(R.id.CB_enfant);
                coupe = findViewById(R.id.CB_coupe);
                coloration = findViewById(R.id.CB_coloration);
                shampoing = findViewById(R.id.CB_shampoing);
                prestation = new ArrayList<>();

                if(homme.isChecked()){
                    bun.putString("typeclient","homme");
                }else if(femme.isChecked()){
                    bun.putString("typeclient","femme");
                }else if(enfant.isChecked()){
                    bun.putString("typeclient","enfant");
                }
                if(coupe.isChecked()){
                    prestation.add("coupe");
                }
                if(coloration.isChecked()){
                    prestation.add("coloration");
                }
                if(shampoing.isChecked()){
                    prestation.add("shampoing");
                }

                bun.putString("Entreprise", extras.getString("Entreprise"));
                bun.putString("codeP",extras.getString("codeP"));
                bun.putStringArrayList("prestation",prestation);


                if(bun.getString("typeclient")!=null || bun.getString("prestation")!=null) {
                    Intent cDateRdv_intent = new Intent(ChoixReservation.this, DateRdv.class);
                    cDateRdv_intent.putExtras(bun);
                    startActivity(cDateRdv_intent);
                }else{
                    Toast.makeText(ChoixReservation.this, "Veuillez choisir un type de client pour continuer", Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
}