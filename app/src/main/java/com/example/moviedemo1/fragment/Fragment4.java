package com.example.moviedemo1.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.moviedemo1.activity.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 九号 on 2017/12/15.
 */

public class Fragment4 extends Fragment {
    @BindView(R.id.lingdang)
    ImageView lingdang;
    @BindView(R.id.shezhi)
    ImageView shezhi;
    @BindView(R.id.ll)
    RelativeLayout ll;
    @BindView(R.id.head)
    ImageView head;
    @BindView(R.id.lll)
    RelativeLayout lll;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment4, null);
        unbinder = ButterKnife.bind(this, view);
        head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LoginActivity.class));
            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
