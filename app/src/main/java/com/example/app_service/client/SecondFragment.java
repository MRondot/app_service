package com.example.app_service.client;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.app_service.R;
import com.example.app_service.classes.RDVListAdapter;
import com.example.app_service.classes.Rendez_vous;

import java.util.ArrayList;
import java.util.List;


public class SecondFragment extends Fragment {


        String [] rdvList = {"Coupt'if","21/05/22","12.30","23"};

        public SecondFragment(){
            // require a empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

                View view = inflater.inflate(R.layout.fragment_second, container, false);


                List<Rendez_vous> rdv = getListData();
                ListView listView = (ListView) view.findViewById(R.id.listViewRDV);
                RDVListAdapter RDVListAdapter = new RDVListAdapter(requireContext(),R.layout.list_rdv_layout, rdv);
                listView.setAdapter(RDVListAdapter);



                return view;


        }
        public List<Rendez_vous> getListData() {
                List<Rendez_vous> list = new ArrayList<Rendez_vous>();
                Rendez_vous r1 = new Rendez_vous("Coup t'if", "21/05/22", "12.30",23,"coupe",3);
                Rendez_vous r2 = new Rendez_vous("Couph'air", "25/05/22", "10.30",43,"coloration",2);
                Rendez_vous r3 = new Rendez_vous("Mot'if", "28/05/22", "8.00",5,"shampoing",1);


                list.add(r1);
                list.add(r2);
                list.add(r3);

                return list;
        }


}
