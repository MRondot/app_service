package com.example.app_service.client.modification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app_service.R;
import com.example.app_service.client.reservation.HoraireRdv;

public class Annulation extends AppCompatActivity {

    Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView test = findViewById(R.id.textView16);
        setContentView(R.layout.activity_annulation2);
        extras = getIntent().getExtras();
        Toast.makeText(this, extras.getString("id_rdv"), Toast.LENGTH_SHORT).show();

    }
}