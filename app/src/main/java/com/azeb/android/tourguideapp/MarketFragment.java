package com.azeb.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MarketFragment extends Fragment {


    public MarketFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(R.string.bur_dubai_suke_title,
                R.string.bur_dubai_suk_address,
                R.drawable.bur_dubai_souk));
        places.add(new Places(R.string.dubai_gold_suk_title,
                R.string.dubai_gold_suk_address,
                R.drawable.gold_souk));
        places.add(new Places(R.string.textile_suk_title,
                R.string.textile_suk_address,
                R.drawable.textil_souk));
        places.add(new Places(R.string.souk_medinati_jumera_title,
                R.string.souk_medinati_jumera_address,
                R.drawable.madinat_jumerirah));
        places.add(new Places(R.string.dubai_spice_market_title,
                R.string.dubai_spice_market_address,
                R.drawable.spice_market));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.redOrange);
        ListView listView = (ListView) rootView.findViewById(R.id.place);
        listView.setAdapter(placeAdapter);
        return rootView;
    }

}
