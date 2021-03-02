package com.azeb.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Places> {

    private int mColorId;

    public PlaceAdapter(Activity activity, ArrayList<Places> places, int colorId) {
        super(activity, 0, places);
        mColorId = colorId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, parent, false);
        }
        Places currentPlaces = getItem(position);
        TextView nameOfPlace = (TextView) listItemView.findViewById(R.id.place);
        nameOfPlace.setText(currentPlaces.getmNameOfPlace());
        TextView addressOfPlace = (TextView) listItemView.findViewById(R.id.adress);
        addressOfPlace.setText(currentPlaces.getmAddressOfPlace());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageOfPlace);

        if (currentPlaces.hasImage()) {
            imageView.setImageResource(currentPlaces.getmImageId());
            imageView.setVisibility(View.VISIBLE);
        } else
            imageView.setVisibility(View.GONE);
        View containerView = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorId);
        containerView.setBackgroundColor(color);
        return listItemView;
    }
}

