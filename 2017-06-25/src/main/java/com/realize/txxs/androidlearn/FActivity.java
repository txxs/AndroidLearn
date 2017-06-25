package com.realize.txxs.androidlearn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by txxs on 2017/6/25.
 * 两个监听器AdapterView.OnItemClickListener,AbsListView.OnScrollListener方法
 */

public class FActivity extends Activity implements AdapterView.OnItemClickListener,AbsListView.OnScrollListener{

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private SimpleAdapter simpleAdapter;
    private List<Map<String,Object>> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factivity);

        listView = (ListView)findViewById(R.id.list_view);
        /**
         * 1,新建一个数据适配器
         * ArrayAdapter(上下文，listview加载的每一个列表项所对应的布局文件，数据源)
         * 2、适配器加载数据源
         */
        String[] arry = {"学习1","学习2","学习3","学习4"};
        arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arry);
        /**
         * SimpleAdapter，参数解释：
         * context:上下文
         * data：    List<? extends Map<String,>>一个map所组成的集合，
         *          每个map都会对应一个listView的一行
         *          每个map必须包含所有在from中所指定的键
         * resource：列表项的布局文件ID
         * from:    map中的键名
         * to:      绑定数据视图ID，与from成对应关系
         */
        data = new ArrayList<Map<String,Object>>();
        simpleAdapter = new SimpleAdapter(this, getData(), R.layout.item,new String[]{"pic","tx"},new int[]{R.id.pic,R.id.tx});
        /**
         * 视图加载适配器，这里的视图就是listview
         */
        //listView.setAdapter(arrayAdapter);
        listView.setAdapter(simpleAdapter);
        //加载监听器
        listView.setOnItemClickListener(this);
        listView.setOnScrollListener(this);
    }

    private List<Map<String,Object>> getData(){
        for(int i=0;i<20;i++){
            Map<String,Object> oneData = new HashMap<>();
            //动态添加图片
            oneData.put("pic",R.mipmap.ic_launcher);
            oneData.put("tx","txxs"+i);
            data.add(oneData);
        }


        return data;
    }

    /**
     * 相关代码可以查看http://www.imooc.com/video/1623
     * @param view
     * @param scrollState
     */
    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String text = listView.getItemAtPosition(position)+"";
        Toast.makeText(this,"position"+position+"text"+text,Toast.LENGTH_LONG);

    }
}
