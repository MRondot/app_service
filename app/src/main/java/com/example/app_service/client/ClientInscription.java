package com.example.app_service.client;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app_service.R;
import com.example.app_service.client.modification.Annulation;

public class ClientInscription extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_inscription);

        EditText nom_c=findViewById(R.id.Inscription_Client_nom);
        EditText prenom_c=findViewById(R.id.Inscription_Client_prenom);
        EditText mdp_c=findViewById(R.id.Inscription_Client_mdp);
        EditText mail_c=findViewById(R.id.Inscription_Client_mail);
        EditText num_c=findViewById(R.id.Inscription_Client_tel);

    }

    public void OnClick(View view) {
        switch (view.getId()) {
            case R.id.button_valide_inscript_client:
                Toast.makeText(this, "Vous êtes bien inscrit!", Toast.LENGTH_LONG).show();
                //String result ="insert into Client values (nom_c, prenom_c, mdp_c, mail_c, num_c)";
                Intent intent_inscription_c = new Intent(ClientInscription.this, Accueil.class);
                startActivity(intent_inscription_c);
                break;
        }
    }

}