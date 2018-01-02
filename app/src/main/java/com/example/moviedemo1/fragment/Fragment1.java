package com.example.moviedemo1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.moviedemo1.adapter.Find_tab_Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 九号 on 2017/12/15.
 */

public class Fragment1 extends Fragment implements View.OnClickListener{

    private TabLayout tabLayout;                            //定义TabLayout
    private ViewPager viewPager;
    private FragmentPagerAdapter fAdapter;
    private List<Fragment> list_fragment;                                //定义要装fragment的列表
    private List<String> list_title;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1,null);
        tabLayout = view.findViewById(R.id.tabLayout);
        viewPager = view.findViewById(R.id.viewPager);
        initData();
        viewPager.setAdapter(new Find_tab_Adapter(getActivity().getSupportFragmentManager(),list_fragment,list_title));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        return view;
    }

    private void initData() {
        list_title = new ArrayList<>();
        list_title.add("全部");
        list_title.add("综艺娱乐");
        list_title.add("财经访谈");
        list_title.add("文化旅游");
        list_title.add("时尚体育");
        list_title.add("青少科教");
        list_title.add("养生保健");
        list_title.add("公益");
        list_fragment = new ArrayList<>();
        list_fragment.add(new Find_AllFragment());
        list_fragment.add(new Find_ZongyiFragment());
        list_fragment.add(new Find_CaijingFragment());
        list_fragment.add(new Find_WenhuaFragment());
        list_fragment.add(new Find_ShishangFragment());
        list_fragment.add(new Find_QingshaoFragment());
        list_fragment.add(new Find_YangshengFragment());
        list_fragment.add(new Find_GongyiFragment());
    }

    @Override
    public void onClick(View view) {

    }
}
