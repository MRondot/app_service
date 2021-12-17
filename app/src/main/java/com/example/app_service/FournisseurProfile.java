package com.example.app_service;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;


public class FournisseurProfile extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    TextView nom, Adresse, numTel, mdp, site, description;
    Fournisseur fournisseur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fournisseur_profile);
        nom= findViewById(R.id.NomFournisseur);
        Adresse= findViewById(R.id.Adresse);
        numTel= findViewById(R.id.NumTel);
        mdp=findViewById(R.id.Mdp);
        site=findViewById(R.id.Site);
        description=findViewById(R.id.Description);

        fournisseur= new Fournisseur();

    }



}