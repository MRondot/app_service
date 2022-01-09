package com.example.app_service.client.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

import com.example.app_service.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRdv extends AppCompatActivity {

    Bundle bun = new Bundle();
    Bundle extras;
    CalendarView calendar;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String selectedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_rdv);
        extras = getIntent().getExtras();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButtonContinue4:
                calendar =findViewById(R.id.calendarView);
                selectedDate = sdf.format(new Date(calendar.getDate()));
                Intent cHoraireRdv_intent = new Intent(DateRdv.this, HoraireRdv.class);
                if(selectedDate!=null) {

                    bun.putString("Entreprise", extras.getString("Entreprise"));
                    bun.putString("codeP",extras.getString("codeP"));
                    bun.putString("typeclient",extras.getString("typeclient"));
                    bun.putStringArrayList("prestation",extras.getStringArrayList("prestation"));
                    bun.putString("date", selectedDate);
                    cHoraireRdv_intent.putExtras(bun);
                    startActivity(cHoraireRdv_intent);
                }else {
                    Toast.makeText(DateRdv.this, "Veuillez choisir une date pour continuer", Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }
}