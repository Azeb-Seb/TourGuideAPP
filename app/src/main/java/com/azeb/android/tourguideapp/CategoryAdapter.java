package com.azeb.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new MallsFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new MarketFragment();
        } else {
            return new SafariWaterFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.malls);
        } else if (position == 1) {
            return mContext.getString(R.string.hotel);
        } else if (position == 2) {
            return mContext.getString(R.string.market_suke);
        } else {
            return mContext.getString(R.string.safari_waterpark);
        }

    }
}
