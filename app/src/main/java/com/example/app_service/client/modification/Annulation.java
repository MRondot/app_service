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

public class Annulation extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annulation);

        Bundle bundle = getIntent().getExtras();
        String id_rdv= bundle.getString("id_rdv");

        TextView titre= findViewById(R.id.title_annulation);
        titre.setText("Annulation");

        TextView text_annul= findViewById(R.id.text_annulation);
        //String result ="select nomFournisseur from rendez_vous where id_rdv= id";
        text_annul.setText("Etes vous sûr de vouloir supprimer votre rendez-vous avec: Le fournisseur associé à l'id " +id_rdv);

        Button button_valide = findViewById(R.id.button_confirmation_annul);
        button_valide.setOnClickListener(this::onClick);

    }




    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_confirmation_annul:
                Toast.makeText(this, "Le rendez-vous est bien supprimé!", Toast.LENGTH_LONG).show();
                Intent intent_annulation = new Intent(Annulation.this, Accueil.class);
                startActivity(intent_annulation);

                break;

        }
    }


}