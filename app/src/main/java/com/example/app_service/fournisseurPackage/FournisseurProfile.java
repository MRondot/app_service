package com.example.app_service.fournisseurPackage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app_service.Common.Authentification_screen;
import com.example.app_service.R;
import com.example.app_service.classes.Fournisseur;


//Affiche le profil d'un user Fournisseur
//Layout:activity_fournisseur_profile
public class FournisseurProfile extends AppCompatActivity {
    TextView nom, Adresse, numTel, mdp, site, description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fournisseur_profile);
        nom= findViewById(R.id.ClientNom);
        Adresse= findViewById(R.id.ClientPrenom);
        numTel= findViewById(R.id.NumTel);
        mdp=findViewById(R.id.ClientMdp);
        site=findViewById(R.id.ClientNum);
        description=findViewById(R.id.ClientMail);

        AfficheDonnees();

    }

    private void AfficheDonnees() { // à remplir à partir des données de la bdd

        nom.setText("Manu");
        Adresse.setText("7 rue du général manu");
        numTel.setText("06 50 80 46 79");
        mdp.setText("jesuisunmdp");
        site.setText("www.settext.com");
        description.setText("C'est un service vraiment sympa!");

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button_deco:
                Intent Intent_deco = new Intent(FournisseurProfile.this, Authentification_screen.class);
                startActivity(Intent_deco);
                Toast.makeText(this, "Vous êtes bien déconnecté !", Toast.LENGTH_LONG).show();

        }
    }


}