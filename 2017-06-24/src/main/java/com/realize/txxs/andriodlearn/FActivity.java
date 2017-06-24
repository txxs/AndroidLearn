package com.realize.txxs.andriodlearn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by txxs on 2017/6/24.
 * 创建完清单文件，要去AndroidManifest.xml中去声明
 */

public class FActivity extends Activity {

    private Button buttonf;
    private Button buttons;
    private TextView textView;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //为当前的Activity创建布局文件
        super.onCreate(savedInstanceState);
        //通过此文件绑定对应的xml文件
        setContentView(R.layout.factivity);
        /**
         * 第一种方式：通过startActivity实现页面间的跳转
         * 初始换Intent
         */
        context=this;
        buttonf  = (Button)findViewById(R.id.button_f);
        buttonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * 第一个参数，上下文对象（就是当前的对象）
                 * 第二个参数，目标文件，这样就可以通过意图进行页面间的跳转
                 */
                Intent intent = new Intent(context,SActivity.class);
                //执行这个意图
                startActivity(intent);
            }
        });

        /**
         * 第二种方式：通过startActivityforResult，获取结果的方式获取，需要两个方法配合
         */
        buttons = (Button)findViewById(R.id.button_s);
        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,SActivity.class);
                //第一个参数是意图，第二个是请求的标识
                startActivityForResult(intent,1);
            }
        });

        textView = (TextView) findViewById(R.id.textView);

    }

    /**
     * 接受返回数据的方法
     * @param requestCode 标识，和上边的 标识对应，如果有多个的话button返回的数据，按照标识寻找
     * @param resultCode 第二个页面返回的标志
     * @param data 第二个页面回传的数据
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1&&resultCode==2){
            textView.setText(data.getStringExtra("data"));
        }
    }
}
