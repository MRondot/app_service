package com.example.app_service.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.app_service.Common.Authentification_screen;
import com.example.app_service.R;
import com.example.app_service.client.modification.Annulation;
import com.example.app_service.client.modification.ModificationDate;
import com.example.app_service.client.reservation.Code_Postal;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;


//Pages d'acceuil, s'articule autour de 3 fragments, utilisation de la barre de navigation
//Layout: activity_accueil; fragment_blank; fragment_second; fragment_third; list_rdv_layout
public class Accueil extends AppCompatActivity  implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    Bundle bun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        bottomNavigationView = findViewById(R.id.nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.navigation_accueil);



    }

    //Définition des fragments
    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();

    //Navigation entre les différents fragments
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.navigation_accueil:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, firstFragment).commit();
                return true;

            case R.id.navigation_rendezvous:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, secondFragment).commit();
                return true;

            case R.id.navigation_profil:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, thirdFragment).commit();
                return true;
        }
        return false;
    }



    public void onClick(View view) {
        switch (view.getId()) {
            //Lancement de la procedure de réservation avec le code postal
            case R.id.coiffeurButton:

                Intent cPostal_intent = new Intent(Accueil.this, Code_Postal.class);
                startActivity(cPostal_intent);
                break;

        }



    }

    //Lancement de la procédure de modification depuis le fragment des rendez-vous, bouton clé à molette
    public void launchModification(View view){
        Intent modification = new Intent(this, ModificationDate.class );
        String resId = (String) view.getTag().toString();
        modification.putExtra("id_rdv",resId);
        startActivity(modification);
    }
    //Lancement de la procédure de suppression depuis le fragment des rendez-vous, bouton croix
    public void launchDelete(View view){
        Intent annulation = new Intent(this, Annulation.class);
        String resId = (String) view.getTag().toString();
        annulation.putExtra("id_rdv",resId);
        startActivity(annulation);
    }
    //Lancement de la création d'un avis depuis le fragment rendez-vous, bouton étoile
    public void launchAvis(View view){
        Intent Avis = new Intent(this, Avis.class );
        String nomF = (String) view.getTag().toString();
        Avis.putExtra("nomFournisseur",nomF);
        startActivity(Avis);
    }

/*    public void deconnexion(){
        Intent deco_intent = new Intent(this, Authentification_screen.class);
        startActivity(deco_intent);
    }*/

}