package com.example.moviedemo1.bean;

import android.widget.ImageView;

/**
 * Created by 九号 on 2017/12/16.
 */

public class AllBean {
    String title;
    ImageView imageView;
    String kind;
    String money;
    String address;


    public AllBean(String title, ImageView imageView, String kind, String money, String address) {
        this.title = title;
        this.imageView = imageView;
        this.kind = kind;
        this.money = money;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
