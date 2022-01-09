package com.example.app_service.client;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app_service.R;


//Fragment affichant les élements de la page d'accueil, choix du domaine pour le service
//Layout: fragment_blank
    public class FirstFragment extends Fragment {

        public FirstFragment(){
            // require a empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_blank, container, false);
        }
    }
