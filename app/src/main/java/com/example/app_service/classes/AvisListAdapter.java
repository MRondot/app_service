package com.example.app_service.classes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.app_service.R;

import java.util.List;


//Adapter pour la liste d'avis, depuis ListeAvisReservation
public class AvisListAdapter extends BaseAdapter {


    //Liste des données concernant les avis.
    private List<AvisPost> listData;



    private LayoutInflater layoutInflater;
    private Context context;
    private int layoutId;

    //Conservation des données grâce à un Holder
    static class ViewHolder {
        TextView descriptionView;
        TextView noteView;

    }
    //Constructeur
    public AvisListAdapter(Context aContext, int layoutId, List<AvisPost> listData) {
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
        AvisListAdapter.ViewHolder holder;
        //Identification des views qui seront utilisées.
        if (convertView == null) {

            convertView = layoutInflater.inflate(layoutId, parent, false);
            holder = new AvisListAdapter.ViewHolder();
            holder.descriptionView = (TextView) convertView.findViewById(R.id.DescriptionAvis);
            holder.noteView = (TextView) convertView.findViewById(R.id.FAvisNote);

            convertView.setTag(holder);
        } else {
            holder = (AvisListAdapter.ViewHolder) convertView.getTag();
        }
        //Récupération des données sur un avis.
        AvisPost avis = this.listData.get(position);
        //Ajout des données dans les views
        holder.descriptionView.setText( avis.getDescription());
        holder.noteView.setText(avis.getNote().toString() + "/5");


        return convertView;

    }

}
