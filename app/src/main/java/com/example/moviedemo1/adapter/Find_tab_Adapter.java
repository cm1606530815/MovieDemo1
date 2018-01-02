package com.example.moviedemo1.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;

/**
 * Created by 九号 on 2017/12/15.
 */

public class Find_tab_Adapter extends FragmentPagerAdapter{

    private List<Fragment> list_fragment;                         //fragment列表
    private List<String> list_Title;                              //tab名的列表


    public Find_tab_Adapter(FragmentManager fm,List<Fragment> list_fragment,List<String> list_Title) {
        super(fm);
        this.list_fragment = list_fragment;
        this.list_Title = list_Title;
    }

    @Override
    public Fragment getItem(int position) {
        return list_fragment.get(position);
    }

    @Override
    public int getCount() {
        return list_Title.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {

        return list_Title.get(position);

    }
}
