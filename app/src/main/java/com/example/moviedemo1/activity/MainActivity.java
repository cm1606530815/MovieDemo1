package com.example.moviedemo1.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.moviedemo1.fragment.Fragment1;
import com.example.moviedemo1.fragment.Fragment2;
import com.example.moviedemo1.fragment.Fragment3;
import com.example.moviedemo1.fragment.Fragment4;
import com.hjm.bottomtabbar.BottomTabBar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bottomTab)
    BottomTabBar bottomTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getSupportActionBar().hide();
        bottomTab.init(getSupportFragmentManager())
                .setChangeColor(Color.RED,Color.GRAY)
                .addTabItem("活动",R.mipmap.ic_launcher,Fragment1.class)
                .addTabItem("发布",R.mipmap.ic_launcher,Fragment2.class)
                .addTabItem("管理",R.mipmap.ic_launcher,Fragment3.class)
                .addTabItem("我的",R.mipmap.ic_launcher,Fragment4.class);
    }
}
