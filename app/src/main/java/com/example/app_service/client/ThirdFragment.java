package com.example.app_service.client;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.app_service.Common.Authentification_screen;
import com.example.app_service.R;

public class ThirdFragment extends Fragment {

    //Affiche le profil de l'utilisateur
    //Layout:fragment_third
    public ThirdFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_third, container, false);
        TextView nom_c= view.findViewById(R.id.ClientNom);
        TextView prenom_c= view.findViewById(R.id.ClientPrenom);
        TextView mdp_c=view.findViewById(R.id.ClientMdp);
        TextView tel_c=view.findViewById(R.id.ClientNum);
        TextView mail_c=view.findViewById(R.id.ClientMail);

        nom_c.setText("Nom: "+"Micron");
        prenom_c.setText("Prénom: "+"Manu");
        mdp_c.setText("Mot de Passe: "+"LePresidentCMoi");
        tel_c.setText("Numéro de Téléphone: "+"0179648305");
        mail_c.setText("Adresse Mail: "+"president.manu@elysee.fr");

        Button button = (Button) view.findViewById(R.id.button_deco);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent deco_intent = new Intent(requireContext(), Authentification_screen.class);
                startActivity(deco_intent);
            }
        });

        return view;



    }


}