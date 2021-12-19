package com.example.app_service.fournisseurPackage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.app_service.R;
import com.example.app_service.classes.Fournisseur;
//import com.google.firebase.firestore.FirebaseFirestore;


public class FournisseurProfile extends AppCompatActivity {
    //FirebaseFirestore db = FirebaseFirestore.getInstance();
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


}