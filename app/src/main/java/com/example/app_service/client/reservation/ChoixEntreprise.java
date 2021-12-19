package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;


import com.example.app_service.R;

import org.json.JSONException;
import org.json.JSONObject;

public class ChoixEntreprise extends AppCompatActivity {

    String Etest="Entreprise Test";
    Bundle bun = new Bundle();
    Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_entreprise);
        extras = getIntent().getExtras();


        // TODO A Modifier avec la BDD.
        //Exemple Entreprise

        JSONObject EntrepriseTest = new JSONObject();
        try {
            EntrepriseTest.put("id", "1");
            EntrepriseTest.put("nomFournisseur", "Entreprise Test");
            EntrepriseTest.put("domaineActivite", "Coiffeur");
            EntrepriseTest.put("adresseF", "58 rue Faubourg Saint-Honoré");
            EntrepriseTest.put("mail", "test@gmail.com");
            EntrepriseTest.put("site", "testcoiffure.fr");
            EntrepriseTest.put("description", "Ici pour tester les meilleures coiffures");

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
    public void displayEntreprise(JSONObject EntrepriseTest) throws JSONException {

            //ListView list =findViewById(R.id.listview);
            //list.setAdapter(new ArrayAdapter<>(this,R.layout.horaire,));
            //EntrepriseTest.getString("NomFournisseur");

    }
}