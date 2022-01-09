package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;


import com.example.app_service.R;
import com.example.app_service.classes.CEntrepriseListAdapter;
import com.example.app_service.classes.Fournisseur;
import com.example.app_service.classes.RDVListAdapter;
import com.example.app_service.classes.Rendez_vous;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

//Récupération du choix de l'entreprise, avec possible envoie vers la liste des avis
//Layout : activity_choix_entreprise
public class ChoixEntreprise extends AppCompatActivity {

    String fournisseur;
    Bundle bun = new Bundle();
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_entreprise);
        extras = getIntent().getExtras();

        List<Fournisseur> fournisseurs = genEntreprise();
        ListView listView = (ListView) findViewById(R.id.listViewCF);
        CEntrepriseListAdapter RDVListAdapter = new  CEntrepriseListAdapter(this,R.layout.fiche_entreprise, fournisseurs);
        listView.setAdapter(RDVListAdapter);
     }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue2:
                //Valide la selection de l'entreprise en envoyant le nom de cette dernière
                if(fournisseur== null) {
                    Toast.makeText(this, "Veuillez sélectionner une entreprise en cliquant sur le bouton choisir en dessous du descriptif", Toast.LENGTH_SHORT).show();
                }else{
                    bun.putString("Entreprise", fournisseur);
                    bun.putString("codeP", extras.getString("codeP"));
                    Intent cReservation_intent = new Intent(ChoixEntreprise.this, ChoixReservation.class);
                    cReservation_intent.putExtras(bun);
                    startActivity(cReservation_intent);
                }
                    break;

        }
    }

    //Génération des entreprises
    private List<Fournisseur> genEntreprise(){
        List<Fournisseur> list = new ArrayList<Fournisseur>();;
        Fournisseur f1 = new Fournisseur("Coupt'if","890 Boulevard Louis Blanc 34090 Montpellier","Les coiffeurs les plus rapides du Sud");
        Fournisseur f2 = new Fournisseur("Mot'if","12 Route de Mende 34090 Montpellier","Les coiffuers les plus artistiques du Sud");
        Fournisseur f3 = new Fournisseur("Couph'air","77 rue du Triolet 34090 Montpellier","Les coiffeurs les plus vides du Sud");

        list.add(f1);
        list.add(f2);
        list.add(f3);

        return list;

    }
    //Récupération d'une nom de l'entreprise dans la variable fournisseur, associé au bonton choisir sur chaque item de la listView
    public void myButtonTag(View view){
        fournisseur = (String) view.getTag();
        Toast.makeText(this, "Vous avez bien sélectionné "+fournisseur+ " comme entreprise.", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Appuyez sur continuer pour poursuivre votre réservation", Toast.LENGTH_SHORT).show();
    }
    //Envoie à la liste d'avis lié au fournisseur, lié au bouton étoile sur chaque item de la listView
    public void myButtonAvis(View view){
        Intent cAvis_intent = new Intent(this, ListeAvisReservation.class);
        String fournisseurAvis = (String) view.getTag();
        bun.putString("codeP", extras.getString("codeP"));
        Toast.makeText(this, extras.getString("codeP"), Toast.LENGTH_SHORT).show();
        bun.putString("fournisseur",fournisseurAvis);
        cAvis_intent.putExtras(bun);
        startActivity(cAvis_intent);
    }
}