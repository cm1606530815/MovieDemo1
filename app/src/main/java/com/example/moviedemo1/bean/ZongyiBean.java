package com.example.moviedemo1.bean;

import android.widget.ImageView;

/**
 * Created by 九号 on 2017/12/16.
 */

public class ZongyiBean {
    ImageView imageView;
    String name;
    String time;
    String address;
    String free;

    public ZongyiBean(ImageView imageView, String name, String time, String address, String free) {
        this.imageView = imageView;
        this.name = name;
        this.time = time;
        this.address = address;
        this.free = free;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }
}
