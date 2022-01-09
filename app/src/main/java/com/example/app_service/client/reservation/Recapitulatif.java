package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.example.app_service.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Recapitulatif extends AppCompatActivity {


    Bundle bun = new Bundle();
    Bundle extras;
    double prix;
    double Coupe_prix;
    double Coloration_prix;
    double Shampoing_prix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recapitulatif);
        extras = getIntent().getExtras();

        //A Modifier avec la BDD.
        //Exemple Entreprise
        JSONObject EntrepriseTest = new JSONObject();
        try {
            EntrepriseTest.put("id", "3");
            EntrepriseTest.put("name", "Entreprise Test");
            EntrepriseTest.put("Fcoupe", "25");
            EntrepriseTest.put("Fcoloration", "90");
            EntrepriseTest.put("Fshampoing", "5");
            EntrepriseTest.put("Hcoupe", "15");
            EntrepriseTest.put("Hcoloration", "40");
            EntrepriseTest.put("Hshampoing", "5");
            EntrepriseTest.put("Ecoupe", "10");
            EntrepriseTest.put("Ecoloration", "30");
            EntrepriseTest.put("Eshampoing", "5");

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }





        calculPrix(EntrepriseTest);

            TextView entreprise =findViewById(R.id.entreprise);
            entreprise.setText(extras.getString("Entreprise"));

            TextView typeclient =findViewById(R.id.typeclient);
            typeclient.setText(extras.getString("typeclient"));

            TextView Adresse =findViewById(R.id.ClientPrenom);
            Adresse.setText(extras.getString("adresse"));

            TextView date =findViewById(R.id.date);
            date.setText(extras.getString("date"));

            TextView horaire =findViewById(R.id.Fhoraire);
            horaire.setText(extras.getString("horaire"));



    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue2:
                Intent cValidation_intent = new Intent(Recapitulatif.this, Validation.class);

                //TODO Renvoie des données pour match avec la classe Rendez_vous


                //Rendez_Vous rdv = new Rendez_vous
                // (
                //  extras.getString("adresse"),
                //  Nomclient,
                //  extras.getString("typeclient"),
                //  extras.getString("Entreprise")
                //  extras.getStringArrayList("prestation")
                //  extras.getString("date")
                //  extras.getString("horaire")
                //  id,
                //  String.valueOf(prix)
                //)
                // mDatabase.child("rendez_vous").child(id).setValue(rdv);



                bun.putString("Entreprise", extras.getString("Entreprise"));
                bun.putString("codeP", extras.getString("codeP"));
                bun.putStringArrayList("prestation", extras.getStringArrayList("prestation"));
                bun.putString("typeclient", extras.getString("typeclient"));
                bun.putString("date", extras.getString("date"));
                bun.putString("horaire", extras.getString("horaire"));
                bun.putString("adresse", extras.getString("adresse"));
                bun.putString("prix",String.valueOf(prix));
                cValidation_intent.putExtras(bun);
                startActivity(cValidation_intent);

                break;
        }
    }


    //Utilise un fichier JSON pour les données de l'entreprise/service
    //A modifier avec la BDD
    public void calculPrix(JSONObject EntrepriseTest) {
        if (extras.getString("typeclient").equals("homme")) {
            try {
                Coupe_prix = Double.parseDouble(EntrepriseTest.getString("Hcoupe"));
                Coloration_prix = Double.parseDouble(EntrepriseTest.getString("Hcoloration"));
                Shampoing_prix = Double.parseDouble(EntrepriseTest.getString("Hshampoing"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (extras.getString("typeclient").equals("femme")) {
            try {
                Coupe_prix = Double.parseDouble(EntrepriseTest.getString("Fcoupe"));
                Coloration_prix = Double.parseDouble(EntrepriseTest.getString("Fcoloration"));
                Shampoing_prix = Double.parseDouble(EntrepriseTest.getString("Fshampoing"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Coupe_prix = Double.parseDouble(EntrepriseTest.getString("Ecoupe"));
                Coloration_prix = Double.parseDouble(EntrepriseTest.getString("Ecoloration"));
                Shampoing_prix = Double.parseDouble(EntrepriseTest.getString("Eshampoing"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        ArrayList<String> prestation = extras.getStringArrayList("prestation");

        if (prestation.contains("coupe")) {
            TextView coupe =findViewById(R.id.coupe);
            coupe.setText("Coupe");
            prix = prix + Coupe_prix;
        }

        if (prestation.contains("coloration")) {
            TextView coloration =findViewById(R.id.coloration);
            coloration.setText("Coloration");
            prix = prix + Coloration_prix;
        }
        if (prestation.contains("shampoing")) {
            TextView shampoing =findViewById(R.id.shampoing);
            shampoing.setText("Shampoing");
            prix = prix + Shampoing_prix;
        }
        TextView Tprix =findViewById(R.id.prix);
        Tprix.setText(prix+" €");

    }
}
