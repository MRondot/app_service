package com.example.app_service.fournisseurPackage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app_service.R;
import com.google.firebase.auth.FirebaseAuth;


public class Authentification_screen extends AppCompatActivity implements View.OnClickListener {

    FirebaseAuth mAuth;
    EditText adresse_mail, mdp;
    Button connexion_pro, connexion_client, inscripton_pro, inscription_client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);

        adresse_mail.findViewById(R.id.adresseMail);
        mdp.findViewById(R.id.mdp);
        connexion_pro.findViewById(R.id.connexion_pro);
        connexion_client.findViewById(R.id.connexion_client);
        inscripton_pro.findViewById(R.id.inscription_pro);
        inscription_client.findViewById(R.id.inscription_client);

        connexion_pro.setOnClickListener(this);
        connexion_client.setOnClickListener(this);
        inscription_client.setOnClickListener(this);
        inscripton_pro.setOnClickListener(this);
        mAuth= FirebaseAuth.getInstance();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.connexion_pro:
                //if(verif couple mail et mdp existe dans la bdd)
                Toast myToast = Toast.makeText(this, "lance la connexion pro", Toast.LENGTH_LONG);
                myToast.show();
                //else
                break;
            case R.id.connexion_client:
                //if(verif couple mail et mdp existe dans la bdd)
                Toast myToast2 = Toast.makeText(this, "lance la connexion client", Toast.LENGTH_LONG);
                myToast2.show();
                //else
                break;
            case R.id.inscription_pro:
                Intent intent_inscription_pro = new Intent(Authentification_screen.this, FournisseurInscription.class);
                startActivity(intent_inscription_pro);
                break;
            case R.id.inscription_client:
                //Intent intent_incription_client = new Intent(Authentification_screen.this, ClientInscription.class);
                //startActivity(intent_inscription_client);
                break;

        }

    }
}