package com.realize.txxs.androidlearn;

import android.annotation.SuppressLint;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button loginButton;
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 在Java代码中要找到界面中的button就需要绑定，通过findViewById,找到对应的ID，与Java中的控件绑定
         * findViewById返回的是一个view，view是所有控件的父类
         * R就代表资源
         **/
        loginButton = (Button) findViewById(R.id.button);
        imageButton = (ImageButton)findViewById(R.id.imageButton) ;
        /**
         * 通过匿名内部类的方式实现
         */
        loginButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onClick(View v) {
                //在onClick监听点击事件
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("确认")
                        .setMessage("确定吗")
                        .setPositiveButton("是",null)
                        .setNegativeButton("否",null)
                        .show();
                Toast.makeText(MainActivity.this,"测试显示的样式",Toast.LENGTH_LONG).show();
            }
        });

        imageButton.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    public void onClick(View v) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("通过实现接口的方式实现监听")
                .setMessage("确定吗")
                .setPositiveButton("是",null)
                .setNegativeButton("否",null)
                .show();
    }
}
