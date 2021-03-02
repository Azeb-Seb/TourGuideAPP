package com.azeb.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MallsFragment extends Fragment {

    public MallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(R.string.al_ghurair_title,
                R.string.al_ghurair_address,
                R.drawable.al_ghurair));
        places.add(new Places(R.string.batuta_title,
                R.string.batuta_address,
                R.drawable.battuta_mall));
        places.add(new Places(R.string.burjuman_title,
                R.string.burjuman_address,
                R.drawable.burjuman_mall));
        places.add(new Places(R.string.city_center_title,
                R.string.city_center_address,
                R.drawable.city_center));
        places.add(new Places(R.string.emirates_mall_title,
                R.string.emirates_mall_address,
                R.drawable.emirates_mall));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.yellow);
        ListView listView = (ListView) rootView.findViewById(R.id.place);
        listView.setAdapter(placeAdapter);
        return rootView;
    }

}
