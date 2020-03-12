package com.example.munna.sonamonistudy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Tanvir on 27-Jul-18.
 */

public class PagerAdapter1 extends FragmentStatePagerAdapter {
    int sNoOfTabs;

    public PagerAdapter1(FragmentManager fm, int sNoOfTabs) {
        super(fm);
        this.sNoOfTabs = sNoOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                Tabs1 tabs1 = new Tabs1();
                return tabs1;
            case 1:
                Tabs2 tabs2 = new Tabs2();
                return tabs2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return sNoOfTabs;
    }
}
