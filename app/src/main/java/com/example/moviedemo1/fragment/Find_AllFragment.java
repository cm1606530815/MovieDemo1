package com.example.moviedemo1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.moviedemo1.R;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 九号 on 2017/12/15.
 */

public class Find_AllFragment extends Fragment {

    @BindView(R.id.banner)
    Banner banner;
    Unbinder unbinder;
    List<String> list = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all, null);
        unbinder = ButterKnife.bind(this, view);
        initBannerData();
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
    private void initBannerData(){
        list.add("http://www.iyi8.com/uploadfile/2016/1215/20161215123150448.jpg");
        list.add("http://www.iyi8.com/uploadfile/2016/1214/20161214115225348.jpg");
        list.add("http://www.iyi8.com/uploadfile/2016/1129/20161129110133640.jpg");
        list.add("http://www.iyi8.com/uploadfile/2016/1129/20161129112436381.jpg");
        list.add("http://www.iyi8.com/uploadfile/2016/1215/20161215120822999.jpg");
        banner.setImages(list);
        banner.setBannerStyle(Banner.CIRCLE_INDICATOR);
        banner.setDelayTime(3000);
    }

}
