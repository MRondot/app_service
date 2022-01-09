package com.example.app_service.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.app_service.R;
import com.example.app_service.client.modification.Annulation;
import com.example.app_service.client.modification.ModificationDate;
import com.example.app_service.client.reservation.Code_Postal;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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


    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();

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
            case R.id.coiffeurButton:

                Intent cPostal_intent = new Intent(Accueil.this, Code_Postal.class);
                startActivity(cPostal_intent);
                break;
        }



    }

    public void launchModification(View view){
        Intent modification = new Intent(this, ModificationDate.class );
        String resId = (String) view.getTag().toString();
        modification.putExtra("id_rdv",resId);
        startActivity(modification);
    }
    public void launchDelete(View view){
        Intent annulation = new Intent(this, Annulation.class);
        String resId = (String) view.getTag().toString();
        annulation.putExtra("id_rdv",resId);
        startActivity(annulation);
    }
    public void launchAvis(View view){
        Intent Avis = new Intent(this, Avis.class );
        String nomF = (String) view.getTag().toString();
        Avis.putExtra("nomFournisseur",nomF);
        startActivity(Avis);
    }

}