package com.realize.txxs.androidlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//布局文件
        Button button = (Button) findViewById(R.id.btn_as);
//不同分辨率的资源文件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
//value文件的不同名称对应不同的版本，字体、样式、风格和颜色等
    }
//整个项目的清单文件
}
