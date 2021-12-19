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

    EditText nomEntreprise, mail, tel, adresse, mdp, site_web;
    Spinner type_service;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fournisseur_inscription);

        nomEntreprise.findViewById(R.id.nomEntreprise);
        mail.findViewById(R.id.mail);
        tel.findViewById(R.id.tel);
        adresse.findViewById(R.id.adresse);
        mdp.findViewById(R.id.mdp_inscription);
        site_web.findViewById(R.id.site_web);
        type_service.findViewById(R.id.list_service);
        submit.findViewById(R.id.submit);

        submit.setOnClickListener(this);
        type_service.setOnClickListener(this);
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

    }

    public void create_spinner_services(){
        List<String> services = new ArrayList<String>();
        services.add("Coiffeur");
        services.add("Jardinier");
        services.add("Restaurant");
        services.add("Mecanicien");
        services.add("Médecin");
        services.add("Travaux");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, services);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        type_service.setAdapter(dataAdapter);

    }
}