package com.example.app_service.fournisseurPackage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.app_service.R;
import com.example.app_service.client.Accueil;

import java.util.ArrayList;
import java.util.List;

public class FournisseurInscription extends AppCompatActivity implements View.OnClickListener {

    Spinner type_service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fournisseur_inscription);

        EditText nomEntreprise=findViewById(R.id.nomEntreprise);
        EditText mail= findViewById(R.id.mail);
        EditText tel=findViewById(R.id.tel);
        EditText adresse=findViewById(R.id.adresse);
        EditText mdp=findViewById(R.id.mdp_inscription);
        EditText site_web=findViewById(R.id.site_web);

        nomEntreprise.setText("Couph'air");
        mail.setText("couph'air@gmail.fr");
        tel.setText("0708090405");
        adresse.setText("123 chemin des jeux de mots");
        mdp.setText("pass'word");
        site_web.setText("www.mescheveux.fr");
        
        //Spinner type_service=findViewById(R.id.list_service);
        Button submit=findViewById(R.id.submit);

        submit.setOnClickListener(this);

        //type_service.setOnClickListener(this);
        //create_spinner_services();



    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.submit:
                inscriptionFournisseur();
                Intent fournisseur_inscrip_intent = new Intent(this, FournisseurProfile.class);
                startActivity(fournisseur_inscrip_intent);
                break;
        }
    }

    private void inscriptionFournisseur() {
        //String result= "insert into Fournisseur values(nomEntreprise,mail, tel, adresse, mdp, site_web, type_service");
    }

    /*public void create_spinner_services(){
        List<String> services = new ArrayList<>();
        services.add("Coiffeur");
        services.add("Jardinier");
        services.add("Restaurant");
        services.add("Mecanicien");
        services.add("M??decin");
        services.add("Travaux");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, services);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        type_service.setAdapter(dataAdapter);

    }*/
}