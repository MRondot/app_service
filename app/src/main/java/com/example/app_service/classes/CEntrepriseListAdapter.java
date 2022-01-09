package com.example.app_service.classes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.app_service.R;

import java.util.List;

//Adapter pour la liste de fournisseur, depuis ChoixEntreprise
public class CEntrepriseListAdapter extends BaseAdapter {

    //Liste des données concernant les fournisseurs.
        private List<Fournisseur> listData;

        private LayoutInflater layoutInflater;
        private Context context;
        private int layoutId;

    //Conservation des données grâce à un Holder
        static class ViewHolder {
            TextView nomFournisseurView;
            TextView adresseFView;
            TextView descriptionView;
            Button btnView;
            ImageButton btnAvisView;
        }
    //Constructeur
        public CEntrepriseListAdapter(Context aContext, int layoutId, List<Fournisseur> listData) {
            this.context = aContext;
            this.listData = listData;
            this.layoutId = layoutId;
            layoutInflater = LayoutInflater.from(aContext);
        }


        @Override
        public int getCount() {
            return listData.size();
        }

        @Override
        public Object getItem(int position) {
            return listData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            CEntrepriseListAdapter.ViewHolder holder;
            //Identification des views qui seront utilisées.
            if (convertView == null) {
                convertView = layoutInflater.inflate(layoutId, parent, false);
                holder = new CEntrepriseListAdapter.ViewHolder();
                holder.nomFournisseurView = (TextView) convertView.findViewById(R.id.nomFournisseurCF);
                holder.adresseFView = (TextView) convertView.findViewById(R.id.adresseFCF);
                holder.descriptionView = (TextView) convertView.findViewById(R.id.descriptionCF);
                holder.btnView = (Button) convertView.findViewById(R.id.chooseButtonCF);
                holder.btnAvisView = (ImageButton) convertView.findViewById(R.id.imageButton);
                convertView.setTag(holder);
            } else {
                holder = (CEntrepriseListAdapter.ViewHolder) convertView.getTag();
            }
            //Récupération des données sur un avis.
            Fournisseur fournisseur = this.listData.get(position);
            //Ajout des données dans les views
            holder.nomFournisseurView.setText(fournisseur.getNomFournisseur());
            holder.adresseFView.setText( fournisseur.getAdresseF());
            holder.descriptionView.setText( fournisseur.getDescription());
            holder.btnView.setTag(fournisseur.getNomFournisseur());
            holder.btnAvisView.setTag(fournisseur.getNomFournisseur());

            return convertView;

        }

    }