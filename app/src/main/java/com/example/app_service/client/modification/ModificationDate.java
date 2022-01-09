package com.example.app_service.client.modification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

import com.example.app_service.R;
import com.example.app_service.client.reservation.DateRdv;
import com.example.app_service.client.reservation.HoraireRdv;

import java.text.SimpleDateFormat;
import java.util.Date;

//Modification de la date
//Layout:activity_modification_date
public class ModificationDate extends AppCompatActivity {

    Bundle bun = new Bundle();
    Bundle extras;
    CalendarView calendar;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String selectedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modification_date);
        extras = getIntent().getExtras();

    }


    public void onClick(View view) {
        switch (view.getId()) {

            //Sauvegarde de la date, et envoie à la sélection d'un horaire
            case R.id.imageButtonContinue4:
                calendar =findViewById(R.id.calendarView);
                selectedDate = sdf.format(new Date(calendar.getDate()));
                Intent horairemodification = new Intent(this, ModificationHoraire.class);
                if(selectedDate!=null) {

                    bun.putString("id_rdv",extras.getString("id_rdv"));
                    bun.putString("date", selectedDate);
                    horairemodification.putExtras(bun);
                    startActivity(horairemodification);
                }else {
                    Toast.makeText(this, "Veuillez choisir une date pour continuer", Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }
}