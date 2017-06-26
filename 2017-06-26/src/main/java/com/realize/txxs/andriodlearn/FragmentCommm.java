package com.realize.txxs.andriodlearn;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by txxs on 2017/6/26.
 */

public class FragmentCommm extends Fragment {

    //1、在继承Activity的类里要有个有参数的方法接收传过来的值；
    // 2、想办法在继承Fragment的类中，将Activity对象找到，然后将该值赋予该对象中的方法里，从而就实现了传值。
    //Fragment向Activity发送的数据
    private String backText = "收到数据，回传";

    private Mylistener mylistener;
    //监听器，监听来自activity
    public interface Mylistener{
         void thank(String args);
    }

    //Fragment添加到activity中需要调用的方法
    @Override
    public void onAttach(Context context) {
        mylistener = (Mylistener)context;
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentcommi,container,false);
        TextView textView = (TextView) view.findViewById(R.id.textview);
        String text = getArguments().get("name")+"";
        textView.setText(text);
        Toast.makeText(getActivity(),"接受数据"+text,Toast.LENGTH_LONG).show();
        mylistener.thank(backText);
        return view;
    }
}
