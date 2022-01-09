package com.example.app_service.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app_service.R;
import com.example.app_service.classes.Client;
import com.example.app_service.classes.Fournisseur;
import com.example.app_service.client.Accueil;
import com.example.app_service.client.ClientInscription;
import com.example.app_service.fournisseurPackage.FournisseurInscription;
import com.example.app_service.fournisseurPackage.FournisseurProfile;


//Ecran de démarrage de l'application, renvoie vers les différentes parties de l'application, fournisseurs ou clients
//Layout:activity_authentification
public class Authentification_screen extends AppCompatActivity implements View.OnClickListener {

    public EditText adresse_mail, mdp;
    Client Karim= new Client("Karim", "karim@test.com", "c");
    Fournisseur JeanNoel= new Fournisseur("JeanNoel", "JN@test.com","c","C'est le fournisseur test");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);
        initiator();

    }


    private void initiator(){

        adresse_mail =findViewById(R.id.adresseMail);
        mdp = findViewById(R.id.mdp);
        Button  connexion_pro = findViewById(R.id.connexion_pro);
        Button  connexion_client = findViewById(R.id.connexion_client);
        Button  inscripton_pro = findViewById(R.id.inscription_pro);
        Button inscription_client = findViewById(R.id.inscription_client);
        connexion_pro.setOnClickListener(this);
        connexion_client.setOnClickListener(this);
        inscription_client.setOnClickListener(this);
        inscripton_pro.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.connexion_pro:
                initiator();
               /* String nom= adresse_mail.getText().toString();
                String mot= mdp.getText().toString();
                //if(verif couple mail et mdp existe dans la base de données en tant que Fournisseur)
                if(nom.equals(JeanNoel.getMail()) && mot.equals((JeanNoel.getMdp()))) {*/
                Toast.makeText(this, "lance la connexion pro", Toast.LENGTH_LONG).show();
                Intent intent_connection_client = new Intent(Authentification_screen.this, FournisseurProfile.class);
                startActivity(intent_connection_client);
            //}
                /*else {
                    Toast.makeText(this, "Ce couple adresse mail et mot de passe est erroné !", Toast.LENGTH_LONG).show();
                }*/
                break;
            case R.id.connexion_client:
                //if(verif couple mail et mdp existe dans la base de données en tant que Client)
                //if(adresse_mail.equals(Karim.getMail()) && mdp.equals(Karim.getMdp())) {
                    Intent Accueil = new Intent(Authentification_screen.this, com.example.app_service.client.Accueil.class);
                    startActivity(Accueil);
                    Toast.makeText(this, "Vous êtes bien connecté !", Toast.LENGTH_LONG).show();
               /* }
                else {
                    Toast.makeText(this, "Ce couple adresse mail et mot de passe est erroné !", Toast.LENGTH_LONG).show();
                }*/
                break;
            case R.id.inscription_pro:
                Intent intent_inscription_pro = new Intent(Authentification_screen.this, FournisseurInscription.class);
                startActivity(intent_inscription_pro);
                break;
            case R.id.inscription_client:
                Intent intent_inscription_client = new Intent(Authentification_screen.this, ClientInscription.class);
                startActivity(intent_inscription_client);
                break;

        }

    }
}