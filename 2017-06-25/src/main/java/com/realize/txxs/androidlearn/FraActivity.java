package com.realize.txxs.androidlearn;


import android.app.Activity;
import android.os.Bundle;

/**
 * Created by txxs on 2017/6/25.
 */

public class FraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在这个Activity中加载定义的Fragment中的内容
        setContentView(R.layout.fractivity);
    }
}
