package com.example.app_service.client.modification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app_service.R;
import com.example.app_service.client.Accueil;
import com.example.app_service.fournisseurPackage.Authentification_screen;
import com.example.app_service.fournisseurPackage.FournisseurInscription;

public class Annulation extends AppCompatActivity {

    TextView titre, text_annul, nom_fournisseur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annulation);
        
        titre.findViewById(R.id.title_annulation);
        titre.setText("Annulation");

        text_annul.findViewById(R.id.text_annulation);
        text_annul.setText("Etes vous sûr de vouloir supprimer votre rendez-vous avec: ");

        nom_fournisseur.findViewById(R.id.text_prestation);
        //String result =select nomFournisseur from rendez_vous where id_rdv= id;
        nom_fournisseur.setText("Le fournisseur associé à l'id_rdv");
    }




    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_confirmation_annul:
                Toast myToast = Toast.makeText(this, "Le rendez-vous est bien supprimé!", Toast.LENGTH_LONG);
                myToast.show();
                Intent intent_annulation = new Intent(Annulation.this, Accueil.class);
                startActivity(intent_annulation);
                break;

        }
    }


}