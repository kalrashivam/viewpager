package com.example.engineers_workbook.mypager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by hp on 29-10-2017.
 */

public class PagerAdaptornew extends FragmentPagerAdapter {

    public PagerAdaptornew(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BlankFragment();
        } else if (position == 1){
            return new sFragment();
        } else if (position == 2) {
            return new fourth();
        } else {
            return new BlankFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0: return "blank";

            case 1: return " s";

            case 2: return "fourth";
                    
            default:return null;
        }
    }
}
