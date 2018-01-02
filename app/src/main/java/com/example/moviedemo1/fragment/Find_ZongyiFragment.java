package com.example.moviedemo1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.moviedemo1.adapter.ZongyiAdapter;
import com.example.moviedemo1.bean.ZongyiBean;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 九号 on 2017/12/15.
 */

public class Find_ZongyiFragment extends Fragment {

    @BindView(R.id.zongyiRecyclerView)
    RecyclerView zongyiRecyclerView;
    Unbinder unbinder;
    ZongyiAdapter adapter;
    List<ZongyiBean> zongyiBeans =  new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zongyi,null);
        unbinder = ButterKnife.bind(this, view);
//        initData();
        return view;
    }
    public void initData(){
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        zongyiRecyclerView.setLayoutManager(manager);
        adapter = new ZongyiAdapter(getActivity(),zongyiBeans);
        zongyiRecyclerView.setAdapter(adapter);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
