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
public class SafariWaterFragment extends Fragment {


    public SafariWaterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place, container, false);
        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(R.string.atlantis_title,
                R.string.atlantis_address,
                R.drawable.atlanis));
        places.add(new Places(R.string.dubai_safari_park_title,
                R.string.dubai_safari_park_address,
                R.drawable.dubaisafari_main));
        places.add(new Places(R.string.jbr_title,
                R.string.jbr_address,
                R.drawable.jbr_beach));
        places.add(new Places(R.string.jumera_title,
                R.string.jumera_address,
                R.drawable.jumeirah));
        places.add(new Places(R.string.wild_wadi_title,
                R.string.wild_wadi_address,
                R.drawable.wildwadi));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.greenBlue);
        ListView listView = (ListView) rootView.findViewById(R.id.place);
        listView.setAdapter(placeAdapter);
        return rootView;
    }

}
