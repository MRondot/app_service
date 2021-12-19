package com.example.app_service.client;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.app_service.R;

import org.json.JSONException;
import org.json.JSONObject;

public class Profile extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        //Exemple Client
        JSONObject ClientTest = new JSONObject();
        try {
            ClientTest.put("id_c", "3");
            ClientTest.put("NomClient", "Micron");
            ClientTest.put("Prenom", "Manu");
            ClientTest.put("Adresse", "55 Rue du Faubourd Saint-Honoré");
            ClientTest.put("Mail", "micron.manu77@president.fr");
            ClientTest.put("Telephone","0142928100");
            ClientTest.put("Mdp", "brigittejtm");


        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}