package com.example.app_service.fournisseurPackage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app_service.R;

public class liste_resa extends AppCompatActivity implements View.OnClickListener {

    TextView titre_rdv, nom_client, date, heure, adresseClient;
    Button supprimer, voir_profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_resa);

        titre_rdv=findViewById(R.id.Titre_rdv);
        nom_client= findViewById(R.id.nomClient);
        date= findViewById(R.id.date);
        heure=findViewById(R.id.heure);
        adresseClient=findViewById(R.id.adresseClient);
        supprimer=findViewById(R.id.suppression_rdv);
        voir_profil=findViewById(R.id.consulter_profil);

        supprimer.setOnClickListener(this);
        voir_profil.setOnClickListener(this);

        Remplir_rdv();

    }

    private void Remplir_rdv() {

        nom_client.setText("Michel");
        date.setText("12/05/2021");
        heure.setText("8h24");
        adresseClient.setText("3 rue de la fac");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.suppression_rdv:
                suppression();
                break;
            case R.id.consulter_profil:
                ouvrirProfil();
        }

    }

    private void ouvrirProfil() {
        Toast myToast = Toast.makeText(this, "Ouvre le profil!", Toast.LENGTH_LONG);
        myToast.show();
    }

    private void suppression() {

        Toast myToast = Toast.makeText(this, "supprime le rdv!", Toast.LENGTH_LONG);
        myToast.show();
    }
}