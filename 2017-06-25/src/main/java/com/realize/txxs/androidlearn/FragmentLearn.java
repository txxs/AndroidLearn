package com.realize.txxs.androidlearn;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by txxs on 2017/6/25.
 */

public class FragmentLearn extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //layout布局文件转化成一个view对象,把Fragment添加到activity中
        /**
         * resource：Fragment需要加载的布局文件
         * root：加载layout的父viewGroup
         * attachtoRoot:false不返回父viewGroup
         */
        View view = inflater.inflate(R.layout.fragmentlearn,container,false);
        TextView textView = (TextView) view.findViewById(R.id.textf);
        textView.setText("转变为静态加载！");
        return view;
    }
}
