package com.azeb.android.tourguideapp;

public class Places {

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mNameOfPlace;
    private int mAddressOfPlace;
    private int mImageId = NO_IMAGE_PROVIDED;

    public Places(int nameOfPlace, int addressOfPlace, int imageId) {
        mNameOfPlace = nameOfPlace;
        mAddressOfPlace = addressOfPlace;
        mImageId = imageId;
    }

    public int getmNameOfPlace() {
        return mNameOfPlace;
    }

    public int getmAddressOfPlace() {
        return mAddressOfPlace;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }

    public int getmImageId() {
        return mImageId;
    }
}


