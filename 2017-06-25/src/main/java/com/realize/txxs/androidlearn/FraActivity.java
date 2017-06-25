package com.realize.txxs.androidlearn;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by txxs on 2017/6/25.
 */

public class FraActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在这个Activity中加载定义的Fragment中的内容
        setContentView(R.layout.fractivity);
        Button button = (Button)findViewById(R.id.buttonf);
        button.setText("改变");
        textView = (TextView)findViewById(R.id.textf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("framen中的值发生改变了");
            }
        });
    }
}
