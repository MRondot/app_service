package com.example.app_service.classes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.app_service.R;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class CustomAdapter extends ArrayAdapter<Fournisseur>{

    private ArrayList<Fournisseur> dataSet;
    Context mContext;

    public CustomAdapter(ArrayList<Fournisseur> data, Context context) {
        super(context, R.layout.fiche_entreprise, data);
        this.dataSet = data;
        this.mContext=context;



    class ViewHolder {
        TextView nomFournisseur;
        TextView adresseF;
        TextView site;
        TextView mail;
        TextView description;
        TextView echelle_prix;
    }
}
}