package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.Toast;

import com.example.app_service.R;

public class Adresse extends AppCompatActivity {


    Bundle extras;
    Bundle bun = new Bundle();
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adresse);
        extras = getIntent().getExtras();
        input =this.findViewById(R.id.adresse);
    }





    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue2:
                Intent cAdresse_intent = new Intent(Adresse.this, Recapitulatif.class);
                String adresse = input.getText().toString();
                if(adresse.length() >1) {
                    bun.putString("Entreprise", extras.getString("Entreprise"));
                    bun.putString("codeP",extras.getString("codeP"));
                    bun.putStringArrayList("prestation",extras.getStringArrayList("prestation"));
                    bun.putString("typeclient",extras.getString("typeclient"));
                    bun.putString("date", extras.getString("date"));
                    bun.putString("horaire", extras.getString("horaire") );
                    bun.putString("adresse",adresse);
                    cAdresse_intent.putExtras(bun);
                    startActivity(cAdresse_intent);
                }else {
                    Toast.makeText(Adresse.this, "Veuillez entrer sur une adresse pour continuer", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}