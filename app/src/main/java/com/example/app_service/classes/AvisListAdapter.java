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

public class AvisListAdapter extends BaseAdapter {

    private List<AvisPost> listData;
    private LayoutInflater layoutInflater;
    private Context context;
    private int layoutId;

    static class ViewHolder {
        TextView descriptionView;
        TextView noteView;

    }

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
        if (convertView == null) {
            convertView = layoutInflater.inflate(layoutId, parent, false);
            holder = new AvisListAdapter.ViewHolder();
            holder.descriptionView = (TextView) convertView.findViewById(R.id.DescriptionAvis);
            holder.noteView = (TextView) convertView.findViewById(R.id.FAvisNote);

            convertView.setTag(holder);
        } else {
            holder = (AvisListAdapter.ViewHolder) convertView.getTag();
        }
        AvisPost avis = this.listData.get(position);

        holder.descriptionView.setText( avis.getDescription());
        holder.noteView.setText(avis.getNote().toString() + "/5");

        return convertView;

    }

}
