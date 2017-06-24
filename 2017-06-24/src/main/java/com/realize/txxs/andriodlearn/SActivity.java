package com.realize.txxs.andriodlearn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by txxs on 2017/6/24.
 */

public class SActivity extends Activity {

    private Button button;

    /**
     * 创建页面使用的方法
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sactivity);
        /**
         * 第二个页面什么时候给第一个页面回传数据
         * 回传到第一个页面的数据其实是一个Intent对象
         */
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                //类似于map的数据
                intent.putExtra("data","这是第二个页面的数据！");
                //通过这个方法将数据回传到第一个页面
                //根据请求吗和结果嘛判断数据的回传情况！
                setResult(2,intent);
                //结束当前页面
                finish();
            }
        });
    }


}
