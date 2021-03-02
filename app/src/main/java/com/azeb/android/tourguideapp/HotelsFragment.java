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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(R.string.address_hotel_title,
                R.string.address_hotel_address,
                R.drawable.address_hotel));
        places.add(new Places(R.string.buj_al_arab_title,
                R.string.buj_al_arab_address,
                R.drawable.buri_al_arab_hotel));
        places.add(new Places(R.string.burj_kalifa_title, R.string.burj_kelifa_address,
                R.drawable.burj_khalifa_));
        places.add(new Places(R.string.place_downtown_title,
                R.string.place_downtown_address,
                R.drawable.palace_downtown));
        places.add(new Places(R.string.radisson_blue_title,
                R.string.radisson_blue_address,
                R.drawable.radisson_blu_hotel));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.greenBlue);
        ListView listView = (ListView) rootView.findViewById(R.id.place);
        listView.setAdapter(placeAdapter);
        return rootView;
    }

}
