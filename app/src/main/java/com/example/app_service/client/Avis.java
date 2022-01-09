package com.example.app_service.client;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app_service.R;
import com.example.app_service.classes.AvisPost;

import org.w3c.dom.Text;

import java.util.Random;

public class Avis extends AppCompatActivity {


    Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avis);
        extras = getIntent().getExtras();
        TextView nomF = findViewById(R.id.nomFAvis);
        nomF.setText(extras.getString("nomFournisseur"));

    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.confirmationButton:


                EditText input = (EditText)findViewById(R.id.inputAvis);
                String desc = input.getText().toString();
                EditText Inote = (EditText)findViewById(R.id.noteAvis);
                String Snote = Inote.getText().toString();
                if(Snote.length()>=1 && desc!=null){
                    int note = Integer.parseInt(Snote);
                    if(note>=1 && note<=5){
                        int id = new Random().nextInt((20-1)+1)+1;
                        AvisPost avis = new AvisPost(desc,note,id);
                        Intent cAccueil_intent = new Intent(this, Accueil.class);
                        startActivity(cAccueil_intent);
                        Toast.makeText(this, "Votre Avis a bien été enregistré !", Toast.LENGTH_LONG).show();
                    }else {
                        Toast.makeText(this, "Votre note n'est pas valide", Toast.LENGTH_LONG).show();
                    }




                }
                else {
                    Toast.makeText(this, "Votre note ou votre description n'est pas valide", Toast.LENGTH_LONG).show();
                }






                break;

        }
    }
}