package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.app_service.R;


public class HoraireRdv extends AppCompatActivity {

    String[] lhoraire = {"8h00","8h30","9h00","9h30","10h00","10h30","11h00","11h30","12h00","12h30","13h00","13h30","14h00","14h30","15h00","15h30","16h00","16h30","17h00","17h30"};
    Bundle bun = new Bundle();
    String horaire =null;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horaire_rdv);

        GridView list =findViewById(R.id.gridhoraire);
        list.setAdapter(new ArrayAdapter<>(this,R.layout.horaire,lhoraire));
        extras = getIntent().getExtras();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue5:
                Intent cDateRdv_intent = new Intent(HoraireRdv.this, Adresse.class);

                if(horaire!=null) {
                    bun.putString("Entreprise", extras.getString("Entreprise"));
                    bun.putString("codeP",extras.getString("codeP"));
                    bun.putStringArrayList("prestation",extras.getStringArrayList("prestation"));
                    bun.putString("typeclient",extras.getString("typeclient"));
                    bun.putString("date", extras.getString("date"));
                    bun.putString("horaire", horaire);

                    cDateRdv_intent.putExtras(bun);
                    startActivity(cDateRdv_intent);
                }else {
                    Toast.makeText(HoraireRdv.this, "Veuillez cliquer sur un horaire pour continuer", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.horaire:
                TextView s =view.findViewById(R.id.horaire);
                 horaire=s.getText().toString();
                break;
        }
    }
}