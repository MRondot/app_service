package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app_service.R;
import com.example.app_service.classes.AvisListAdapter;
import com.example.app_service.classes.AvisPost;
import com.example.app_service.classes.CEntrepriseListAdapter;
import com.example.app_service.classes.Fournisseur;

import java.util.ArrayList;
import java.util.List;

//Affiche une liste d'avis à propos d'un fournisseur sélectionné
//Layout:activity_liste_avis_reservation; fiche_avis
public class ListeAvisReservation extends AppCompatActivity {

    Bundle extras;
    Bundle bun = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_avis_reservation);
        extras = getIntent().getExtras();

        //Récupération du nom du fournisseur
        TextView titre = (TextView) findViewById(R.id.textView4);
        String Nfournisseur = extras.getString("fournisseur");
        titre.setText(Nfournisseur);


        //Génération avis
        List<AvisPost> avis = genAvis();

        //Sélection des avis concernant le fournisseur sélectionné dans une liste
        List<AvisPost> avisSelec = new ArrayList<>();
        for( AvisPost aviss : avis){
            if(aviss.getNomFournisseur().equals(Nfournisseur)){
                avisSelec.add(aviss);
            }

        }
        //Utilisation de AvisListAdapter pour une permettre une exploitation et un affichage des données concernant ces avs
        ListView listView = (ListView) findViewById(R.id.listViewCF);
        AvisListAdapter AvisListAdapter = new  AvisListAdapter(this,R.layout.fiche_avis, avisSelec);
        listView.setAdapter(AvisListAdapter);
    }

    public void onClick(View view) {
        switch (view.getId()) {

            //Renvoie au choix de l'entreprise
            case R.id.imageButtonLAvis:
                Intent cEntreprise_intent = new Intent(this, ChoixEntreprise.class);
                extras = getIntent().getExtras();
                Toast.makeText(this, extras.getString("codeP"), Toast.LENGTH_SHORT).show();
                bun.putString("codeP", extras.getString("codeP"));
                cEntreprise_intent.putExtras(bun);
                startActivity(cEntreprise_intent);
        }
    }

    //Génération des avis
    private List<AvisPost> genAvis(){
        List<AvisPost> list = new ArrayList<AvisPost>();;
        AvisPost a1 = new AvisPost("Super ! ",4,3,"Mot'if");
        AvisPost a2 = new AvisPost("Pas fou..",2,8,"Coupt'if");
        AvisPost a3 = new AvisPost("Déco de mauvais gout !",3,7,"Coupt'if");
        AvisPost a4 = new AvisPost("A éviter, peu agréable",1,5,"Mot'if");
        AvisPost a5 = new AvisPost("Très aimable, je recommande",4,3,"Couph'air");
        AvisPost a6 = new AvisPost("Les meilleurs ! J'y vais 3 fois par semaine !",5,1,"Couph'air");

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);

        return list;

    }




}