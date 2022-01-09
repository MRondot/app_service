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

//Adapter pour la liste de rendez-vous, depuis Accueil
public class RDVListAdapter extends BaseAdapter {

    //Liste des données concernant les rendez-vous.
    private List<Rendez_vous> listData;

    private LayoutInflater layoutInflater;
    private Context context;
    private int layoutId;

    //Conservation des données grâce à un Holder
    static class ViewHolder {
        TextView nomEntrepriseView;
        TextView prixView;
        TextView dateView;
        TextView horaireView;
        TextView prestationView;
        ImageButton btnDeleteView;
        ImageButton btnModificationView;
        ImageButton btnAvisView;
    }
    //Constructeur
    public RDVListAdapter(Context aContext, int layoutId, List<Rendez_vous> listData) {
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
        ViewHolder holder;
        //Identification des views qui seront utilisées.
        if (convertView == null) {
            convertView = layoutInflater.inflate(layoutId, parent, false);
            holder = new ViewHolder();
            holder.nomEntrepriseView = (TextView) convertView.findViewById(R.id.NomFournisseurLrdv);
            holder.horaireView = (TextView) convertView.findViewById(R.id.horaireLrdv);
            holder.dateView = (TextView) convertView.findViewById(R.id.dateLrdv);
            holder.prixView = (TextView) convertView.findViewById(R.id.prixLrdv);
            holder.prestationView = (TextView) convertView.findViewById(R.id.prestation);
            holder.btnDeleteView = (ImageButton) convertView.findViewById(R.id.deleteButton);
            holder.btnModificationView =(ImageButton) convertView.findViewById(R.id.modificationButton);
            holder.btnAvisView =(ImageButton) convertView.findViewById(R.id.avisButton);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //Récupération des données sur un rendez-vous.
        Rendez_vous rendez_vous = this.listData.get(position);

        //Ajout des données dans les views
        holder.nomEntrepriseView.setText(rendez_vous.getNomFournisseur());
        holder.horaireView.setText( rendez_vous.getHeure());
        holder.prixView.setText( rendez_vous.getPrix().toString());
        holder.dateView.setText( rendez_vous.getDate());
        holder.prestationView.setText( rendez_vous.getNomPrestation());
        holder.btnDeleteView.setTag(rendez_vous.getId_rdv());
        holder.btnModificationView.setTag(rendez_vous.getId_rdv());
        holder.btnAvisView.setTag(rendez_vous.getNomFournisseur());

        return convertView;



    }

}

