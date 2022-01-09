package com.example.app_service.client.modification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.app_service.R;
import com.example.app_service.client.Accueil;
import com.example.app_service.client.reservation.Validation;



//Confirmation de la Modification
//Layout: activity_modification_confirmation

public class ModificationConfirmation extends AppCompatActivity {

    Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_modification_confirmation);

        //Récupération des données des activitées précédentes
        extras = getIntent().getExtras();

        //Affichage dans des textes Viewq
        TextView date =findViewById(R.id.date);
        date.setText(extras.getString("date"));

        TextView horaire =findViewById(R.id.Fhoraire);
        horaire.setText(extras.getString("horaire"));
    }

        //Renvoi à l'accueil

    public void onClick(View view) {
        switch (view.getId()) {
            //Renvoie à l'Acceuil
            case R.id.imageButtonContinue:
                Intent cAccueil_intent = new Intent(this, Accueil.class);
                startActivity(cAccueil_intent);
                break;

        }
    }
}