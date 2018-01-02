package com.example.moviedemo1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.moviedemo1.bean.ZongyiBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 九号 on 2017/12/16.
 */

public class ZongyiAdapter extends RecyclerView.Adapter<ZongyiAdapter.MyViewHolder> {
    String url = "http://www.iyi8.com/uploadfile/2016/1215/20161215123150448.jpg";
    Context context;
    List<ZongyiBean> zongyiBeans = new ArrayList<>();

    public ZongyiAdapter(Context context,List<ZongyiBean> zongyiBeans){
        this.context = context;
        this.zongyiBeans = zongyiBeans;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_zongyi, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.zongyiImage.setImageURI(url);
        holder.zongyiName.setText(zongyiBeans.get(position).getName());
        holder.zongyiTime.setText(zongyiBeans.get(position).getTime());
        holder.zongyiAddress.setText(zongyiBeans.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.zongyiImage)
        SimpleDraweeView zongyiImage;
        @BindView(R.id.zongyiName)
        TextView zongyiName;
        @BindView(R.id.zongyiTime)
        TextView zongyiTime;
        @BindView(R.id.zongyiAddress)
        TextView zongyiAddress;
        @BindView(R.id.zongyiFree)
        TextView zongyiFree;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(itemView);

        }
    }
}
