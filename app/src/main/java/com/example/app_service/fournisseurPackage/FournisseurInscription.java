package com.example.app_service.fournisseurPackage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.app_service.R;

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
        Spinner type_service=findViewById(R.id.list_service);
        Button submit=findViewById(R.id.submit);

        submit.setOnClickListener(this);
        //type_service.setOnClickListener(this);
        create_spinner_services();



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.submit:
                inscriptionFournisseur();
                break;
        }
    }

    private void inscriptionFournisseur() {
        //String result= "insert into Fournisseur values(nomEntreprise,mail, tel, adresse, mdp, site_web, type_service");
    }

    public void create_spinner_services(){
        List<String> services = new ArrayList<>();
        services.add("Coiffeur");
        services.add("Jardinier");
        services.add("Restaurant");
        services.add("Mecanicien");
        services.add("Médecin");
        services.add("Travaux");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, services);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        type_service.setAdapter(dataAdapter);

    }
}