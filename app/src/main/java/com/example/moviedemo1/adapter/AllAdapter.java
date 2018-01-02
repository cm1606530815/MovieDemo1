package com.example.moviedemo1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moviedemo1.bean.AllBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 九号 on 2017/12/16.
 */

public class AllAdapter extends RecyclerView.Adapter<AllAdapter.MyViewHolder> {

    Context context;
    List<AllBean> allBeans = new ArrayList<>();

    public AllAdapter(Context context, List<AllBean> allBeans) {
        this.context = context;
        this.allBeans = allBeans;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.all_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.allRecyclerTitle.setText(allBeans.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.all_recycler_title)
        TextView allRecyclerTitle;
        @BindView(R.id.all_recycler_kind)
        TextView allRecyclerKind;
        @BindView(R.id.all_recycler_image)
        ImageView allRecyclerImage;
        @BindView(R.id.all_recycler_money)
        TextView allRecyclerMoney;
        @BindView(R.id.all_recycler_address)
        TextView allRecyclerAddress;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
